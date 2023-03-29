package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "#"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {lexeme=yytext(); return Linea;}

/* Cadena */
( '.*' ) {lexeme=yytext(); return Cadena;}
( \".*\" ) {lexeme=yytext(); return Cadena;}

/* Tipos de datos */
( logical ) {lexeme=yytext(); return Logical;}
( integer ) {lexeme=yytext(); return Integer;}
( double ) {lexeme=yytext(); return Double;}
( complex ) {lexeme=yytext(); return Complex;}
( character ) {lexeme=yytext(); return Character;}
( raw ) {lexeme=yytext(); return Raw;}

/* Main */
( main ) {lexeme=yytext(); return Main;} 

/* Palabra reservada Break */
( break ) {lexeme=yytext(); return Break;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Palabra reservada Function */
( function ) {lexeme=yytext(); return Function;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada In */
( in ) {lexeme=yytext(); return In;}

/* Palabra reservada Next */
( next ) {lexeme=yytext(); return Next;}

/* Palabra reservada Repeat */
( repeat ) {lexeme=yytext(); return Repeat;}

/* Palabra reservada Return */
( return ) {lexeme=yytext(); return Return;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}
 
 /* Palabra reservada TRUE */
( TRUE ) {lexeme=yytext(); return True;}
 
 /* Palabra reservada FALSE */
( FALSE ) {lexeme=yytext(); return False;}
 
 /* Palabra reservada NA */
( NA ) {lexeme=yytext(); return NA;}

/* Operador asignacion */
( "<-" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operador potencia */ 
( "^" ) {lexeme=yytext(); return Potencia;}

/* Operador modulo */
( "%%" ) {lexeme=yytext(); return Modulo;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Dos puntos */
(":") {lexeme=yytext(); return Dos_puntos;}


/* Identificador */
[a-zA-Z][a-zA-Z_0-9\.]* {lexeme=yytext(); return Identificador;}
\.[a-zA-Z_\.]+[a-zA-Z_\.0-9]* {lexeme=yytext(); return Identificador;}
\. {lexeme=yytext(); return Identificador;}
 
/* Numero */
(-{D}+)|{D}+ {lexeme=yytext(); return Numero;}

/* Numero Real */ 
(-{D}|{D})*({D}\.|\.{D})+ {lexeme=yytext(); return NumeroReal;}

/* Error de analisis */
 . {return ERROR;}
