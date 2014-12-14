// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2014-12-07 21:18:39
package generated;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MathExprLexer extends Lexer {
    public static final int SHR=20;
    public static final int FUNCTION=27;
    public static final int LT=47;
    public static final int CAPACITY=26;
    public static final int WHILE=13;
    public static final int PARAMETERS=7;
    public static final int BIT_AND=39;
    public static final int SHL=21;
    public static final int FOR=12;
    public static final int DO=4;
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
    public static final int TRUE=29;
    public static final int MUL=37;
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

    public MathExprLexer() {;} 
    public MathExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MathExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "MathExpr.g"; }

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:7:4: ( 'do' )
            // MathExpr.g:7:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:8:4: ( 'if' )
            // MathExpr.g:8:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:9:6: ( 'else' )
            // MathExpr.g:9:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:10:5: ( 'for' )
            // MathExpr.g:10:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:11:7: ( 'while' )
            // MathExpr.g:11:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:12:5: ( '&&' )
            // MathExpr.g:12:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:13:4: ( '||' )
            // MathExpr.g:13:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:14:5: ( '!' )
            // MathExpr.g:14:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:15:5: ( 'xor' )
            // MathExpr.g:15:7: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "INT_DIV"
    public final void mINT_DIV() throws RecognitionException {
        try {
            int _type = INT_DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:16:9: ( 'div' )
            // MathExpr.g:16:11: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_DIV"

    // $ANTLR start "INT_MOD"
    public final void mINT_MOD() throws RecognitionException {
        try {
            int _type = INT_MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:17:9: ( 'mod' )
            // MathExpr.g:17:11: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_MOD"

    // $ANTLR start "SHR"
    public final void mSHR() throws RecognitionException {
        try {
            int _type = SHR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:18:5: ( 'shr' )
            // MathExpr.g:18:7: 'shr'
            {
            match("shr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHR"

    // $ANTLR start "SHL"
    public final void mSHL() throws RecognitionException {
        try {
            int _type = SHL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:19:5: ( 'shl' )
            // MathExpr.g:19:7: 'shl'
            {
            match("shl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHL"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:20:4: ( 'in' )
            // MathExpr.g:20:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:21:5: ( 'var' )
            // MathExpr.g:21:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:22:8: ( 'return' )
            // MathExpr.g:22:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:23:7: ( 'array' )
            // MathExpr.g:23:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "CAPACITY"
    public final void mCAPACITY() throws RecognitionException {
        try {
            int _type = CAPACITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:24:10: ( 'capacity' )
            // MathExpr.g:24:12: 'capacity'
            {
            match("capacity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPACITY"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:25:10: ( 'function' )
            // MathExpr.g:25:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "PROGRAM"
    public final void mPROGRAM() throws RecognitionException {
        try {
            int _type = PROGRAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:26:9: ( 'program' )
            // MathExpr.g:26:11: 'program'
            {
            match("program"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROGRAM"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:27:6: ( 'true' )
            // MathExpr.g:27:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:28:7: ( 'false' )
            // MathExpr.g:28:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:29:7: ( ',' )
            // MathExpr.g:29:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:30:7: ( '(' )
            // MathExpr.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:31:7: ( ')' )
            // MathExpr.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:32:7: ( '{' )
            // MathExpr.g:32:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:33:7: ( '}' )
            // MathExpr.g:33:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:34:7: ( ';' )
            // MathExpr.g:34:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:35:7: ( '[' )
            // MathExpr.g:35:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:36:7: ( ']' )
            // MathExpr.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:43:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // MathExpr.g:44:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // MathExpr.g:44:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


                _channel=HIDDEN;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:50:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // MathExpr.g:51:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // MathExpr.g:51:8: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // MathExpr.g:51:38: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); 


                _channel=HIDDEN;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:57:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // MathExpr.g:57:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // MathExpr.g:57:9: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // MathExpr.g:57:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // MathExpr.g:57:21: ( '.' ( '0' .. '9' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // MathExpr.g:57:22: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // MathExpr.g:57:26: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // MathExpr.g:57:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:59:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // MathExpr.g:59:14: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // MathExpr.g:60:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MathExpr.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:62:4: ( '+' )
            // MathExpr.g:62:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:63:4: ( '-' )
            // MathExpr.g:63:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:64:4: ( '*' )
            // MathExpr.g:64:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:65:4: ( '/' )
            // MathExpr.g:65:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "BIT_AND"
    public final void mBIT_AND() throws RecognitionException {
        try {
            int _type = BIT_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:66:8: ( '&' )
            // MathExpr.g:66:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_AND"

    // $ANTLR start "BIT_OR"
    public final void mBIT_OR() throws RecognitionException {
        try {
            int _type = BIT_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:67:7: ( '|' )
            // MathExpr.g:67:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIT_OR"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:68:7: ( '=' )
            // MathExpr.g:68:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:69:3: ( '>=' )
            // MathExpr.g:69:11: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:70:3: ( '<=' )
            // MathExpr.g:70:11: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "NOTEQUALS"
    public final void mNOTEQUALS() throws RecognitionException {
        try {
            int _type = NOTEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:71:10: ( '!=' )
            // MathExpr.g:71:13: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUALS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:72:7: ( '==' )
            // MathExpr.g:72:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:73:3: ( '>' )
            // MathExpr.g:73:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:74:3: ( '<' )
            // MathExpr.g:74:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    public void mTokens() throws RecognitionException {
        // MathExpr.g:1:8: ( DO | IF | ELSE | FOR | WHILE | AND | OR | NOT | XOR | INT_DIV | INT_MOD | SHR | SHL | IN | VAR | RETURN | ARRAY | CAPACITY | FUNCTION | PROGRAM | TRUE | FALSE | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | WS | ML_COMMENT | NUMBER | IDENTIFIER | ADD | SUB | MUL | DIV | BIT_AND | BIT_OR | ASSIGN | GE | LE | NOTEQUALS | EQUALS | GT | LT )
        int alt7=47;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // MathExpr.g:1:10: DO
                {
                mDO(); 

                }
                break;
            case 2 :
                // MathExpr.g:1:13: IF
                {
                mIF(); 

                }
                break;
            case 3 :
                // MathExpr.g:1:16: ELSE
                {
                mELSE(); 

                }
                break;
            case 4 :
                // MathExpr.g:1:21: FOR
                {
                mFOR(); 

                }
                break;
            case 5 :
                // MathExpr.g:1:25: WHILE
                {
                mWHILE(); 

                }
                break;
            case 6 :
                // MathExpr.g:1:31: AND
                {
                mAND(); 

                }
                break;
            case 7 :
                // MathExpr.g:1:35: OR
                {
                mOR(); 

                }
                break;
            case 8 :
                // MathExpr.g:1:38: NOT
                {
                mNOT(); 

                }
                break;
            case 9 :
                // MathExpr.g:1:42: XOR
                {
                mXOR(); 

                }
                break;
            case 10 :
                // MathExpr.g:1:46: INT_DIV
                {
                mINT_DIV(); 

                }
                break;
            case 11 :
                // MathExpr.g:1:54: INT_MOD
                {
                mINT_MOD(); 

                }
                break;
            case 12 :
                // MathExpr.g:1:62: SHR
                {
                mSHR(); 

                }
                break;
            case 13 :
                // MathExpr.g:1:66: SHL
                {
                mSHL(); 

                }
                break;
            case 14 :
                // MathExpr.g:1:70: IN
                {
                mIN(); 

                }
                break;
            case 15 :
                // MathExpr.g:1:73: VAR
                {
                mVAR(); 

                }
                break;
            case 16 :
                // MathExpr.g:1:77: RETURN
                {
                mRETURN(); 

                }
                break;
            case 17 :
                // MathExpr.g:1:84: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 18 :
                // MathExpr.g:1:90: CAPACITY
                {
                mCAPACITY(); 

                }
                break;
            case 19 :
                // MathExpr.g:1:99: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 20 :
                // MathExpr.g:1:108: PROGRAM
                {
                mPROGRAM(); 

                }
                break;
            case 21 :
                // MathExpr.g:1:116: TRUE
                {
                mTRUE(); 

                }
                break;
            case 22 :
                // MathExpr.g:1:121: FALSE
                {
                mFALSE(); 

                }
                break;
            case 23 :
                // MathExpr.g:1:127: T__48
                {
                mT__48(); 

                }
                break;
            case 24 :
                // MathExpr.g:1:133: T__49
                {
                mT__49(); 

                }
                break;
            case 25 :
                // MathExpr.g:1:139: T__50
                {
                mT__50(); 

                }
                break;
            case 26 :
                // MathExpr.g:1:145: T__51
                {
                mT__51(); 

                }
                break;
            case 27 :
                // MathExpr.g:1:151: T__52
                {
                mT__52(); 

                }
                break;
            case 28 :
                // MathExpr.g:1:157: T__53
                {
                mT__53(); 

                }
                break;
            case 29 :
                // MathExpr.g:1:163: T__54
                {
                mT__54(); 

                }
                break;
            case 30 :
                // MathExpr.g:1:169: T__55
                {
                mT__55(); 

                }
                break;
            case 31 :
                // MathExpr.g:1:175: WS
                {
                mWS(); 

                }
                break;
            case 32 :
                // MathExpr.g:1:178: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 33 :
                // MathExpr.g:1:189: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 34 :
                // MathExpr.g:1:196: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 35 :
                // MathExpr.g:1:207: ADD
                {
                mADD(); 

                }
                break;
            case 36 :
                // MathExpr.g:1:211: SUB
                {
                mSUB(); 

                }
                break;
            case 37 :
                // MathExpr.g:1:215: MUL
                {
                mMUL(); 

                }
                break;
            case 38 :
                // MathExpr.g:1:219: DIV
                {
                mDIV(); 

                }
                break;
            case 39 :
                // MathExpr.g:1:223: BIT_AND
                {
                mBIT_AND(); 

                }
                break;
            case 40 :
                // MathExpr.g:1:231: BIT_OR
                {
                mBIT_OR(); 

                }
                break;
            case 41 :
                // MathExpr.g:1:238: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 42 :
                // MathExpr.g:1:245: GE
                {
                mGE(); 

                }
                break;
            case 43 :
                // MathExpr.g:1:248: LE
                {
                mLE(); 

                }
                break;
            case 44 :
                // MathExpr.g:1:251: NOTEQUALS
                {
                mNOTEQUALS(); 

                }
                break;
            case 45 :
                // MathExpr.g:1:261: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 46 :
                // MathExpr.g:1:268: GT
                {
                mGT(); 

                }
                break;
            case 47 :
                // MathExpr.g:1:271: LT
                {
                mLT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\5\35\1\56\1\60\1\62\11\35\11\uffff\1\75\5\uffff\1\77\1"+
        "\101\1\103\1\104\1\35\1\106\1\107\5\35\6\uffff\11\35\11\uffff\1"+
        "\127\2\uffff\1\35\1\131\3\35\1\135\1\136\1\137\1\140\1\141\5\35"+
        "\1\uffff\1\147\1\uffff\3\35\5\uffff\4\35\1\157\1\uffff\1\35\1\161"+
        "\1\162\1\35\1\164\2\35\1\uffff\1\35\2\uffff\1\170\1\uffff\3\35\1"+
        "\uffff\1\35\1\175\1\176\1\177\3\uffff";
    static final String DFA7_eofS =
        "\u0080\uffff";
    static final String DFA7_minS =
        "\1\11\1\151\1\146\1\154\1\141\1\150\1\46\1\174\1\75\2\157\1\150"+
        "\1\141\1\145\1\162\1\141\2\162\11\uffff\1\52\5\uffff\3\75\1\60\1"+
        "\166\2\60\1\163\1\162\1\156\1\154\1\151\6\uffff\1\162\1\144\1\154"+
        "\1\162\1\164\1\162\1\160\1\157\1\165\11\uffff\1\60\2\uffff\1\145"+
        "\1\60\1\143\1\163\1\154\5\60\1\165\2\141\1\147\1\145\1\uffff\1\60"+
        "\1\uffff\1\164\2\145\5\uffff\1\162\1\171\1\143\1\162\1\60\1\uffff"+
        "\1\151\2\60\1\156\1\60\1\151\1\141\1\uffff\1\157\2\uffff\1\60\1"+
        "\uffff\1\164\1\155\1\156\1\uffff\1\171\3\60\3\uffff";
    static final String DFA7_maxS =
        "\1\175\1\157\1\156\1\154\1\165\1\150\1\46\1\174\1\75\2\157\1\150"+
        "\1\141\1\145\1\162\1\141\2\162\11\uffff\1\52\5\uffff\3\75\1\172"+
        "\1\166\2\172\1\163\1\162\1\156\1\154\1\151\6\uffff\1\162\1\144\2"+
        "\162\1\164\1\162\1\160\1\157\1\165\11\uffff\1\172\2\uffff\1\145"+
        "\1\172\1\143\1\163\1\154\5\172\1\165\2\141\1\147\1\145\1\uffff\1"+
        "\172\1\uffff\1\164\2\145\5\uffff\1\162\1\171\1\143\1\162\1\172\1"+
        "\uffff\1\151\2\172\1\156\1\172\1\151\1\141\1\uffff\1\157\2\uffff"+
        "\1\172\1\uffff\1\164\1\155\1\156\1\uffff\1\171\3\172\3\uffff";
    static final String DFA7_acceptS =
        "\22\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\uffff"+
        "\1\41\1\42\1\43\1\44\1\45\14\uffff\1\6\1\47\1\7\1\50\1\54\1\10\11"+
        "\uffff\1\40\1\46\1\55\1\51\1\52\1\56\1\53\1\57\1\1\1\uffff\1\2\1"+
        "\16\17\uffff\1\12\1\uffff\1\4\3\uffff\1\11\1\13\1\14\1\15\1\17\5"+
        "\uffff\1\3\7\uffff\1\25\1\uffff\1\26\1\5\1\uffff\1\21\3\uffff\1"+
        "\20\4\uffff\1\24\1\23\1\22";
    static final String DFA7_specialS =
        "\u0080\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\32\1\uffff\2\32\22\uffff\1\32\1\10\4\uffff\1\6\1\uffff\1"+
            "\23\1\24\1\40\1\36\1\22\1\37\1\uffff\1\33\12\34\1\uffff\1\27"+
            "\1\43\1\41\1\42\2\uffff\32\35\1\30\1\uffff\1\31\1\uffff\1\35"+
            "\1\uffff\1\16\1\35\1\17\1\1\1\3\1\4\2\35\1\2\3\35\1\12\2\35"+
            "\1\20\1\35\1\15\1\13\1\21\1\35\1\14\1\5\1\11\2\35\1\25\1\7\1"+
            "\26",
            "\1\45\5\uffff\1\44",
            "\1\46\7\uffff\1\47",
            "\1\50",
            "\1\53\15\uffff\1\51\5\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\100",
            "\1\102",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\105",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\120\5\uffff\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\130",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\160",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\163",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
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
            return "1:1: Tokens : ( DO | IF | ELSE | FOR | WHILE | AND | OR | NOT | XOR | INT_DIV | INT_MOD | SHR | SHL | IN | VAR | RETURN | ARRAY | CAPACITY | FUNCTION | PROGRAM | TRUE | FALSE | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | WS | ML_COMMENT | NUMBER | IDENTIFIER | ADD | SUB | MUL | DIV | BIT_AND | BIT_OR | ASSIGN | GE | LE | NOTEQUALS | EQUALS | GT | LT );";
        }
    }
 

}