grammar SimpleLang;

project
    : PROJECT IDENT (constdecl | vardecl | classdecl | enumdecl | interfacedecl)* LCUR (methoddecl)* RCUR EOF
    ;

constdecl
    : CONST type IDENT ASS (NUMCONST | CHARCONST| BOOLEANCONST) (COMMA IDENT ASS (NUMCONST | CHARCONST | BOOLEANCONST))* SEMICOLON
    ;

enumdecl
    : ENUM IDENT LCUR IDENT (ASS NUMCONST)* (COMMA IDENT (ASS NUMCONST)*)* RCUR
    ;

vardecl
    : type IDENT (LSQ RSQ)* (COMMA IDENT (LSQ RSQ)*)* SEMICOLON
    ;

classdecl
    : CLASS IDENT (EXTENDS type)? (IMPLEMENTS type (COMMA type)*)? LCUR (vardecl)* (LCUR (methoddecl)* RCUR) RCUR
    ;

interfacedecl 
    : INTERFACE IDENT LCUR (interfacemethoddecl)* RCUR
    ;

interfacemethoddecl
    : (type | VOID)? IDENT LPAREN (formpars)* RPAREN SEMICOLON
    ;

methoddecl
    : (type | VOID)? IDENT LPAREN (formpars)* RPAREN (vardecl)* LCUR (statement)* RCUR
    ;

formpars
    : type IDENT (LSQ RSQ)* (COMMA type IDENT (LSQ RSQ)*)*
    ;

type
    : IDENT
    ;

statement
    : designatorstatement SEMICOLON 
    | IF LPAREN condition RPAREN statement (ELSE statement)* 
    | FOR LPAREN (designatorstatement)* SEMICOLON (condition)* SEMICOLON (designatorstatement)* RPAREN statement 
    | BREAK SEMICOLON 
    | CONTINUE SEMICOLON 
    | RETURN (expr)* SEMICOLON 
    | READ LPAREN designator RPAREN SEMICOLON 
    | PRINT LPAREN expr (COMMA NUMCONST)* RPAREN SEMICOLON 
    | LCUR (statement)* RCUR
    ;

designatorstatement
    : designator (assignop expr | LPAREN (actpars)? RPAREN | INCR | DECR)
    ;

actpars
    : expr (COMMA expr)*
    ;

condition
    : condterm (LOGICOR condterm)*
    ;

condterm
    : condfact (LOGICAND condfact)*
    ;

condfact
    : expr (relop expr)
    ;

expr
    : (MINUS)? term (addop term)*
    ;

term
    : factor (mulop factor)*
    ;

factor
    : designator (LPAREN (actpars)? RPAREN)? 
    | NUMCONST 
    | CHARCONST 
    | BOOLEANCONST 
    | NEW type (LSQ expr RSQ)* 
    | LPAREN expr RPAREN
    ;

designator
    : IDENT (PERIOD IDENT | LSQ (expr)* RSQ)*
    ;

assignop
    : ASS
    ;

relop
    : EQ 
    | NOTEQ 
    | GREATER 
    | GEQ 
    | LESS 
    | LEQ
    ;

addop
    : PLUS 
    | MINUS
    ;

mulop
    : MUL 
    | DIV 
    | MOD
    ;

PROJECT
    : 'project'
    ;

BREAK
    : 'break'
    ;

CLASS
    : 'class'
    ;

INTERFACE
    : 'interface'
    ;

ENUM
    : 'enum'
    ;

ELSE
    : 'else'
    ;

CONST
    : 'const'
    ;

IF
    : 'if'
    ;

NEW
    : 'new'
    ;

PRINT
    : 'print'
    ;

READ
    : 'read'
    ;

RETURN
    : 'return'
    ;

VOID
    : 'void'
    ;

FOR
    : 'for'
    ;

EXTENDS
    : 'extends'
    ;

CONTINUE
    : 'continue'
    ;

IMPLEMENTS
    : 'implements'
    ;

IDENT
    : LETTER (LETTER | DIGIT | '_')*
    ;

NUMCONST
    : DIGIT (DIGIT)*
    ;

CHARCONST
    : '\'' PRINTABLECHAR '\''
    ;

BOOLEANCONST
    : ('true' | 'false')
    ;

PRINTABLECHAR
    : [a-zA-Z_0-9]
    ;

LETTER
    : [a-zA-Z]
    ;

DIGIT
    : [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;


PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

MUL
    : '*'
    ;

DIV
    : '/'
    ;

MOD
    : '%'
    ;

EQ
    : '=='
    ;

NOTEQ
    : '!='
    ;

GREATER
    : '>'
    ;

GEQ
    : '>='
    ;

LESS
    : '<'
    ;

LEQ
    : '<='
    ;

LOGICAND
    : '&&'
    ;

LOGICOR
    : '||'
    ;

ASS
    : '='
    ;

INCR
    : '++'
    ;

DECR
    : '--'
    ;

SEMICOLON
    : ';'
    ;

COMMA
    : ','
    ;

PERIOD
    : '.'
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

LSQ
    : '['
    ;

RSQ
    : ']'
    ;

LCUR
    : '{'
    ;

RCUR
    : '}'
    ;

COMMENT
    : ('//' ~[\r\n]*) -> skip
    ;
