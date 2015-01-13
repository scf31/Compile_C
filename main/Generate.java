package main;

import generated.MathExprLexer;

import java.util.ArrayList;

/**
 * Created by max on 30.12.2014.
 */
public class Generate {

    final int temp1 = 1001;
    private int originalLabel;

    public void generate(AstNode node, ArrayList<String> code, int label) {
        int templabel;
        int tempLabel;

        switch (node.getType()) {
            case MathExprLexer.PROGRAM:
            case MathExprLexer.BLOCK:
                for (int i = 0; i < node.getChildCount(); i++) {
                    generate((AstNode) node.getChild(i), code, originalLabel);
                }
                break;
            case MathExprLexer.VAR:
                break;

            case MathExprLexer.FUNCTION:
                break;

            case MathExprLexer.CALL:
                if (node.getChild(0).getText().equals("readInt")) {
                    code.add("inp");
                }
                if (node.getChild(0).getText().equals("printInt")) {
                    generate((AstNode) node.getChild(1).getChild(0), code, originalLabel);
                    code.add("    call void [mscorlib]System.Console::WriteLine(int32)\n");
                }
                break;

            case MathExprLexer.IDENTIFIER://
                code.add(String.format("    ldloc.s %1$s\n", node.getChildIndex()));
                break;
            case MathExprLexer.NUMBER:
                code.add(String.format("    ldc.i4.s %1$s\n", node.getText()));
                break;
                /*   case MathExprLexer.TRUE:
                       code.Add("pushc 1");
                       break;
                   case MathExprLexer.FALSE:
                       code.Add("pushc 0");
                       break;

                     */
            case MathExprLexer.ASSIGN:
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add(String.format("    stloc.s %1$s\n", ((AstNode) node.getChild(0)).getChildIndex()));
                break;
            //  case MathExprLexer.RETURN:
            // break
            case MathExprLexer.ADD:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("add");
                break;

            case MathExprLexer.SUB:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("sub");
                break;

            case MathExprLexer.MUL:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("mul");
                break;

            case MathExprLexer.DIV:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("div");
                break;

            case MathExprLexer.GE:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("clt");
                code.add("ldc.i4.0");
                code.add("ceq");
                break;

            case MathExprLexer.LE:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("cgt");
                code.add("ldc.i4.0");
                code.add("ceq");
                break;
            //generate((AstNode)node.GetChild(1), code,  label);
            //generate((AstNode)node.GetChild(0), code,  label);
            //code.Add("cmp");
            //code.Add("pushc 1");
            //code.Add("add");
            //break;
            case MathExprLexer.NOTEQUALS:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("ceq");
                code.add("ldc.i4.0");
                code.add("ceq");
                break;

            case MathExprLexer.EQUALS:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("ceq");
                break;

            case MathExprLexer.GT:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("cgt");
                break;
            //generate((AstNode)node.GetChild(0), code,  label);
            //generate((AstNode)node.GetChild(1), code,  label);
            //code.Add("cmp");
            // break;
            case MathExprLexer.LT:
                generate((AstNode) node.getChild(0), code, originalLabel);
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add("clt");
                break;

            //generate((AstNode)node.GetChild(1), code,  label);
            //generate((AstNode)node.GetChild(0), code,  label);
            //code.Add("cmp");
            //break;
            case MathExprLexer.NOT:
                break;
            case MathExprLexer.AND:
                break;
            case MathExprLexer.OR:
                break;
            case MathExprLexer.XOR:
                break;

            case MathExprLexer.WHILE:
                tempLabel = originalLabel;
                originalLabel++;
                code.add(String.format("  L1_%1$s\n", tempLabel));
                generate((AstNode) node.getChild(0), code, originalLabel);
                code.add(String.format("    brfalse.s L2_%1$s\n", tempLabel));
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add(String.format("    br.s L1_%1$s\n", tempLabel));
                code.add(String.format("  L2_%1$s\n", tempLabel));
                break;

            case MathExprLexer.IF:
                templabel = originalLabel;
                originalLabel++;
                generate((AstNode) node.getChild(0), code, originalLabel);
                code.add(String.format("    brfalse.s L1_%1$s\n", templabel));
                generate((AstNode) node.getChild(1), code, originalLabel); ;
                code.add(String.format("    br.s L2_%1$s\n", templabel));
                code.add(String.format("  L1_%1$s\n", templabel));

                if (node.getChildCount() > 2)
                    generate((AstNode) node.getChild(2), code, originalLabel);
                code.add(String.format("  L2_%1$s\n", templabel));
                break;

            case MathExprLexer.FOR:
                tempLabel = originalLabel;
                originalLabel++;
                generate((AstNode) node.getChild(1), code, originalLabel);
                code.add(String.format("    stloc.s %1$s\n", node.getChildIndex()));
                code.add(String.format("  L1_%1$s\n", tempLabel));
                code.add(String.format("    ldloc.s %1$s\n", node.getChildIndex()));
                generate((AstNode) node.getChild(2), code, originalLabel);
                code.add(String.format("    sub\n"));
                code.add(String.format("    ldc.i4.s %1$s\n", 1));
                code.add(String.format("    sub\n"));
                code.add(String.format("    brfalse.s L2_%1$s\n", tempLabel));
                generate((AstNode) node.getChild(3), code, originalLabel);
                code.add(String.format("    ldloc.s %1$s\n", node.getChildIndex()));
                code.add(String.format("    ldc.i4.s %1$s\n", 1));
                code.add(String.format("    add\n"));
                code.add(String.format("    stloc.s %1$s\n", node.getChildIndex()));
                code.add(String.format("    br.s L1_%1$s\n", tempLabel));
                code.add(String.format("  L2_%1$s\n", tempLabel));
                break;
            default:
                break;
        }
    }
}
