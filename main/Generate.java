package main;

import generated.MathExprLexer;

import java.util.ArrayList;

/**
 * Created by max on 30.12.2014.
 */
public class Generate {

    public void generate(AstNode node, ArrayList<String> code) {

        switch (node.getType()) {
            case MathExprLexer.PROGRAM:

            case MathExprLexer.BLOCK:
                code.add("{\n");
                for (int i = 0; i < node.getChildCount(); i++) {
                    generate((AstNode) node.getChild(i), code);
                }
                code.add("}\n");
                break;
            case MathExprLexer.VAR:
                code.add(node.getChild(0).getText());
                for (int i = 0; i < node.getChildCount(); i++) {
                    generate((AstNode) node.getChild(0).getChild(i), code);
                }
                code.add(";\n");
                break;

            case MathExprLexer.FUNCTION:
                for (int i = 0; i < node.getChildCount(); i++) {
                    generate((AstNode) node.getChild(i), code);
                }
                break;

            case MathExprLexer.PARAMETERS:
                code.add("(");
                for (int i = 0; i < node.getChildCount(); i++) {
                    generate((AstNode) node.getChild(i), code);
                    generate((AstNode) node.getChild(i).getChild(0), code);
                    if(i+1!=node.getChildCount()){
                        code.add(", ");
                    }
                }
                code.add(")");
                break;

            case MathExprLexer.CALL:
                code.add(node.getChild(0).getText()+"( ");
                for (int i=0;i<node.getChild(1).getChildCount();i++){
                    code.add(node.getChild(1).getChild(i).getText());
                    if(i+1!=node.getChildCount()){
                        code.add(", ");
                    }
                }
                code.add(");");
                break;

            case MathExprLexer.IDENTIFIER:
                code.add(node.getText());
                break;
            case MathExprLexer.NUMBER:
                code.add(node.getText());
                break;
            case MathExprLexer.TRUE:
                code.add("true");
                break;
            case MathExprLexer.FALSE:
                code.add("false");
                break;
            case MathExprLexer.ASSIGN:
                generate((AstNode) node.getChild(0), code);
                code.add("=");
                generate((AstNode) node.getChild(1), code);
                code.add(";\n");
                break;
            case MathExprLexer.ADD:
                generate((AstNode) node.getChild(0), code);
                code.add("+");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.SUB:
                generate((AstNode) node.getChild(0), code);
                code.add("-");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.MUL:
                generate((AstNode) node.getChild(0), code);
                code.add("*");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.DIV:
                generate((AstNode) node.getChild(0), code);
                code.add("/");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.GE:
                generate((AstNode) node.getChild(0), code);
                code.add(">=");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.LE:
                generate((AstNode) node.getChild(0), code);
                code.add("<=");
                generate((AstNode) node.getChild(1), code);
                break;
            case MathExprLexer.NOTEQUALS:
                generate((AstNode) node.getChild(0), code);
                code.add("!=");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.EQUALS:
                generate((AstNode) node.getChild(0), code);
                code.add("==");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.GT:
                generate((AstNode) node.getChild(0), code);
                code.add(">");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.LT:
                generate((AstNode) node.getChild(0), code);
                code.add("<");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.NOT:
                code.add("!");
                break;
            case MathExprLexer.AND:
                code.add("&&");
                break;
            case MathExprLexer.OR:
                code.add("||");
                break;
            case MathExprLexer.XOR:
                code.add("&|");
                break;

            case MathExprLexer.WHILE:
                code.add("while ( ");
                generate((AstNode) node.getChild(0), code);
                code.add(")\n");
                generate((AstNode) node.getChild(1), code);
                break;

            case MathExprLexer.IF:
                code.add("if (");
                generate((AstNode) node.getChild(0), code);
                code.add(")\n");
                generate((AstNode) node.getChild(1), code);
                if (node.getChildCount() > 2)
                    code.add("else\n");
                generate((AstNode) node.getChild(2), code);
                break;

            case MathExprLexer.FOR:
                code.add("if (");
                generate((AstNode) node.getChild(1), code);
                code.add(")\n");
                generate((AstNode) node.getChild(2), code);
                code.add("else\n");
                generate((AstNode) node.getChild(3), code);
                code.add("\n");
                break;
            default:
                break;
        }
    }
}
