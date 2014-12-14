// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-12-07 21:18:39
package generated;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class MathExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DO", "UNKNOWN", "BLOCK", "PARAMETERS", "CALL", "CONVERT", "IF", "ELSE", "FOR", "WHILE", "AND", "OR", "NOT", "XOR", "INT_DIV", "INT_MOD", "SHR", "SHL", "IN", "VAR", "RETURN", "ARRAY", "CAPACITY", "FUNCTION", "PROGRAM", "TRUE", "FALSE", "WS", "ML_COMMENT", "NUMBER", "IDENTIFIER", "ADD", "SUB", "MUL", "DIV", "BIT_AND", "BIT_OR", "ASSIGN", "GE", "LE", "NOTEQUALS", "EQUALS", "GT", "LT", "','", "'('", "')'", "'{'", "'}'", "';'", "'['", "']'"
    };
    public static final int SHR=20;
    public static final int FUNCTION=27;
    public static final int LT=47;
    public static final int CAPACITY=26;
    public static final int BIT_AND=39;
    public static final int PARAMETERS=7;
    public static final int WHILE=13;
    public static final int SHL=21;
    public static final int DO=4;
    public static final int FOR=12;
    public static final int SUB=36;
    public static final int EQUALS=45;
    public static final int NOT=16;
    public static final int AND=14;
    public static final int EOF=-1;
    public static final int IF=10;
    public static final int T__55=55;
    public static final int ML_COMMENT=32;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int IN=22;
    public static final int T__53=53;
    public static final int BIT_OR=40;
    public static final int UNKNOWN=5;
    public static final int T__54=54;
    public static final int IDENTIFIER=34;
    public static final int INT_DIV=18;
    public static final int RETURN=24;
    public static final int VAR=23;
    public static final int T__50=50;
    public static final int ARRAY=25;
    public static final int ADD=35;
    public static final int INT_MOD=19;
    public static final int GE=42;
    public static final int XOR=17;
    public static final int CONVERT=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int ELSE=11;
    public static final int NUMBER=33;
    public static final int NOTEQUALS=44;
    public static final int MUL=37;
    public static final int TRUE=29;
    public static final int WS=31;
    public static final int BLOCK=6;
    public static final int OR=15;
    public static final int ASSIGN=41;
    public static final int GT=46;
    public static final int PROGRAM=28;
    public static final int CALL=8;
    public static final int DIV=38;
    public static final int FALSE=30;
    public static final int LE=43;

    // delegates
    // delegators


        public MathExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MathExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[83+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return MathExprParser.tokenNames; }
    public String getGrammarFileName() { return "MathExpr.g"; }


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // MathExpr.g:77:1: identifier : IDENTIFIER ;
    public final MathExprParser.identifier_return identifier() throws RecognitionException {
        MathExprParser.identifier_return retval = new MathExprParser.identifier_return();
        retval.start = input.LT(1);
        int identifier_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER1=null;

        Object IDENTIFIER1_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // MathExpr.g:77:11: ( IDENTIFIER )
            // MathExpr.g:77:13: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier812); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER1_tree = (Object)adaptor.create(IDENTIFIER1);
            adaptor.addChild(root_0, IDENTIFIER1_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, identifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class parameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // MathExpr.g:80:1: parameters : ( term ( ',' term )* )? ;
    public final MathExprParser.parameters_return parameters() throws RecognitionException {
        MathExprParser.parameters_return retval = new MathExprParser.parameters_return();
        retval.start = input.LT(1);
        int parameters_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal3=null;
        MathExprParser.term_return term2 = null;

        MathExprParser.term_return term4 = null;


        Object char_literal3_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // MathExpr.g:80:11: ( ( term ( ',' term )* )? )
            // MathExpr.g:80:13: ( term ( ',' term )* )?
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:80:13: ( term ( ',' term )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NOT||(LA2_0>=TRUE && LA2_0<=FALSE)||(LA2_0>=NUMBER && LA2_0<=IDENTIFIER)||LA2_0==49) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // MathExpr.g:80:15: term ( ',' term )*
                    {
                    pushFollow(FOLLOW_term_in_parameters823);
                    term2=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term2.getTree());
                    // MathExpr.g:80:20: ( ',' term )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==48) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // MathExpr.g:80:21: ',' term
                    	    {
                    	    char_literal3=(Token)match(input,48,FOLLOW_48_in_parameters826); if (state.failed) return retval;
                    	    pushFollow(FOLLOW_term_in_parameters829);
                    	    term4=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term4.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parameters_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parameters"

    public static class call_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // MathExpr.g:81:1: call : identifier '(' parameters ')' -> ^( CALL identifier ^( PARAMETERS ( parameters )? ) ) ;
    public final MathExprParser.call_return call() throws RecognitionException {
        MathExprParser.call_return retval = new MathExprParser.call_return();
        retval.start = input.LT(1);
        int call_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        MathExprParser.identifier_return identifier5 = null;

        MathExprParser.parameters_return parameters7 = null;


        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // MathExpr.g:81:5: ( identifier '(' parameters ')' -> ^( CALL identifier ^( PARAMETERS ( parameters )? ) ) )
            // MathExpr.g:81:7: identifier '(' parameters ')'
            {
            pushFollow(FOLLOW_identifier_in_call842);
            identifier5=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());
            char_literal6=(Token)match(input,49,FOLLOW_49_in_call844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal6);

            pushFollow(FOLLOW_parameters_in_call846);
            parameters7=parameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameters.add(parameters7.getTree());
            char_literal8=(Token)match(input,50,FOLLOW_50_in_call848); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal8);



            // AST REWRITE
            // elements: parameters, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:38: -> ^( CALL identifier ^( PARAMETERS ( parameters )? ) )
            {
                // MathExpr.g:81:41: ^( CALL identifier ^( PARAMETERS ( parameters )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // MathExpr.g:81:59: ^( PARAMETERS ( parameters )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);

                // MathExpr.g:81:72: ( parameters )?
                if ( stream_parameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_parameters.nextTree());

                }
                stream_parameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, call_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "group"
    // MathExpr.g:83:1: group : ( '(' term ')' | NUMBER | TRUE | FALSE | identifier | call );
    public final MathExprParser.group_return group() throws RecognitionException {
        MathExprParser.group_return retval = new MathExprParser.group_return();
        retval.start = input.LT(1);
        int group_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        Token NUMBER12=null;
        Token TRUE13=null;
        Token FALSE14=null;
        MathExprParser.term_return term10 = null;

        MathExprParser.identifier_return identifier15 = null;

        MathExprParser.call_return call16 = null;


        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        Object NUMBER12_tree=null;
        Object TRUE13_tree=null;
        Object FALSE14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // MathExpr.g:83:6: ( '(' term ')' | NUMBER | TRUE | FALSE | identifier | call )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case NUMBER:
                {
                alt3=2;
                }
                break;
            case TRUE:
                {
                alt3=3;
                }
                break;
            case FALSE:
                {
                alt3=4;
                }
                break;
            case IDENTIFIER:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==49) ) {
                    alt3=6;
                }
                else if ( (LA3_5==EOF||(LA3_5>=AND && LA3_5<=OR)||(LA3_5>=INT_DIV && LA3_5<=INT_MOD)||(LA3_5>=ADD && LA3_5<=BIT_OR)||(LA3_5>=GE && LA3_5<=48)||LA3_5==50||LA3_5==53||LA3_5==55) ) {
                    alt3=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // MathExpr.g:84:3: '(' term ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal9=(Token)match(input,49,FOLLOW_49_in_group874); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_group877);
                    term10=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term10.getTree());
                    char_literal11=(Token)match(input,50,FOLLOW_50_in_group879); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:85:3: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER12=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_group884); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER12_tree = (Object)adaptor.create(NUMBER12);
                    adaptor.addChild(root_0, NUMBER12_tree);
                    }

                    }
                    break;
                case 3 :
                    // MathExpr.g:86:3: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE13=(Token)match(input,TRUE,FOLLOW_TRUE_in_group888); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE13_tree = (Object)adaptor.create(TRUE13);
                    adaptor.addChild(root_0, TRUE13_tree);
                    }

                    }
                    break;
                case 4 :
                    // MathExpr.g:87:3: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE14=(Token)match(input,FALSE,FOLLOW_FALSE_in_group892); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE14_tree = (Object)adaptor.create(FALSE14);
                    adaptor.addChild(root_0, FALSE14_tree);
                    }

                    }
                    break;
                case 5 :
                    // MathExpr.g:88:3: identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_group896);
                    identifier15=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier15.getTree());

                    }
                    break;
                case 6 :
                    // MathExpr.g:89:3: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_group900);
                    call16=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call16.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, group_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "group"

    public static class not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not"
    // MathExpr.g:93:1: not : ( group | NOT not );
    public final MathExprParser.not_return not() throws RecognitionException {
        MathExprParser.not_return retval = new MathExprParser.not_return();
        retval.start = input.LT(1);
        int not_StartIndex = input.index();
        Object root_0 = null;

        Token NOT18=null;
        MathExprParser.group_return group17 = null;

        MathExprParser.not_return not19 = null;


        Object NOT18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // MathExpr.g:93:4: ( group | NOT not )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=TRUE && LA4_0<=FALSE)||(LA4_0>=NUMBER && LA4_0<=IDENTIFIER)||LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==NOT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // MathExpr.g:93:8: group
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_group_in_not911);
                    group17=group();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, group17.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:93:16: NOT not
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT18=(Token)match(input,NOT,FOLLOW_NOT_in_not915); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT18_tree = (Object)adaptor.create(NOT18);
                    root_0 = (Object)adaptor.becomeRoot(NOT18_tree, root_0);
                    }
                    pushFollow(FOLLOW_not_in_not918);
                    not19=not();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, not19.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, not_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "not"

    public static class multiplex_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplex"
    // MathExpr.g:94:1: multiplex : not ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not )* ;
    public final MathExprParser.multiplex_return multiplex() throws RecognitionException {
        MathExprParser.multiplex_return retval = new MathExprParser.multiplex_return();
        retval.start = input.LT(1);
        int multiplex_StartIndex = input.index();
        Object root_0 = null;

        Token set21=null;
        MathExprParser.not_return not20 = null;

        MathExprParser.not_return not22 = null;


        Object set21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // MathExpr.g:94:10: ( not ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not )* )
            // MathExpr.g:94:13: not ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_in_multiplex926);
            not20=not();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, not20.getTree());
            // MathExpr.g:94:17: ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=INT_DIV && LA5_0<=INT_MOD)||(LA5_0>=MUL && LA5_0<=BIT_AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MathExpr.g:94:19: ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD ) not
            	    {
            	    set21=(Token)input.LT(1);
            	    set21=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT_DIV && input.LA(1)<=INT_MOD)||(input.LA(1)>=MUL && input.LA(1)<=BIT_AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set21), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_not_in_multiplex953);
            	    not22=not();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, not22.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, multiplex_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplex"

    public static class add_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "add"
    // MathExpr.g:95:1: add : multiplex ( ( ADD | SUB | BIT_OR ) multiplex )* ;
    public final MathExprParser.add_return add() throws RecognitionException {
        MathExprParser.add_return retval = new MathExprParser.add_return();
        retval.start = input.LT(1);
        int add_StartIndex = input.index();
        Object root_0 = null;

        Token set24=null;
        MathExprParser.multiplex_return multiplex23 = null;

        MathExprParser.multiplex_return multiplex25 = null;


        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // MathExpr.g:95:4: ( multiplex ( ( ADD | SUB | BIT_OR ) multiplex )* )
            // MathExpr.g:95:8: multiplex ( ( ADD | SUB | BIT_OR ) multiplex )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplex_in_add966);
            multiplex23=multiplex();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex23.getTree());
            // MathExpr.g:95:19: ( ( ADD | SUB | BIT_OR ) multiplex )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=ADD && LA6_0<=SUB)||LA6_0==BIT_OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MathExpr.g:95:21: ( ADD | SUB | BIT_OR ) multiplex
            	    {
            	    set24=(Token)input.LT(1);
            	    set24=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ADD && input.LA(1)<=SUB)||input.LA(1)==BIT_OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set24), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplex_in_add986);
            	    multiplex25=multiplex();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplex25.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, add_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "add"

    public static class compare_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compare"
    // MathExpr.g:96:1: compare : add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )? ;
    public final MathExprParser.compare_return compare() throws RecognitionException {
        MathExprParser.compare_return retval = new MathExprParser.compare_return();
        retval.start = input.LT(1);
        int compare_StartIndex = input.index();
        Object root_0 = null;

        Token set27=null;
        MathExprParser.add_return add26 = null;

        MathExprParser.add_return add28 = null;


        Object set27_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // MathExpr.g:96:8: ( add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )? )
            // MathExpr.g:96:10: add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_add_in_compare1015);
            add26=add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, add26.getTree());
            // MathExpr.g:96:14: ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // MathExpr.g:96:16: ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add
                    {
                    set27=(Token)input.LT(1);
                    set27=(Token)input.LT(1);
                    if ( (input.LA(1)>=GE && input.LA(1)<=LT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set27), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_add_in_compare1046);
                    add28=add();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, add28.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, compare_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "compare"

    public static class and_logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and_logic"
    // MathExpr.g:97:1: and_logic : compare ( AND compare )* ;
    public final MathExprParser.and_logic_return and_logic() throws RecognitionException {
        MathExprParser.and_logic_return retval = new MathExprParser.and_logic_return();
        retval.start = input.LT(1);
        int and_logic_StartIndex = input.index();
        Object root_0 = null;

        Token AND30=null;
        MathExprParser.compare_return compare29 = null;

        MathExprParser.compare_return compare31 = null;


        Object AND30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // MathExpr.g:97:10: ( compare ( AND compare )* )
            // MathExpr.g:97:12: compare ( AND compare )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_compare_in_and_logic1058);
            compare29=compare();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compare29.getTree());
            // MathExpr.g:97:20: ( AND compare )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // MathExpr.g:97:22: AND compare
            	    {
            	    AND30=(Token)match(input,AND,FOLLOW_AND_in_and_logic1062); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND30_tree = (Object)adaptor.create(AND30);
            	    root_0 = (Object)adaptor.becomeRoot(AND30_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_compare_in_and_logic1065);
            	    compare31=compare();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, compare31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, and_logic_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "and_logic"

    public static class or_logic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or_logic"
    // MathExpr.g:98:1: or_logic : and_logic ( OR and_logic )* ;
    public final MathExprParser.or_logic_return or_logic() throws RecognitionException {
        MathExprParser.or_logic_return retval = new MathExprParser.or_logic_return();
        retval.start = input.LT(1);
        int or_logic_StartIndex = input.index();
        Object root_0 = null;

        Token OR33=null;
        MathExprParser.and_logic_return and_logic32 = null;

        MathExprParser.and_logic_return and_logic34 = null;


        Object OR33_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // MathExpr.g:98:9: ( and_logic ( OR and_logic )* )
            // MathExpr.g:98:11: and_logic ( OR and_logic )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_logic_in_or_logic1078);
            and_logic32=and_logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic32.getTree());
            // MathExpr.g:98:21: ( OR and_logic )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==OR) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // MathExpr.g:98:23: OR and_logic
            	    {
            	    OR33=(Token)match(input,OR,FOLLOW_OR_in_or_logic1082); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR33_tree = (Object)adaptor.create(OR33);
            	    root_0 = (Object)adaptor.becomeRoot(OR33_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_and_logic_in_or_logic1085);
            	    and_logic34=and_logic();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, and_logic34.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, or_logic_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "or_logic"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // MathExpr.g:99:1: term : or_logic ;
    public final MathExprParser.term_return term() throws RecognitionException {
        MathExprParser.term_return retval = new MathExprParser.term_return();
        retval.start = input.LT(1);
        int term_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.or_logic_return or_logic35 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // MathExpr.g:99:5: ( or_logic )
            // MathExpr.g:99:7: or_logic
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_or_logic_in_term1096);
            or_logic35=or_logic();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, or_logic35.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, term_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // MathExpr.g:101:1: variableDeclaration : identifier ( ASSIGN term )? ;
    public final MathExprParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        MathExprParser.variableDeclaration_return retval = new MathExprParser.variableDeclaration_return();
        retval.start = input.LT(1);
        int variableDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGN37=null;
        MathExprParser.identifier_return identifier36 = null;

        MathExprParser.term_return term38 = null;


        Object ASSIGN37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // MathExpr.g:101:20: ( identifier ( ASSIGN term )? )
            // MathExpr.g:101:22: identifier ( ASSIGN term )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_variableDeclaration1105);
            identifier36=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier36.getTree());
            // MathExpr.g:101:33: ( ASSIGN term )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSIGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // MathExpr.g:101:34: ASSIGN term
                    {
                    ASSIGN37=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration1108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN37_tree = (Object)adaptor.create(ASSIGN37);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN37_tree, root_0);
                    }
                    pushFollow(FOLLOW_term_in_variableDeclaration1111);
                    term38=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term38.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, variableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"

    public static class variablesDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variablesDeclaration"
    // MathExpr.g:102:1: variablesDeclaration : identifier variableDeclaration ( ',' variableDeclaration )* -> ^( VAR ^( identifier ( variableDeclaration )+ ) ) ;
    public final MathExprParser.variablesDeclaration_return variablesDeclaration() throws RecognitionException {
        MathExprParser.variablesDeclaration_return retval = new MathExprParser.variablesDeclaration_return();
        retval.start = input.LT(1);
        int variablesDeclaration_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal41=null;
        MathExprParser.identifier_return identifier39 = null;

        MathExprParser.variableDeclaration_return variableDeclaration40 = null;

        MathExprParser.variableDeclaration_return variableDeclaration42 = null;


        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // MathExpr.g:102:21: ( identifier variableDeclaration ( ',' variableDeclaration )* -> ^( VAR ^( identifier ( variableDeclaration )+ ) ) )
            // MathExpr.g:102:23: identifier variableDeclaration ( ',' variableDeclaration )*
            {
            pushFollow(FOLLOW_identifier_in_variablesDeclaration1119);
            identifier39=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier39.getTree());
            pushFollow(FOLLOW_variableDeclaration_in_variablesDeclaration1121);
            variableDeclaration40=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration40.getTree());
            // MathExpr.g:102:54: ( ',' variableDeclaration )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==48) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred26_MathExpr()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // MathExpr.g:102:56: ',' variableDeclaration
            	    {
            	    char_literal41=(Token)match(input,48,FOLLOW_48_in_variablesDeclaration1125); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal41);

            	    pushFollow(FOLLOW_variableDeclaration_in_variablesDeclaration1127);
            	    variableDeclaration42=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);



            // AST REWRITE
            // elements: identifier, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:83: -> ^( VAR ^( identifier ( variableDeclaration )+ ) )
            {
                // MathExpr.g:102:86: ^( VAR ^( identifier ( variableDeclaration )+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                // MathExpr.g:102:92: ^( identifier ( variableDeclaration )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_identifier.nextNode(), root_2);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_2, stream_variableDeclaration.nextTree());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, variablesDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variablesDeclaration"

    public static class expr0_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr0"
    // MathExpr.g:106:1: expr0 : ( identifier ASSIGN term | call | variablesDeclaration );
    public final MathExprParser.expr0_return expr0() throws RecognitionException {
        MathExprParser.expr0_return retval = new MathExprParser.expr0_return();
        retval.start = input.LT(1);
        int expr0_StartIndex = input.index();
        Object root_0 = null;

        Token ASSIGN44=null;
        MathExprParser.identifier_return identifier43 = null;

        MathExprParser.term_return term45 = null;

        MathExprParser.call_return call46 = null;

        MathExprParser.variablesDeclaration_return variablesDeclaration47 = null;


        Object ASSIGN44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // MathExpr.g:106:6: ( identifier ASSIGN term | call | variablesDeclaration )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                case ASSIGN:
                    {
                    alt12=1;
                    }
                    break;
                case 49:
                    {
                    alt12=2;
                    }
                    break;
                case IDENTIFIER:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // MathExpr.g:107:3: identifier ASSIGN term
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_expr01155);
                    identifier43=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier43.getTree());
                    ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr01157); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN44_tree = (Object)adaptor.create(ASSIGN44);
                    root_0 = (Object)adaptor.becomeRoot(ASSIGN44_tree, root_0);
                    }
                    pushFollow(FOLLOW_term_in_expr01160);
                    term45=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term45.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:108:5: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_expr01166);
                    call46=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call46.getTree());

                    }
                    break;
                case 3 :
                    // MathExpr.g:109:5: variablesDeclaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variablesDeclaration_in_expr01172);
                    variablesDeclaration47=variablesDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variablesDeclaration47.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, expr0_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr0"

    public static class blockExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockExpr"
    // MathExpr.g:111:1: blockExpr : '{' expressionsList '}' ;
    public final MathExprParser.blockExpr_return blockExpr() throws RecognitionException {
        MathExprParser.blockExpr_return retval = new MathExprParser.blockExpr_return();
        retval.start = input.LT(1);
        int blockExpr_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        MathExprParser.expressionsList_return expressionsList49 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // MathExpr.g:111:10: ( '{' expressionsList '}' )
            // MathExpr.g:111:12: '{' expressionsList '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal48=(Token)match(input,51,FOLLOW_51_in_blockExpr1179); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionsList_in_blockExpr1182);
            expressionsList49=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList49.getTree());
            char_literal50=(Token)match(input,52,FOLLOW_52_in_blockExpr1184); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, blockExpr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockExpr"

    public static class termOrTrue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termOrTrue"
    // MathExpr.g:113:1: termOrTrue : ( term | () -> TRUE );
    public final MathExprParser.termOrTrue_return termOrTrue() throws RecognitionException {
        MathExprParser.termOrTrue_return retval = new MathExprParser.termOrTrue_return();
        retval.start = input.LT(1);
        int termOrTrue_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.term_return term51 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // MathExpr.g:113:11: ( term | () -> TRUE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOT||(LA13_0>=TRUE && LA13_0<=FALSE)||(LA13_0>=NUMBER && LA13_0<=IDENTIFIER)||LA13_0==49) ) {
                alt13=1;
            }
            else if ( (LA13_0==53) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // MathExpr.g:114:3: term
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_term_in_termOrTrue1195);
                    term51=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term51.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:115:5: ()
                    {
                    // MathExpr.g:115:5: ()
                    // MathExpr.g:115:7: 
                    {
                    }



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 115:9: -> TRUE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TRUE, "TRUE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, termOrTrue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "termOrTrue"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // MathExpr.g:117:1: expr : ( expr0 ';' | IF '(' term ')' expr ( ELSE expr )? | WHILE '(' term ')' expr | FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expr | DO expr WHILE '(' term ')' -> ^( DO expr ^( WHILE term ) ) | RETURN term ';' | call ';' | blockExpr | array_declaration );
    public final MathExprParser.expr_return expr() throws RecognitionException {
        MathExprParser.expr_return retval = new MathExprParser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal53=null;
        Token IF54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token ELSE59=null;
        Token WHILE61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token FOR66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token DO75=null;
        Token WHILE77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Token RETURN81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        MathExprParser.expr0_return expr052 = null;

        MathExprParser.term_return term56 = null;

        MathExprParser.expr_return expr58 = null;

        MathExprParser.expr_return expr60 = null;

        MathExprParser.term_return term63 = null;

        MathExprParser.expr_return expr65 = null;

        MathExprParser.expressionsList2_return expressionsList268 = null;

        MathExprParser.termOrTrue_return termOrTrue70 = null;

        MathExprParser.expressionsList2_return expressionsList272 = null;

        MathExprParser.expr_return expr74 = null;

        MathExprParser.expr_return expr76 = null;

        MathExprParser.term_return term79 = null;

        MathExprParser.term_return term82 = null;

        MathExprParser.call_return call84 = null;

        MathExprParser.blockExpr_return blockExpr86 = null;

        MathExprParser.array_declaration_return array_declaration87 = null;


        Object char_literal53_tree=null;
        Object IF54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object ELSE59_tree=null;
        Object WHILE61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object FOR66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object DO75_tree=null;
        Object WHILE77_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        Object RETURN81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // MathExpr.g:117:5: ( expr0 ';' | IF '(' term ')' expr ( ELSE expr )? | WHILE '(' term ')' expr | FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expr | DO expr WHILE '(' term ')' -> ^( DO expr ^( WHILE term ) ) | RETURN term ';' | call ';' | blockExpr | array_declaration )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // MathExpr.g:118:3: expr0 ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr0_in_expr1216);
                    expr052=expr0();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr052.getTree());
                    char_literal53=(Token)match(input,53,FOLLOW_53_in_expr1218); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // MathExpr.g:119:3: IF '(' term ')' expr ( ELSE expr )?
                    {
                    root_0 = (Object)adaptor.nil();

                    IF54=(Token)match(input,IF,FOLLOW_IF_in_expr1223); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF54_tree = (Object)adaptor.create(IF54);
                    root_0 = (Object)adaptor.becomeRoot(IF54_tree, root_0);
                    }
                    char_literal55=(Token)match(input,49,FOLLOW_49_in_expr1226); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_expr1229);
                    term56=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term56.getTree());
                    char_literal57=(Token)match(input,50,FOLLOW_50_in_expr1231); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1234);
                    expr58=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr58.getTree());
                    // MathExpr.g:119:27: ( ELSE expr )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ELSE) ) {
                        int LA14_1 = input.LA(2);

                        if ( (synpred31_MathExpr()) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // MathExpr.g:119:28: ELSE expr
                            {
                            ELSE59=(Token)match(input,ELSE,FOLLOW_ELSE_in_expr1237); if (state.failed) return retval;
                            pushFollow(FOLLOW_expr_in_expr1240);
                            expr60=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr60.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // MathExpr.g:120:3: WHILE '(' term ')' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    WHILE61=(Token)match(input,WHILE,FOLLOW_WHILE_in_expr1246); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE61_tree = (Object)adaptor.create(WHILE61);
                    root_0 = (Object)adaptor.becomeRoot(WHILE61_tree, root_0);
                    }
                    char_literal62=(Token)match(input,49,FOLLOW_49_in_expr1249); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_expr1252);
                    term63=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term63.getTree());
                    char_literal64=(Token)match(input,50,FOLLOW_50_in_expr1254); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1257);
                    expr65=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr65.getTree());

                    }
                    break;
                case 4 :
                    // MathExpr.g:121:3: FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expr
                    {
                    root_0 = (Object)adaptor.nil();

                    FOR66=(Token)match(input,FOR,FOLLOW_FOR_in_expr1261); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR66_tree = (Object)adaptor.create(FOR66);
                    root_0 = (Object)adaptor.becomeRoot(FOR66_tree, root_0);
                    }
                    char_literal67=(Token)match(input,49,FOLLOW_49_in_expr1264); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList2_in_expr1267);
                    expressionsList268=expressionsList2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList268.getTree());
                    char_literal69=(Token)match(input,53,FOLLOW_53_in_expr1269); if (state.failed) return retval;
                    pushFollow(FOLLOW_termOrTrue_in_expr1272);
                    termOrTrue70=termOrTrue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, termOrTrue70.getTree());
                    char_literal71=(Token)match(input,53,FOLLOW_53_in_expr1274); if (state.failed) return retval;
                    pushFollow(FOLLOW_expressionsList2_in_expr1277);
                    expressionsList272=expressionsList2();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsList272.getTree());
                    char_literal73=(Token)match(input,50,FOLLOW_50_in_expr1279); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr1282);
                    expr74=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr74.getTree());

                    }
                    break;
                case 5 :
                    // MathExpr.g:122:3: DO expr WHILE '(' term ')'
                    {
                    DO75=(Token)match(input,DO,FOLLOW_DO_in_expr1286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO75);

                    pushFollow(FOLLOW_expr_in_expr1289);
                    expr76=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr76.getTree());
                    WHILE77=(Token)match(input,WHILE,FOLLOW_WHILE_in_expr1291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE77);

                    char_literal78=(Token)match(input,49,FOLLOW_49_in_expr1293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal78);

                    pushFollow(FOLLOW_term_in_expr1295);
                    term79=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term79.getTree());
                    char_literal80=(Token)match(input,50,FOLLOW_50_in_expr1297); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal80);



                    // AST REWRITE
                    // elements: term, expr, DO, WHILE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 122:31: -> ^( DO expr ^( WHILE term ) )
                    {
                        // MathExpr.g:122:34: ^( DO expr ^( WHILE term ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // MathExpr.g:122:44: ^( WHILE term )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_term.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // MathExpr.g:123:3: RETURN term ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    RETURN81=(Token)match(input,RETURN,FOLLOW_RETURN_in_expr1316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN81_tree = (Object)adaptor.create(RETURN81);
                    root_0 = (Object)adaptor.becomeRoot(RETURN81_tree, root_0);
                    }
                    pushFollow(FOLLOW_term_in_expr1319);
                    term82=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, term82.getTree());
                    char_literal83=(Token)match(input,53,FOLLOW_53_in_expr1321); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // MathExpr.g:124:3: call ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_expr1326);
                    call84=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call84.getTree());
                    char_literal85=(Token)match(input,53,FOLLOW_53_in_expr1328); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // MathExpr.g:125:3: blockExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_blockExpr_in_expr1333);
                    blockExpr86=blockExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blockExpr86.getTree());

                    }
                    break;
                case 9 :
                    // MathExpr.g:126:3: array_declaration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_declaration_in_expr1337);
                    array_declaration87=array_declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array_declaration87.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class expressionsList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionsList"
    // MathExpr.g:129:1: expressionsList : ( expr ( ( ';' )* expr )* )? ( ';' )* -> ^( BLOCK ( expr )* ) ;
    public final MathExprParser.expressionsList_return expressionsList() throws RecognitionException {
        MathExprParser.expressionsList_return retval = new MathExprParser.expressionsList_return();
        retval.start = input.LT(1);
        int expressionsList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal89=null;
        Token char_literal91=null;
        MathExprParser.expr_return expr88 = null;

        MathExprParser.expr_return expr90 = null;


        Object char_literal89_tree=null;
        Object char_literal91_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // MathExpr.g:129:16: ( ( expr ( ( ';' )* expr )* )? ( ';' )* -> ^( BLOCK ( expr )* ) )
            // MathExpr.g:129:18: ( expr ( ( ';' )* expr )* )? ( ';' )*
            {
            // MathExpr.g:129:18: ( expr ( ( ';' )* expr )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==DO||LA18_0==IF||(LA18_0>=FOR && LA18_0<=WHILE)||LA18_0==RETURN||LA18_0==IDENTIFIER||LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // MathExpr.g:129:20: expr ( ( ';' )* expr )*
                    {
                    pushFollow(FOLLOW_expr_in_expressionsList1347);
                    expr88=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr88.getTree());
                    // MathExpr.g:129:25: ( ( ';' )* expr )*
                    loop17:
                    do {
                        int alt17=2;
                        alt17 = dfa17.predict(input);
                        switch (alt17) {
                    	case 1 :
                    	    // MathExpr.g:129:27: ( ';' )* expr
                    	    {
                    	    // MathExpr.g:129:27: ( ';' )*
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( (LA16_0==53) ) {
                    	            alt16=1;
                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // MathExpr.g:0:0: ';'
                    	    	    {
                    	    	    char_literal89=(Token)match(input,53,FOLLOW_53_in_expressionsList1351); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_53.add(char_literal89);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop16;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_expr_in_expressionsList1354);
                    	    expr90=expr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr.add(expr90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // MathExpr.g:129:43: ( ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // MathExpr.g:0:0: ';'
            	    {
            	    char_literal91=(Token)match(input,53,FOLLOW_53_in_expressionsList1362); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal91);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 129:49: -> ^( BLOCK ( expr )* )
            {
                // MathExpr.g:129:53: ^( BLOCK ( expr )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:129:61: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, expressionsList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionsList"

    public static class expressionsList2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionsList2"
    // MathExpr.g:130:1: expressionsList2 : ( expr0 ( ',' expr0 )* )? -> ^( BLOCK ( expr0 )* ) ;
    public final MathExprParser.expressionsList2_return expressionsList2() throws RecognitionException {
        MathExprParser.expressionsList2_return retval = new MathExprParser.expressionsList2_return();
        retval.start = input.LT(1);
        int expressionsList2_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal93=null;
        MathExprParser.expr0_return expr092 = null;

        MathExprParser.expr0_return expr094 = null;


        Object char_literal93_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_expr0=new RewriteRuleSubtreeStream(adaptor,"rule expr0");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // MathExpr.g:130:17: ( ( expr0 ( ',' expr0 )* )? -> ^( BLOCK ( expr0 )* ) )
            // MathExpr.g:130:19: ( expr0 ( ',' expr0 )* )?
            {
            // MathExpr.g:130:19: ( expr0 ( ',' expr0 )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENTIFIER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // MathExpr.g:130:21: expr0 ( ',' expr0 )*
                    {
                    pushFollow(FOLLOW_expr0_in_expressionsList21384);
                    expr092=expr0();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr0.add(expr092.getTree());
                    // MathExpr.g:130:27: ( ',' expr0 )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==48) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // MathExpr.g:130:29: ',' expr0
                    	    {
                    	    char_literal93=(Token)match(input,48,FOLLOW_48_in_expressionsList21388); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal93);

                    	    pushFollow(FOLLOW_expr0_in_expressionsList21390);
                    	    expr094=expr0();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expr0.add(expr094.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expr0
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:46: -> ^( BLOCK ( expr0 )* )
            {
                // MathExpr.g:130:50: ^( BLOCK ( expr0 )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // MathExpr.g:130:58: ( expr0 )*
                while ( stream_expr0.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr0.nextTree());

                }
                stream_expr0.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, expressionsList2_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionsList2"

    public static class array_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_type"
    // MathExpr.g:132:1: array_type : identifier '[' ( term )? ']' -> ^( ARRAY identifier ^( CAPACITY ( term )? ) ) ;
    public final MathExprParser.array_type_return array_type() throws RecognitionException {
        MathExprParser.array_type_return retval = new MathExprParser.array_type_return();
        retval.start = input.LT(1);
        int array_type_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal96=null;
        Token char_literal98=null;
        MathExprParser.identifier_return identifier95 = null;

        MathExprParser.term_return term97 = null;


        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // MathExpr.g:132:11: ( identifier '[' ( term )? ']' -> ^( ARRAY identifier ^( CAPACITY ( term )? ) ) )
            // MathExpr.g:132:13: identifier '[' ( term )? ']'
            {
            pushFollow(FOLLOW_identifier_in_array_type1416);
            identifier95=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier95.getTree());
            char_literal96=(Token)match(input,54,FOLLOW_54_in_array_type1418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(char_literal96);

            // MathExpr.g:132:28: ( term )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NOT||(LA22_0>=TRUE && LA22_0<=FALSE)||(LA22_0>=NUMBER && LA22_0<=IDENTIFIER)||LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // MathExpr.g:0:0: term
                    {
                    pushFollow(FOLLOW_term_in_array_type1420);
                    term97=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term97.getTree());

                    }
                    break;

            }

            char_literal98=(Token)match(input,55,FOLLOW_55_in_array_type1423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal98);



            // AST REWRITE
            // elements: identifier, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 132:38: -> ^( ARRAY identifier ^( CAPACITY ( term )? ) )
            {
                // MathExpr.g:132:41: ^( ARRAY identifier ^( CAPACITY ( term )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());
                // MathExpr.g:132:60: ^( CAPACITY ( term )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CAPACITY, "CAPACITY"), root_2);

                // MathExpr.g:132:71: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_2, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, array_type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_type"

    public static class array_initialising_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_initialising"
    // MathExpr.g:133:1: array_initialising : identifier ( '<' term ( ',' term )* '>' )? -> ^( identifier ( term )* ) ;
    public final MathExprParser.array_initialising_return array_initialising() throws RecognitionException {
        MathExprParser.array_initialising_return retval = new MathExprParser.array_initialising_return();
        retval.start = input.LT(1);
        int array_initialising_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        MathExprParser.identifier_return identifier99 = null;

        MathExprParser.term_return term101 = null;

        MathExprParser.term_return term103 = null;


        Object char_literal100_tree=null;
        Object char_literal102_tree=null;
        Object char_literal104_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // MathExpr.g:133:19: ( identifier ( '<' term ( ',' term )* '>' )? -> ^( identifier ( term )* ) )
            // MathExpr.g:133:21: identifier ( '<' term ( ',' term )* '>' )?
            {
            pushFollow(FOLLOW_identifier_in_array_initialising1445);
            identifier99=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier99.getTree());
            // MathExpr.g:133:32: ( '<' term ( ',' term )* '>' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // MathExpr.g:133:33: '<' term ( ',' term )* '>'
                    {
                    char_literal100=(Token)match(input,LT,FOLLOW_LT_in_array_initialising1448); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(char_literal100);

                    pushFollow(FOLLOW_term_in_array_initialising1450);
                    term101=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term101.getTree());
                    // MathExpr.g:133:42: ( ',' term )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==48) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // MathExpr.g:133:43: ',' term
                    	    {
                    	    char_literal102=(Token)match(input,48,FOLLOW_48_in_array_initialising1453); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal102);

                    	    pushFollow(FOLLOW_term_in_array_initialising1455);
                    	    term103=term();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_term.add(term103.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    char_literal104=(Token)match(input,GT,FOLLOW_GT_in_array_initialising1459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(char_literal104);


                    }
                    break;

            }



            // AST REWRITE
            // elements: identifier, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 133:60: -> ^( identifier ( term )* )
            {
                // MathExpr.g:133:63: ^( identifier ( term )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_identifier.nextNode(), root_1);

                // MathExpr.g:133:76: ( term )*
                while ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, array_initialising_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_initialising"

    public static class array_declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_declaration"
    // MathExpr.g:134:1: array_declaration : array_type array_initialising ( ',' array_initialising )* -> ^( array_type ( array_initialising )+ ) ;
    public final MathExprParser.array_declaration_return array_declaration() throws RecognitionException {
        MathExprParser.array_declaration_return retval = new MathExprParser.array_declaration_return();
        retval.start = input.LT(1);
        int array_declaration_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal107=null;
        MathExprParser.array_type_return array_type105 = null;

        MathExprParser.array_initialising_return array_initialising106 = null;

        MathExprParser.array_initialising_return array_initialising108 = null;


        Object char_literal107_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_array_initialising=new RewriteRuleSubtreeStream(adaptor,"rule array_initialising");
        RewriteRuleSubtreeStream stream_array_type=new RewriteRuleSubtreeStream(adaptor,"rule array_type");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // MathExpr.g:134:18: ( array_type array_initialising ( ',' array_initialising )* -> ^( array_type ( array_initialising )+ ) )
            // MathExpr.g:135:3: array_type array_initialising ( ',' array_initialising )*
            {
            pushFollow(FOLLOW_array_type_in_array_declaration1478);
            array_type105=array_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_array_type.add(array_type105.getTree());
            pushFollow(FOLLOW_array_initialising_in_array_declaration1480);
            array_initialising106=array_initialising();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_array_initialising.add(array_initialising106.getTree());
            // MathExpr.g:135:33: ( ',' array_initialising )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // MathExpr.g:135:34: ',' array_initialising
            	    {
            	    char_literal107=(Token)match(input,48,FOLLOW_48_in_array_declaration1483); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal107);

            	    pushFollow(FOLLOW_array_initialising_in_array_declaration1485);
            	    array_initialising108=array_initialising();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array_initialising.add(array_initialising108.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);



            // AST REWRITE
            // elements: array_type, array_initialising
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:59: -> ^( array_type ( array_initialising )+ )
            {
                // MathExpr.g:135:62: ^( array_type ( array_initialising )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_array_type.nextNode(), root_1);

                if ( !(stream_array_initialising.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_array_initialising.hasNext() ) {
                    adaptor.addChild(root_1, stream_array_initialising.nextTree());

                }
                stream_array_initialising.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, array_declaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "array_declaration"

    public static class parametersDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametersDeclaration"
    // MathExpr.g:138:1: parametersDeclaration : identifier identifier ;
    public final MathExprParser.parametersDeclaration_return parametersDeclaration() throws RecognitionException {
        MathExprParser.parametersDeclaration_return retval = new MathExprParser.parametersDeclaration_return();
        retval.start = input.LT(1);
        int parametersDeclaration_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.identifier_return identifier109 = null;

        MathExprParser.identifier_return identifier110 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // MathExpr.g:138:22: ( identifier identifier )
            // MathExpr.g:138:24: identifier identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_parametersDeclaration1504);
            identifier109=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(identifier109.getTree(), root_0);
            pushFollow(FOLLOW_identifier_in_parametersDeclaration1507);
            identifier110=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier110.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parametersDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parametersDeclaration"

    public static class parametersDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parametersDeclarations"
    // MathExpr.g:139:1: parametersDeclarations : parametersDeclaration ( ',' parametersDeclaration )* ;
    public final MathExprParser.parametersDeclarations_return parametersDeclarations() throws RecognitionException {
        MathExprParser.parametersDeclarations_return retval = new MathExprParser.parametersDeclarations_return();
        retval.start = input.LT(1);
        int parametersDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal112=null;
        MathExprParser.parametersDeclaration_return parametersDeclaration111 = null;

        MathExprParser.parametersDeclaration_return parametersDeclaration113 = null;


        Object char_literal112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // MathExpr.g:139:23: ( parametersDeclaration ( ',' parametersDeclaration )* )
            // MathExpr.g:139:25: parametersDeclaration ( ',' parametersDeclaration )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_parametersDeclaration_in_parametersDeclarations1514);
            parametersDeclaration111=parametersDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parametersDeclaration111.getTree());
            // MathExpr.g:139:47: ( ',' parametersDeclaration )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==48) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // MathExpr.g:139:49: ',' parametersDeclaration
            	    {
            	    char_literal112=(Token)match(input,48,FOLLOW_48_in_parametersDeclarations1518); if (state.failed) return retval;
            	    pushFollow(FOLLOW_parametersDeclaration_in_parametersDeclarations1521);
            	    parametersDeclaration113=parametersDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parametersDeclaration113.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parametersDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parametersDeclarations"

    public static class func_return_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "func_return_type"
    // MathExpr.g:140:1: func_return_type : identifier ;
    public final MathExprParser.func_return_type_return func_return_type() throws RecognitionException {
        MathExprParser.func_return_type_return retval = new MathExprParser.func_return_type_return();
        retval.start = input.LT(1);
        int func_return_type_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.identifier_return identifier114 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // MathExpr.g:140:17: ( identifier )
            // MathExpr.g:140:19: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_func_return_type1531);
            identifier114=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier114.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, func_return_type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "func_return_type"

    public static class functionDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclarations"
    // MathExpr.g:141:1: functionDeclarations : func_return_type identifier '(' ( parametersDeclarations )? ')' '{' expressionsList '}' -> ^( FUNCTION func_return_type identifier ^( PARAMETERS ( parametersDeclarations )? ) expressionsList ) ;
    public final MathExprParser.functionDeclarations_return functionDeclarations() throws RecognitionException {
        MathExprParser.functionDeclarations_return retval = new MathExprParser.functionDeclarations_return();
        retval.start = input.LT(1);
        int functionDeclarations_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal117=null;
        Token char_literal119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        MathExprParser.func_return_type_return func_return_type115 = null;

        MathExprParser.identifier_return identifier116 = null;

        MathExprParser.parametersDeclarations_return parametersDeclarations118 = null;

        MathExprParser.expressionsList_return expressionsList121 = null;


        Object char_literal117_tree=null;
        Object char_literal119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_func_return_type=new RewriteRuleSubtreeStream(adaptor,"rule func_return_type");
        RewriteRuleSubtreeStream stream_parametersDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule parametersDeclarations");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expressionsList=new RewriteRuleSubtreeStream(adaptor,"rule expressionsList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // MathExpr.g:141:21: ( func_return_type identifier '(' ( parametersDeclarations )? ')' '{' expressionsList '}' -> ^( FUNCTION func_return_type identifier ^( PARAMETERS ( parametersDeclarations )? ) expressionsList ) )
            // MathExpr.g:142:2: func_return_type identifier '(' ( parametersDeclarations )? ')' '{' expressionsList '}'
            {
            pushFollow(FOLLOW_func_return_type_in_functionDeclarations1538);
            func_return_type115=func_return_type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_func_return_type.add(func_return_type115.getTree());
            pushFollow(FOLLOW_identifier_in_functionDeclarations1540);
            identifier116=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier116.getTree());
            char_literal117=(Token)match(input,49,FOLLOW_49_in_functionDeclarations1542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal117);

            // MathExpr.g:142:34: ( parametersDeclarations )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENTIFIER) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // MathExpr.g:0:0: parametersDeclarations
                    {
                    pushFollow(FOLLOW_parametersDeclarations_in_functionDeclarations1544);
                    parametersDeclarations118=parametersDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parametersDeclarations.add(parametersDeclarations118.getTree());

                    }
                    break;

            }

            char_literal119=(Token)match(input,50,FOLLOW_50_in_functionDeclarations1547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal119);

            char_literal120=(Token)match(input,51,FOLLOW_51_in_functionDeclarations1551); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal120);

            pushFollow(FOLLOW_expressionsList_in_functionDeclarations1553);
            expressionsList121=expressionsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expressionsList.add(expressionsList121.getTree());
            char_literal122=(Token)match(input,52,FOLLOW_52_in_functionDeclarations1555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal122);



            // AST REWRITE
            // elements: expressionsList, func_return_type, parametersDeclarations, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:3: -> ^( FUNCTION func_return_type identifier ^( PARAMETERS ( parametersDeclarations )? ) expressionsList )
            {
                // MathExpr.g:144:6: ^( FUNCTION func_return_type identifier ^( PARAMETERS ( parametersDeclarations )? ) expressionsList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_func_return_type.nextTree());
                adaptor.addChild(root_1, stream_identifier.nextTree());
                // MathExpr.g:144:45: ^( PARAMETERS ( parametersDeclarations )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);

                // MathExpr.g:144:58: ( parametersDeclarations )?
                if ( stream_parametersDeclarations.hasNext() ) {
                    adaptor.addChild(root_2, stream_parametersDeclarations.nextTree());

                }
                stream_parametersDeclarations.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expressionsList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, functionDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionDeclarations"

    public static class exprOrFuncDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprOrFuncDeclaration"
    // MathExpr.g:147:1: exprOrFuncDeclaration : ( functionDeclarations | expr );
    public final MathExprParser.exprOrFuncDeclaration_return exprOrFuncDeclaration() throws RecognitionException {
        MathExprParser.exprOrFuncDeclaration_return retval = new MathExprParser.exprOrFuncDeclaration_return();
        retval.start = input.LT(1);
        int exprOrFuncDeclaration_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.functionDeclarations_return functionDeclarations123 = null;

        MathExprParser.expr_return expr124 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // MathExpr.g:147:22: ( functionDeclarations | expr )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==IDENTIFIER) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==IDENTIFIER) ) {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==49) ) {
                        alt28=1;
                    }
                    else if ( (LA28_3==ASSIGN||LA28_3==48||LA28_3==53) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA28_1==ASSIGN||LA28_1==49||LA28_1==54) ) {
                    alt28=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA28_0==DO||LA28_0==IF||(LA28_0>=FOR && LA28_0<=WHILE)||LA28_0==RETURN||LA28_0==51) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // MathExpr.g:147:24: functionDeclarations
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionDeclarations_in_exprOrFuncDeclaration1584);
                    functionDeclarations123=functionDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionDeclarations123.getTree());

                    }
                    break;
                case 2 :
                    // MathExpr.g:147:47: expr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_in_exprOrFuncDeclaration1588);
                    expr124=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, exprOrFuncDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "exprOrFuncDeclaration"

    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // MathExpr.g:149:1: program : ( exprOrFuncDeclaration ( ';' )* )* ;
    public final MathExprParser.program_return program() throws RecognitionException {
        MathExprParser.program_return retval = new MathExprParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal126=null;
        MathExprParser.exprOrFuncDeclaration_return exprOrFuncDeclaration125 = null;


        Object char_literal126_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // MathExpr.g:149:8: ( ( exprOrFuncDeclaration ( ';' )* )* )
            // MathExpr.g:149:10: ( exprOrFuncDeclaration ( ';' )* )*
            {
            root_0 = (Object)adaptor.nil();

            // MathExpr.g:149:10: ( exprOrFuncDeclaration ( ';' )* )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DO||LA30_0==IF||(LA30_0>=FOR && LA30_0<=WHILE)||LA30_0==RETURN||LA30_0==IDENTIFIER||LA30_0==51) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // MathExpr.g:149:12: exprOrFuncDeclaration ( ';' )*
            	    {
            	    pushFollow(FOLLOW_exprOrFuncDeclaration_in_program1598);
            	    exprOrFuncDeclaration125=exprOrFuncDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprOrFuncDeclaration125.getTree());
            	    // MathExpr.g:149:37: ( ';' )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==53) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // MathExpr.g:0:0: ';'
            	    	    {
            	    	    char_literal126=(Token)match(input,53,FOLLOW_53_in_program1600); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class result_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "result"
    // MathExpr.g:151:1: result : program -> ^( PROGRAM program ) ;
    public final MathExprParser.result_return result() throws RecognitionException {
        MathExprParser.result_return retval = new MathExprParser.result_return();
        retval.start = input.LT(1);
        int result_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.program_return program127 = null;


        RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // MathExpr.g:151:7: ( program -> ^( PROGRAM program ) )
            // MathExpr.g:151:9: program
            {
            pushFollow(FOLLOW_program_in_result1613);
            program127=program();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_program.add(program127.getTree());


            // AST REWRITE
            // elements: program
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:17: -> ^( PROGRAM program )
            {
                // MathExpr.g:151:20: ^( PROGRAM program )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_program.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, result_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "result"

    public static class execute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "execute"
    // MathExpr.g:153:1: execute : result ;
    public final MathExprParser.execute_return execute() throws RecognitionException {
        MathExprParser.execute_return retval = new MathExprParser.execute_return();
        retval.start = input.LT(1);
        int execute_StartIndex = input.index();
        Object root_0 = null;

        MathExprParser.result_return result128 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // MathExpr.g:153:8: ( result )
            // MathExpr.g:154:3: result
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_result_in_execute1631);
            result128=result();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, result128.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, execute_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "execute"

    // $ANTLR start synpred22_MathExpr
    public final void synpred22_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:96:16: ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )
        // MathExpr.g:96:16: ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add
        {
        if ( (input.LA(1)>=GE && input.LA(1)<=LT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_add_in_synpred22_MathExpr1046);
        add();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_MathExpr

    // $ANTLR start synpred26_MathExpr
    public final void synpred26_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:102:56: ( ',' variableDeclaration )
        // MathExpr.g:102:56: ',' variableDeclaration
        {
        match(input,48,FOLLOW_48_in_synpred26_MathExpr1125); if (state.failed) return ;
        pushFollow(FOLLOW_variableDeclaration_in_synpred26_MathExpr1127);
        variableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_MathExpr

    // $ANTLR start synpred30_MathExpr
    public final void synpred30_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:118:3: ( expr0 ';' )
        // MathExpr.g:118:3: expr0 ';'
        {
        pushFollow(FOLLOW_expr0_in_synpred30_MathExpr1216);
        expr0();

        state._fsp--;
        if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred30_MathExpr1218); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_MathExpr

    // $ANTLR start synpred31_MathExpr
    public final void synpred31_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:119:28: ( ELSE expr )
        // MathExpr.g:119:28: ELSE expr
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred31_MathExpr1237); if (state.failed) return ;
        pushFollow(FOLLOW_expr_in_synpred31_MathExpr1240);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_MathExpr

    // $ANTLR start synpred37_MathExpr
    public final void synpred37_MathExpr_fragment() throws RecognitionException {   
        // MathExpr.g:124:3: ( call ';' )
        // MathExpr.g:124:3: call ';'
        {
        pushFollow(FOLLOW_call_in_synpred37_MathExpr1326);
        call();

        state._fsp--;
        if (state.failed) return ;
        match(input,53,FOLLOW_53_in_synpred37_MathExpr1328); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_MathExpr

    // Delegated rules

    public final boolean synpred30_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_MathExpr() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_MathExpr_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\1\2\11\uffff";
    static final String DFA7_minS =
        "\1\16\1\0\10\uffff";
    static final String DFA7_maxS =
        "\1\67\1\0\10\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA7_specialS =
        "\1\uffff\1\0\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\2\32\uffff\4\11\1\1\1\11\1\2\1\uffff\1\2\2\uffff\1\2\1\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "96:14: ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT ) add )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_MathExpr()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\13\uffff";
    static final String DFA15_minS =
        "\1\4\1\0\11\uffff";
    static final String DFA15_maxS =
        "\1\63\1\0\11\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\10\1\1\1\7\1\11";
    static final String DFA15_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\5\5\uffff\1\2\1\uffff\1\4\1\3\12\uffff\1\6\11\uffff\1\1"+
            "\20\uffff\1\7",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "117:1: expr : ( expr0 ';' | IF '(' term ')' expr ( ELSE expr )? | WHILE '(' term ')' expr | FOR '(' expressionsList2 ';' termOrTrue ';' expressionsList2 ')' expr | DO expr WHILE '(' term ')' -> ^( DO expr ^( WHILE term ) ) | RETURN term ';' | call ';' | blockExpr | array_declaration );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_MathExpr()) ) {s = 8;}

                        else if ( (synpred37_MathExpr()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\4\uffff";
    static final String DFA17_eofS =
        "\4\uffff";
    static final String DFA17_minS =
        "\2\4\2\uffff";
    static final String DFA17_maxS =
        "\2\65\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA17_specialS =
        "\4\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\3\5\uffff\1\3\1\uffff\2\3\12\uffff\1\3\11\uffff\1\3\20\uffff"+
            "\1\3\1\2\1\1",
            "\1\3\5\uffff\1\3\1\uffff\2\3\12\uffff\1\3\11\uffff\1\3\20"+
            "\uffff\1\3\1\2\1\1",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 129:25: ( ( ';' )* expr )*";
        }
    }
 

    public static final BitSet FOLLOW_IDENTIFIER_in_identifier812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_parameters823 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_parameters826 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_parameters829 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identifier_in_call842 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_call844 = new BitSet(new long[]{0x0006000660010000L});
    public static final BitSet FOLLOW_parameters_in_call846 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_call848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_group874 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_group877 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_group879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_group884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_group888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_group892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_group896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_group900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_not911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_not915 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_not_in_not918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_not_in_multiplex926 = new BitSet(new long[]{0x000000E0000C0002L});
    public static final BitSet FOLLOW_set_in_multiplex930 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_not_in_multiplex953 = new BitSet(new long[]{0x000000E0000C0002L});
    public static final BitSet FOLLOW_multiplex_in_add966 = new BitSet(new long[]{0x0000011800000002L});
    public static final BitSet FOLLOW_set_in_add971 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_multiplex_in_add986 = new BitSet(new long[]{0x0000011800000002L});
    public static final BitSet FOLLOW_add_in_compare1015 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_set_in_compare1019 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_add_in_compare1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_and_logic1058 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_AND_in_and_logic1062 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_compare_in_and_logic1065 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_and_logic_in_or_logic1078 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_OR_in_or_logic1082 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_and_logic_in_or_logic1085 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_or_logic_in_term1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variableDeclaration1105 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration1108 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_variableDeclaration1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_variablesDeclaration1119 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variablesDeclaration1121 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_variablesDeclaration1125 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variablesDeclaration1127 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr01155 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_expr01157 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_expr01160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variablesDeclaration_in_expr01172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_blockExpr1179 = new BitSet(new long[]{0x003A000661003410L});
    public static final BitSet FOLLOW_expressionsList_in_blockExpr1182 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_blockExpr1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termOrTrue1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr0_in_expr1216 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_expr1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_expr1223 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expr1226 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_expr1229 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_expr1231 = new BitSet(new long[]{0x000A000661003410L});
    public static final BitSet FOLLOW_expr_in_expr1234 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ELSE_in_expr1237 = new BitSet(new long[]{0x000A000661003410L});
    public static final BitSet FOLLOW_expr_in_expr1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_expr1246 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expr1249 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_expr1252 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_expr1254 = new BitSet(new long[]{0x000A000661003410L});
    public static final BitSet FOLLOW_expr_in_expr1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_expr1261 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expr1264 = new BitSet(new long[]{0x0022000660000000L});
    public static final BitSet FOLLOW_expressionsList2_in_expr1267 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_expr1269 = new BitSet(new long[]{0x0022000660010000L});
    public static final BitSet FOLLOW_termOrTrue_in_expr1272 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_expr1274 = new BitSet(new long[]{0x0006000660000000L});
    public static final BitSet FOLLOW_expressionsList2_in_expr1277 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_expr1279 = new BitSet(new long[]{0x000A000661003410L});
    public static final BitSet FOLLOW_expr_in_expr1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_expr1286 = new BitSet(new long[]{0x000A000661003410L});
    public static final BitSet FOLLOW_expr_in_expr1289 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_WHILE_in_expr1291 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_expr1293 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_expr1295 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_expr1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_expr1316 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_expr1319 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_expr1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_expr1326 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_expr1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockExpr_in_expr1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_declaration_in_expr1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expressionsList1347 = new BitSet(new long[]{0x002A000661003412L});
    public static final BitSet FOLLOW_53_in_expressionsList1351 = new BitSet(new long[]{0x002A000661003410L});
    public static final BitSet FOLLOW_expr_in_expressionsList1354 = new BitSet(new long[]{0x002A000661003412L});
    public static final BitSet FOLLOW_53_in_expressionsList1362 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_expr0_in_expressionsList21384 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_expressionsList21388 = new BitSet(new long[]{0x0002000660000000L});
    public static final BitSet FOLLOW_expr0_in_expressionsList21390 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identifier_in_array_type1416 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_array_type1418 = new BitSet(new long[]{0x0082000660010000L});
    public static final BitSet FOLLOW_term_in_array_type1420 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_array_type1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_array_initialising1445 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_LT_in_array_initialising1448 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_array_initialising1450 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_array_initialising1453 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_term_in_array_initialising1455 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_GT_in_array_initialising1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_type_in_array_declaration1478 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_array_initialising_in_array_declaration1480 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_array_declaration1483 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_array_initialising_in_array_declaration1485 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identifier_in_parametersDeclaration1504 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_identifier_in_parametersDeclaration1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametersDeclaration_in_parametersDeclarations1514 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_parametersDeclarations1518 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_parametersDeclaration_in_parametersDeclarations1521 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identifier_in_func_return_type1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_return_type_in_functionDeclarations1538 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_identifier_in_functionDeclarations1540 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_functionDeclarations1542 = new BitSet(new long[]{0x0004000400000000L});
    public static final BitSet FOLLOW_parametersDeclarations_in_functionDeclarations1544 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_functionDeclarations1547 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_functionDeclarations1551 = new BitSet(new long[]{0x003A000661003410L});
    public static final BitSet FOLLOW_expressionsList_in_functionDeclarations1553 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_functionDeclarations1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionDeclarations_in_exprOrFuncDeclaration1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprOrFuncDeclaration1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprOrFuncDeclaration_in_program1598 = new BitSet(new long[]{0x002A000661003412L});
    public static final BitSet FOLLOW_53_in_program1600 = new BitSet(new long[]{0x002A000661003412L});
    public static final BitSet FOLLOW_program_in_result1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_result_in_execute1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred22_MathExpr1019 = new BitSet(new long[]{0x0002000660010000L});
    public static final BitSet FOLLOW_add_in_synpred22_MathExpr1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred26_MathExpr1125 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_synpred26_MathExpr1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr0_in_synpred30_MathExpr1216 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred30_MathExpr1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred31_MathExpr1237 = new BitSet(new long[]{0x000A000661003410L});
    public static final BitSet FOLLOW_expr_in_synpred31_MathExpr1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_synpred37_MathExpr1326 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_synpred37_MathExpr1328 = new BitSet(new long[]{0x0000000000000002L});

}