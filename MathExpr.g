grammar MathExpr;

options {
  language=Java;
  output=AST;
  backtrack=true;
  memoize=true;
}


tokens {
  DO	 = 'do'		  ;
  UNKNOWN             ;
  BLOCK               ;
  PARAMETERS          ;
  CALL                ;
  CONVERT             ;
  IF      = 'if'      ;
  ELSE    = 'else'    ;
  FOR     = 'for'     ;
  WHILE   = 'while'   ;
  AND     = '&&'     ;
  OR      = '||'      ;
  NOT     = '!'     ;
  XOR     = 'xor'     ;
  INT_DIV = 'div'     ;
  INT_MOD = 'mod'     ;
  SHR     = 'shr'     ;
  SHL     = 'shl'     ;
  IN      = 'in'      ;
  VAR     = 'var'     ;
  RETURN  = 'return'  ;
  ARRAY = 'array'	;
  CAPACITY = 'capacity'	;
  FUNCTION  = 'function'  ;
  PROGRAM   = 'program'   ;
  TRUE    = 'true'        ;
  FALSE   = 'false'       ;
}


WS:
  ( ' ' | '\t' | '\f' | '\r' | '\n' )+ {
    $channel=HIDDEN;
  }
;


ML_COMMENT:
  '/*' ( options { greedy=false; } : . )* '*/' {
    $channel=HIDDEN;
  }
;


NUMBER: ('0'..'9')+ ('.' ('0'..'9')+)?
;
IDENTIFIER:  ( 'a'..'z' | 'A'..'Z' | '_' )
        ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*
;
ADD:     '+'    ;
SUB:     '-'    ;
MUL:     '*'    ;
DIV:     '/'    ;
BIT_AND: '&'    ;
BIT_OR:  '|'    ;
ASSIGN:	 '='    ;
GE:       '>='  ;
LE:       '<='  ;
NOTEQUALS:  '!='  ;
EQUALS:   '=='   ;
GT:       '>'   ;
LT:       '<'   ;


identifier: IDENTIFIER ;


parameters: ( term (','! term)* )?  ;
call: identifier '(' parameters ')'  -> ^(CALL identifier ^(PARAMETERS parameters?)) ;

group:
  '('! term ')'!
| NUMBER
| TRUE
| FALSE
| identifier
| call
;


not:   group | NOT^ not ;
multiplex:  not ( ( MUL | DIV | BIT_AND | INT_DIV | INT_MOD )^ not )*  ;
add:   multiplex  ( ( ADD | SUB | BIT_OR )^ multiplex  )*                   ;
compare: add ( ( GE | LE | NOTEQUALS | EQUALS | GT | LT )^ add )?   ;
and_logic: compare ( AND^ compare )*    ;
or_logic: and_logic ( OR^ and_logic )*  ;
term: or_logic  ;

variableDeclaration: identifier (ASSIGN^ term)?;
variablesDeclaration: identifier variableDeclaration ( ',' variableDeclaration )* -> ^(VAR ^(identifier variableDeclaration+)) ;



expr0:
  identifier ASSIGN^ term
  | call
  | variablesDeclaration
;
blockExpr: '{'! expressionsList '}'! ;

termOrTrue:
  term
  | ( ) -> TRUE
;
expr:
  expr0 ';'!
| IF^ '('! term ')'! expr (ELSE! expr)?
| WHILE^ '('! term ')'! expr
| FOR^ '('! expressionsList2 ';'! termOrTrue ';'! expressionsList2 ')'! expr
| DO^ expr WHILE '(' term ')' -> ^(DO expr ^(WHILE term ))
| RETURN^ term ';'!
| call ';'!
| blockExpr
| array_declaration
;

expressionsList: ( expr ( ';'* expr )* )? ';'*  ->  ^(BLOCK expr*)  ;
expressionsList2: ( expr0 ( ',' expr0 )* )?  ->  ^(BLOCK expr0*)  ;

array_type: identifier '[' term? ']' -> ^(ARRAY identifier ^(CAPACITY term?) );
array_initialising: identifier ('<' term (',' term)* '>')? -> ^(identifier term*);
array_declaration:
  array_type array_initialising (',' array_initialising)* -> ^(array_type array_initialising+)
;

parametersDeclaration: identifier^ identifier ;
parametersDeclarations: parametersDeclaration ( ','! parametersDeclaration )* ;
func_return_type: identifier;
functionDeclarations:
 func_return_type identifier '(' parametersDeclarations? ')'
  '{' expressionsList '}'
  -> ^(FUNCTION func_return_type identifier ^(PARAMETERS parametersDeclarations?) expressionsList)
;

exprOrFuncDeclaration: functionDeclarations | expr ;

program: ( exprOrFuncDeclaration ';'!* )* ;

result: program -> ^(PROGRAM program) ;

execute:
  result
;


