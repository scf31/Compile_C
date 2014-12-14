package main;


import generated.MathExprLexer;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;

import java.util.ArrayList;
import java.util.HashMap;

import static main.SemanticChecker.DataType.*;

/**
 * Created by max on 07.12.2014.
 */
public class SemanticChecker {

    public enum IdentifierType {

        GLOBAL, LOCAL, PARAM, FUNCTION;

    }



    public enum DataType {

        VOID, INT, DOUBLE, BOOL;

    }



    public class Identifier {

        public String name;

        public IdentifierType identifierType;

        public DataType dataType;

        public AstNode node;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public IdentifierType getIdentifierType() {
            return identifierType;
        }

        public void setIdentifierType(IdentifierType identifierType) {
            this.identifierType = identifierType;
        }

        public DataType getDataType() {
            return dataType;
        }

        public void setDataType(DataType dataType) {
            this.dataType = dataType;
        }

        public AstNode getNode() {
            return node;
        }

        public void setNode(AstNode node) {
            this.node = node;
        }

        public Identifier(String name, IdentifierType identifierType, DataType dataType, AstNode node) {

            this.name = name;

            this.identifierType = identifierType;

            this.dataType = dataType;

            this.node = node;

        }

    }



    private static DataType strToDataType(String type) throws SemanticException {
        if (type.equals("int")) {
            return INT;
        } else if (type.equals("double")) {
            return DOUBLE;
        } else if (type.equals("bool")) {
            return BOOL;
        } else if (type.equals("void") || type.equals("")) {
            return VOID;
        } else {
            throw new SemanticException("Invalid data type");
        }
    }

    public static String dataTypeToStr(DataType dataType){
        switch (dataType){
            case INT:
                return "int";
            case DOUBLE:
                return "double";
            case BOOL:
                return "bool";
            case VOID:
                return "void";
            default:
                return "unknown";
        }
    }


    private void convert(AstNode node, DataType dataType)
    {
        AstNode convert = new AstNode(new CommonToken(MathExprLexer.CALL, "CONVERT"));
        node.getParent().setChild(node.getChildIndex(), convert);
        convert.dataType = dataType;
        convert.addChild(node);
        convert.addChild(new AstNode(new CommonToken(MathExprLexer.IDENTIFIER, dataTypeToStr(dataType))));
    }

    public void CheckBlock(AstNode node, Context context) throws SemanticException{
        for (int i = 0; i < node.getChildCount(); i++)
            Check((AstNode)node.getChild(i), context);
    }

    public DataType Check(AstNode node, Context context) throws SemanticException{
        switch (node.getType()){
            case MathExprLexer.PROGRAM:{
                if (context == null)
                    context = new Context(context);
                CheckBlock(node, context);
                return VOID;
            }
            case MathExprLexer.BLOCK:{
                context = new Context(context);
                CheckBlock(node, context);
                return VOID;
            }

            case MathExprLexer.VAR: {
                ArrayList<AstNode> nodes = new ArrayList<AstNode>();
                DataType dataType = strToDataType(node.getChild(0).getText());
                for (int i = 0; i < node.getChild(0).getChildCount(); i++){
                    AstNode temp = (AstNode) node.getChild(0).getChild(i);
                    if (temp.getToken().getType() == MathExprLexer.ASSIGN){
                        Identifier ident = context.getIdentifier(temp.getChild(0).getText()); //нет перекрытия переменных
                        if (ident != null)
                            throw new SemanticException("Identifier "+ temp.getChild(0).getText() +" already exists");
                        AstNode var = new AstNode(new CommonToken(MathExprLexer.VAR, "VAR"));
                        var.addChild(new AstNode(new CommonToken(MathExprLexer.IDENTIFIER, dataTypeToStr(dataType))));
                        var.getChild(0).addChild(new AstNode(new CommonToken(MathExprLexer.IDENTIFIER, temp.getChild(0).getText())));
                        nodes.add(var);
                        nodes.add(temp);
                    }
                    else
                    {
                        Identifier ident = context.getIdentifier(temp.getText());
                        if (ident != null)
                            throw new SemanticException("Identifier "+ temp.getText()+" already exists");
                        AstNode var = new AstNode(new CommonToken(MathExprLexer.VAR, "VAR"));
                        var.addChild(new AstNode(new CommonToken(MathExprLexer.IDENTIFIER, dataTypeToStr(dataType))));
                        var.getChild(0).addChild(temp);
                        nodes.add(var);
                    }
                    String name = nodes.get(0).getChild(0).getChild(0).getText();
                    context.setIdentifier(name, new Identifier(name, context.parentContext == null ? IdentifierType.GLOBAL : IdentifierType.LOCAL, dataType, nodes.get(0)));

                    CommonTree tree = new CommonTree();
                    for (AstNode n : nodes)
                    tree.addChild(n);
                    node.parent.replaceChildren(node.getChildIndex(), node.getChildIndex(), tree);
                }

                return VOID;

            }

            case MathExprLexer.FUNCTION:
            {
                DataType dataType = strToDataType(node.getChild(0).getText());
                String name = node.getChild(1).getText();
                Identifier ident = context.getIdentifier(name);
                if (ident != null)
                    throw new SemanticException("Identifier "+ name +" already exists");
                Identifier func = new Identifier(name, IdentifierType.FUNCTION, dataType, node);
                context.setIdentifier(name,func);
                context = new Context(context);
                AstNode _params = (AstNode) node.getChild(2);
                for (int i = 0; i < _params.getChildCount(); i++)
                {
                    DataType paramDataType = strToDataType(_params.getChild(i).getText());
                    String paramName = _params.getChild(i).getChild(0).getText();
                    if (paramDataType == VOID)
                        throw new SemanticException("In function "+ name +" void param " + paramName);
                    context.setIdentifier(paramName, new Identifier(paramName, IdentifierType.PARAM, paramDataType, (AstNode) _params.getChild(i)));
                }
                context.setFunction(func);
                DataType returnType = strToDataType(node.getChild(0).getText());
                boolean returnExists = false;

                if (returnType != VOID)
                {
                    for (int i = 0; i < node.getChild(3).getChildCount(); i++)
                        if (node.getChild(3).getChild(i).getText().equals("return"))
                            returnExists = true;


                    if (!returnExists)
                        throw new SemanticException("In function "+ name +" no return data");
                }
                CheckBlock((AstNode)node.getChild(3), context);
                return VOID;
            }

            case MathExprLexer.CALL:
            {
                Identifier ident = context.getIdentifier(node.getChild(0).getText());
                if (ident == null)
                    throw new SemanticException("Unknown identifier " + node.getChild(0).getText());
                if (ident.getIdentifierType() != IdentifierType.FUNCTION)
                    throw new SemanticException("Identifier "+ node.getChild(0).getText() +" is not a  function");
                if (node.getChild(1).getChildCount() != ident.node.getChild(2).getChildCount())
                    throw new SemanticException("Not equals params count in function " + node.getChild(0).getText());
                for (int i = 0; i < ident.node.getChild(2).getChildCount(); i++) {
                    DataType formalDataType = strToDataType(ident.node.getChild(2).getChild(i).getText());
                    DataType factDataType = Check((AstNode)node.getChild(1).getChild(i), context);
                    if (formalDataType != factDataType)
                    {
                        if (formalDataType == DOUBLE && factDataType == INT)
                            convert((AstNode)node.getChild(1).getChild(i), DOUBLE);
                        else
                            throw new SemanticException("In function "+ node.getChild(0).getText() +" param "+ i+1 +" incompatible types "+ dataTypeToStr(formalDataType) +" "+dataTypeToStr(factDataType));
                    }
                }
                return strToDataType(ident.node.getChild(0).getText());
            }

            case MathExprLexer.IDENTIFIER:
            {
                Identifier ident = context.getIdentifier(node.getText());
                if (ident == null)
                    throw new SemanticException("Unknown identifier " + node.getText());
                if (ident.getIdentifierType() == IdentifierType.FUNCTION)
                {
                    if (ident.getDataType() == VOID)
                        throw new SemanticException("Function "+ ident.name +" returns void");
                    if (ident.node.getChild(1).getChildCount() > 0)
                        throw new SemanticException("No params for function "+ ident.name +" call");
                    AstNode call = new AstNode(new CommonToken(MathExprLexer.CALL));
                    call.addChild(node);
                    call.addChild(new AstNode(new CommonToken(MathExprLexer.PARAMETERS)));
                    node.parent.setChild(node.getChildIndex(), call);

                    node.setDataType(ident.getDataType());
                    return node.getDataType();
                }
                else
                {
                    node.setDataType(ident.getDataType());
                    return node.getDataType();
                }
            }

            case MathExprLexer.NUMBER:
            {
                node.setDataType(node.getText().contains(".") ? DOUBLE : INT);
                return node.getDataType();
            }

            case MathExprLexer.TRUE:
            case MathExprLexer.FALSE:
            {
                node.setDataType(BOOL);
                return node.getDataType();
            }

            case MathExprLexer.ASSIGN:
            {
                Identifier ident = context.getIdentifier(node.getChild(0).getText());
                if (ident == null)
                    throw new SemanticException("Unknown identifier "+ node.getChild(0).getText());
                if (ident.getIdentifierType() == IdentifierType.FUNCTION)
                    throw new SemanticException("Assign to function "+ node.getChild(0).getText());
                DataType rightDataType = Check((AstNode) node.getChild(1), context);
                if (ident.getDataType() != rightDataType)
                {
                    if (ident.getDataType() == DOUBLE && rightDataType == INT)
                        convert((AstNode) node.getChild(1), DOUBLE);
                    else
                        throw new SemanticException("Assign incompatible types " + dataTypeToStr(ident.getDataType()) +" "+ dataTypeToStr(rightDataType));
                }
                return VOID;
            }

            case MathExprLexer.RETURN:
            {
                if (context.getFunction() == null)
                    throw new SemanticException("Return not in function in line "+ node.getLine());

                DataType returnDataType = Check((AstNode) node.getChild(0), context);
                if (context.getFunction().getDataType() != returnDataType)
                {
                    if (context.getFunction().getDataType() == DOUBLE && returnDataType == INT)
                        convert((AstNode) node.getChild(0), DOUBLE);
                    else
                        throw new SemanticException("Return incompatible types "+ dataTypeToStr(context.getFunction().getDataType())+ "/"+ dataTypeToStr(returnDataType));
                }
                return VOID;
            }

            case MathExprLexer.ADD:
            case MathExprLexer.SUB:
            case MathExprLexer.MUL:
            case MathExprLexer.DIV:
            case MathExprLexer.GE:
            case MathExprLexer.LE:
            case MathExprLexer.NOTEQUALS:
            case MathExprLexer.EQUALS:
            case MathExprLexer.GT:
            case MathExprLexer.LT:
            {
                boolean compareOperation = true;
                switch (node.getType()) {
                    case MathExprLexer.ADD:
                    case MathExprLexer.SUB:
                    case MathExprLexer.MUL:
                    case MathExprLexer.DIV:
                        compareOperation = false;
                        break;
                }

                DataType leftDataType = Check((AstNode) node.getChild(0), context);
                DataType rightDataType = Check((AstNode) node.getChild(1), context);
                if (leftDataType != DOUBLE && leftDataType != INT)
                    throw new SemanticException("Left operand invalid type for operation "+ node.getText() +", line = "+ node.getLine() +", pos = " + node.getTokenStartIndex());
                if (rightDataType != DOUBLE && rightDataType != INT)
                    throw new SemanticException("Right operand invalid type for operation "+ node.getText() +", line = "+ node.getLine() +", pos = " + node.getTokenStartIndex());
                if (leftDataType == DOUBLE)
                {
                    if (rightDataType == INT)
                        convert((AstNode)node.getChild(1), DOUBLE);
                    node.setDataType(compareOperation ? BOOL : DOUBLE);
                    return node.getDataType();
                }
                if (rightDataType == DOUBLE)
                {
                    if (leftDataType == INT)
                        convert((AstNode)node.getChild(0), DOUBLE);
                    node.setDataType(compareOperation ? BOOL : DOUBLE);
                    return node.getDataType();
                }
                node.setDataType(compareOperation ? BOOL : INT);
                return node.getDataType();
            }

            case MathExprLexer.NOT:
            {
                DataType dataType = Check((AstNode) node.getChild(0), context);
                if (dataType != BOOL)
                    throw new SemanticException("Not operator with type " + dataTypeToStr(dataType));
                node.setDataType(BOOL);
                return node.getDataType();
            }

            case MathExprLexer.AND:
            case MathExprLexer.OR:
            case MathExprLexer.XOR:
            {
                DataType leftDataType = Check((AstNode) node.getChild(0), context);
                DataType rightDataType = Check((AstNode) node.getChild(1), context);
                if (leftDataType != BOOL && rightDataType != BOOL)
                    throw new SemanticException(node.getText()+" operator with type "+ dataTypeToStr(leftDataType)+ ", "+ dataTypeToStr(rightDataType));
                node.setDataType(BOOL);
                return node.getDataType();
            }

            case MathExprLexer.WHILE:
            {
                DataType condDataType = Check((AstNode)node.getChild(0), context);
                if (condDataType != BOOL)
                    throw new SemanticException("In while condition type is " + dataTypeToStr(condDataType));
                // context = new Context(context);
                Check((AstNode)node.getChild(1), context);
                return VOID;
            }

            case MathExprLexer.IF:
            {
                DataType condDataType = Check((AstNode)node.getChild(0), context);
                if (condDataType != BOOL)
                    throw new SemanticException("In if condition type is "+ dataTypeToStr(condDataType));
                // context = new Context(context);
                Check((AstNode)node.getChild(1), context);
                if (node.getChildCount() == 3)
                    Check((AstNode)node.getChild(2), context);
                return VOID;
            }

            case MathExprLexer.FOR:
            {
                context = new Context(context);
                CheckBlock((AstNode) node.getChild(0), context);
                DataType condDataType = Check((AstNode)node.getChild(1), context);
                if (condDataType != BOOL)
                    throw new SemanticException("In while condition type is " + dataTypeToStr(condDataType));
                CheckBlock((AstNode)node.getChild(2), context);
                Check((AstNode)node.getChild(3), context);
                return VOID;
            }

            case MathExprLexer.DO:
            {
                context = new Context(context);
                CheckBlock((AstNode)node.getChild(0), context);
                DataType condDataType = Check((AstNode)node.getChild(1).getChild(0), context);
                if (condDataType != BOOL)
                    throw new SemanticException("In while condition type is " + dataTypeToStr(condDataType));
                return VOID;
            }

//            case MathExprLexer.ARRAY:
//            {
//                DataType type = strToDataType(node.getChild(0).getText());
//                switch (type)
//                {
//                    case INT:
//                        type = IntArray;
//                        break;
//                    case DOUBLE:
//                        type = DoubleArray;
//                        break;
//                    case BOOL:
//                        type = BoolArray;
//                        break;
//                    default:
//                        type = VOID;
//                        break;
//
//                }
//                for (int i = 2; i < node.getChildCount(); i++)
//                {
//                    String name = node.getChild(i).getText();
//                    Identifier ident = context.getIdentifier(name);
//                    if (ident != null)
//                        throw new main.SemanticException("Identifier "+name+" already exists");
//                    context.setIdentifier(name, new Identifier(name, context.parentContext == null ? IdentifierType.GLOBAL : IdentifierType.LOCAL, type, node));
//                }
//                // var count = (main.AstNode)node.GetChild(1).GetChild(0);
//                if (node.getChild(1).getChildCount() != 0) {
//                    String count = node.getChild(1).getChild(0).getText(); int _count;
//                    _count = Integer.parseInt(count);
//                    if (!Int32.TryParse(count, out _count)) {
//                        Identifier identCount = context.getIdentifier(count);
//                        if (identCount == null)
//                            throw new main.SemanticException("Unknown identifier " + count);
//                        else if (identCount.getDataType() != INT)
//                            throw new main.SemanticException("Array count should be int, not " + dataTypeToStr(identCount.getDataType()));
//                    } else
//                        for (int i = 2; i < node.getChildCount(); i++)
//                            if (node.getChild(i).getChildCount() != _count)
//                                throw new main.SemanticException("array elements number differs from count on initialising");
//
//                }
//                //TODO: доделать.
//                for (int i = 2; i < node.getChildCount(); i++)
//                {
//                    // if (node.GetChild(i).ChildCount != 0)
//                    for (int j = 0; j < node.getChild(i).getChildCount(); j++)
//                    {
//                        if (node.getChild(0).getText() != dataTypeToStr(Check((main.AstNode)node.getChild(i).getChild(j), context)))
//                            throw new main.SemanticException("initialiser type differs from array type");
//                    }
//                }
//                return VOID;
//            }

            default:
            {
                throw new SemanticException("Unknown token type");
            }
        }

    }
}

