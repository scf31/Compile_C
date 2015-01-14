package main;

import java.io.*;
import java.util.ArrayList;

import generated.MathExprLexer;
import generated.MathExprParser;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class Program {
  public static void main(String[] args) {
    try {

        CharStream input = args.length == 1 ? new ANTLRFileStream(args[0])
                : new ANTLRReaderStream(new InputStreamReader(System.in));
        MathExprLexer lexer = new MathExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MathExprParser parser = new MathExprParser(tokens);
        parser.setTreeAdaptor(new AstNode.AstNodeTreeAdapter());
        //parser.start();
        Tree program = (Tree) parser.execute().getTree();
        AstNodePrinter.Print(program);
        SemanticChecker sc = new SemanticChecker();
        sc.Check((AstNode)program, new Context(null));
        //System.out.println("OK!");
        Generate gen = new Generate();
        ArrayList<String> code = new ArrayList<String>();
        gen.generate((AstNode)program,code,1);
        System.out.println("Result :\n");
        for (String str : code){
            System.out.println(str+"\n");
        }
    }
    catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}
