package main;

import generated.MathExprLexer;

import java.util.ArrayList;

/**
 * Created by max on 12.01.2015.
 */
public class Generate {
    final int temp1 = 1001;

    public void Gen(AstNode node, ArrayList<String> code, ref int label)
    {
        int templabel;
        int tempLabel;
        switch (node.getType())
        {

            case MathExprLexer.PROGRAM:
            case MathExprLexer.BLOCK:
                for (int i = 0; i < node.getChildCount(); i++)
                {
                    Gen((AstNode)node.GetChild(i), code, ref label);
                }
                break;
            case MathExprLexer.VAR:
                break;

            case MathExprLexer.FUNCTION:

                break;

            case MathExprLexer.CALL:
                if (node.GetChild(0).Text == "readInt")
                {
                    code.Add("inp");
                }
                if (node.GetChild(0).Text == "printInt")
                {
                    Gen((AstNode)node.GetChild(1).GetChild(0), code, ref label);
                    code.Add(string.Format("    call void [mscorlib]System.Console::WriteLine(int32)\n"));
                }

                break;
            case MathExprLexer.IDENT://
                code.Add(string.Format("    ldloc.s {0}\n", node.Index));
                break;
            case MathExprLexer.NUMBER:
                code.Add(string.Format("    ldc.i4.s {0}\n", node.Text));
                break;
                /*   case MathExprLexer.TRUE:
                       code.Add("pushc 1");
                       break;
                   case MathExprLexer.FALSE:
                       code.Add("pushc 0");
                       break;

                     */
            case MathExprLexer.ASSIGN:
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add(string.Format("    stloc.s {0}\n", ((AstNode)node.GetChild(0)).Index));

                break;
            //  case MathExprLexer.RETURN:
            // break
            case MathExprLexer.ADD:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("add");
                break;
            case MathExprLexer.SUB:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("sub");
                break;
            case MathExprLexer.MUL:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("mul");
                break;
            case MathExprLexer.DIV:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("div");
                break;
            case MathExprLexer.GE:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("clt");
                code.Add("ldc.i4.0");
                code.Add("ceq");
                break;
            case MathExprLexer.LE:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("cgt");
                code.Add("ldc.i4.0");
                code.Add("ceq");

                break;
            //Gen((AstNode)node.GetChild(1), code, ref label);
            //Gen((AstNode)node.GetChild(0), code, ref label);
            //code.Add("cmp");
            //code.Add("pushc 1");
            //code.Add("add");
            //break;
            case MathExprLexer.NEQUALS:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("ceq");
                code.Add("ldc.i4.0");
                code.Add("ceq");
                break;

            case MathExprLexer.EQUALS:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("ceq");
                break;

            case MathExprLexer.GT:
                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("cgt");
                break;
            //Gen((AstNode)node.GetChild(0), code, ref label);
            //Gen((AstNode)node.GetChild(1), code, ref label);
            //code.Add("cmp");
            // break;
            case MathExprLexer.LT:

                Gen((AstNode)node.GetChild(0), code, ref label);
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add("clt");
                break;

            //Gen((AstNode)node.GetChild(1), code, ref label);
            //Gen((AstNode)node.GetChild(0), code, ref label);
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
                tempLabel = label;
                label++;
                code.Add(string.Format("  L1_{0:X4}:\n", tempLabel));
                Gen((AstNode)node.GetChild(0), code, ref label);
                code.Add(string.Format("    brfalse.s L2_{0:X4}\n", tempLabel));
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add(string.Format("    br.s L1_{0:X4}\n", tempLabel));
                code.Add(string.Format("  L2_{0:X4}:\n", tempLabel));
                break;
            case MathExprLexer.IF:
                templabel = label;
                label++;
                Gen((AstNode)node.GetChild(0), code, ref label);
                code.Add(string.Format("    brfalse.s L1_{0:X4}\n", templabel));
                Gen((AstNode)node.GetChild(1), code, ref label); ;
                code.Add(string.Format("    br.s L2_{0:X4}\n", templabel));
                code.Add(string.Format("  L1_{0:X4}:\n", templabel));

                if (node.ChildCount > 2)
                    Gen((AstNode)node.GetChild(2), code, ref label);
                code.Add(string.Format("  L2_{0:X4}:\n", templabel));
                break;

            case MathExprLexer.FOR:
                tempLabel = label;
                label++;
                Gen((AstNode)node.GetChild(1), code, ref label);
                code.Add(string.Format("    stloc.s {0}\n", node.Index));
                code.Add(string.Format("  L1_{0:X4}:\n", tempLabel));
                code.Add(string.Format("    ldloc.s {0}\n", node.Index));
                Gen((AstNode)node.GetChild(2), code, ref label);
                code.Add(string.Format("    sub\n"));
                code.Add(string.Format("    ldc.i4.s {0}\n", 1));
                code.Add(string.Format("    sub\n"));
                code.Add(string.Format("    brfalse.s L2_{0:X4}\n", tempLabel));
                Gen((AstNode)node.GetChild(3), code, ref label);
                code.Add(string.Format("    ldloc.s {0}\n", node.Index));
                code.Add(string.Format("    ldc.i4.s {0}\n", 1));
                code.Add(string.Format("    add\n"));
                code.Add(string.Format("    stloc.s {0}\n", node.Index));
                code.Add(string.Format("    br.s L1_{0:X4}\n", tempLabel));
                code.Add(string.Format("  L2_{0:X4}:\n", tempLabel));
                break;
            default:
                break;
        }
    }
}
