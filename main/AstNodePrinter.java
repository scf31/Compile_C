package main;

import org.antlr.runtime.tree.*;


public class AstNodePrinter
{
  private static String getStringSubTree(Tree node, String indent, boolean root) {
    if (node == null)
      return "";

    String result = indent;
    if (!root) {
      result += "\t";
      indent += "\t";
    }
    result += node + "\n";
    for(int i = 0; i < node.getChildCount(); i++)
      result += getStringSubTree(node.getChild(i), indent, false);

    return result;
  }


  public static String astNodeToAdvancedDosStringTree(Tree node) {
    return getStringSubTree(node, "", true);
  }


  public static void Print(Tree node) {
    String tree = astNodeToAdvancedDosStringTree(node);
    System.out.println(tree);
  }
}
