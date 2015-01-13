package main;

import generated.MathExprLexer;

import java.util.ArrayList;

/**
 * Created by max on 12.01.2015.
 */
public class Generate {

    final int temp1 = 1001;
    private int originalLabel;

    public void Gen(AstNode node, ArrayList<String> code, int label) //TODO сделать у всех лейблов смену оригинала
    {
        int templabel;
        int tempLabel;
        switch (node.getType())
        {

            case MathExprLexer.PROGRAM:
            case MathExprLexer.BLOCK:
                for (int i = 0; i < node.getChildCount(); i++)
                {
                    Gen((AstNode)node.getChild(i), code, originalLabel);
                }
                break;
            case MathExprLexer.VAR:
                break;

            case MathExprLexer.FUNCTION:

                break;

            case MathExprLexer.CALL:
                if (node.getChild(0).getText().equals("readInt"))
                {
                    code.add("inp");
                }
                if (node.getChild(0).getText().equals("printInt"))
                {
                    Gen((AstNode)node.getChild(1).getChild(0), code, originalLabel);
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
                Gen((AstNode)node.getChild(1), code, originalLabel);
                code.add(String.format("    stloc.s %1$s\n", ((AstNode) node.getChild(0)).getChildIndex()));

                break;
            //  case MathExprLexer.RETURN:
            // break
            case MathExprLexer.ADD:
                Gen((AstNode)node.getChild(0), code, originalLabel);
                Gen((AstNode)node.getChild(1), code, originalLabel);
                code.add("add");
                break;
            case MathExprLexer.SUB:
                Gen((AstNode)node.getChild(0), code, originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("sub");
                break;
            case MathExprLexer.MUL:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("mul");
                break;
            case MathExprLexer.DIV:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("div");
                break;
            case MathExprLexer.GE:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("clt");
                code.add("ldc.i4.0");
                code.add("ceq");
                break;
            case MathExprLexer.LE:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("cgt");
                code.add("ldc.i4.0");
                code.add("ceq");

                break;
            //Gen((AstNode)node.GetChild(1), code,  label);
            //Gen((AstNode)node.GetChild(0), code,  label);
            //code.Add("cmp");
            //code.Add("pushc 1");
            //code.Add("add");
            //break;
            case MathExprLexer.NOTEQUALS:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("ceq");
                code.add("ldc.i4.0");
                code.add("ceq");
                break;

            case MathExprLexer.EQUALS:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("ceq");
                break;

            case MathExprLexer.GT:
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("cgt");
                break;
            //Gen((AstNode)node.GetChild(0), code,  label);
            //Gen((AstNode)node.GetChild(1), code,  label);
            //code.Add("cmp");
            // break;
            case MathExprLexer.LT:

                Gen((AstNode)node.getChild(0), code,  originalLabel);
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add("clt");
                break;

            //Gen((AstNode)node.GetChild(1), code,  label);
            //Gen((AstNode)node.GetChild(0), code,  label);
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
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                code.add(String.format("    brfalse.s L2_%1$s\n", tempLabel));
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add(String.format("    br.s L1_%1$s\n", tempLabel));
                code.add(String.format("  L2_%1$s\n", tempLabel));
                break;
            case MathExprLexer.IF:
                templabel = originalLabel;
                originalLabel++;
                Gen((AstNode)node.getChild(0), code,  originalLabel);
                code.add(String.format("    brfalse.s L1_%1$s\n", templabel));
                Gen((AstNode)node.getChild(1), code,  originalLabel); ;
                code.add(String.format("    br.s L2_%1$s\n", templabel));
                code.add(String.format("  L1_%1$s\n", templabel));

                if (node.getChildCount() > 2)
                    Gen((AstNode)node.getChild(2), code,  originalLabel);
                code.add(String.format("  L2_%1$s\n", templabel));
                break;

            case MathExprLexer.FOR:
                tempLabel = originalLabel;
                originalLabel++;
                Gen((AstNode)node.getChild(1), code,  originalLabel);
                code.add(String.format("    stloc.s %1$s\n", node.getChildIndex()));
                code.add(String.format("  L1_%1$s\n", tempLabel));
                code.add(String.format("    ldloc.s %1$s\n", node.getChildIndex()));
                Gen((AstNode)node.getChild(2), code,  originalLabel);
                code.add(String.format("    sub\n"));
                code.add(String.format("    ldc.i4.s %1$s\n", 1));
                code.add(String.format("    sub\n"));
                code.add(String.format("    brfalse.s L2_%1$s\n", tempLabel));
                Gen((AstNode)node.getChild(3), code,  originalLabel);
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
