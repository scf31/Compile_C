package main;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

/**
 * Created by V on 19.10.2014.
 */
public class AstNode extends CommonTree  {

    public SemanticChecker.DataType dataType;

    public AstNode() {
    }

    public AstNode(CommonTree node) {
        super(node);
    }

    public AstNode(Token t) {
        super(t);
    }

    public SemanticChecker.DataType getDataType() {
        return dataType;
    }

    public void setDataType(SemanticChecker.DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        String result = super.toString();
        if (dataType!=null && dataType != SemanticChecker.DataType.VOID){
            result += ", " + SemanticChecker.dataTypeToStr(dataType);
        }
        return result;
    }

    public static class AstNodeTreeAdapter extends CommonTreeAdaptor{
        @Override
        public Object create(Token payload) {
            //return super.create(payload);
            return new AstNode(payload);
        }
    }
}