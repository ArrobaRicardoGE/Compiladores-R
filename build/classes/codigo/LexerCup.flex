package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "#"(.)* ) {/*Ignore*/}

/* Cadena */
( '.*' ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}
( \".*\" ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Tipos de datos */
( logical ) {return new Symbol(sym.Logical, yychar, yyline, yytext());}
( integer ) {return new Symbol(sym.Integer, yychar, yyline, yytext());}
( double ) {return new Symbol(sym.Double, yychar, yyline, yytext());}
( complex ) {return new Symbol(sym.Complex, yychar, yyline, yytext());}
( character ) {return new Symbol(sym.Character, yychar, yyline, yytext());}
( raw ) {return new Symbol(sym.Raw, yychar, yyline, yytext());}

/* Main */
( main ) {return new Symbol(sym.Main, yychar, yyline, yytext());} 

/* Palabra reservada Break */
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Palabra reservada Function */
( function ) {return new Symbol(sym.Function, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada In */
( in ) {return new Symbol(sym.In, yychar, yyline, yytext());}

/* Palabra reservada Next */
( next ) {return new Symbol(sym.Next, yychar, yyline, yytext());}

/* Palabra reservada Repeat */
( repeat ) {return new Symbol(sym.Repeat, yychar, yyline, yytext());}

/* Palabra reservada Return */
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}
 
 /* Palabra reservada TRUE */
( TRUE ) {return new Symbol(sym.True, yychar, yyline, yytext());}
 
 /* Palabra reservada FALSE */
( FALSE ) {return new Symbol(sym.False, yychar, yyline, yytext());}
 
 /* Palabra reservada NA */
( NA ) {return new Symbol(sym.NA, yychar, yyline, yytext());}

/* Operador asignacion */
( "<-" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operador potencia */ 
( "^" ) {return new Symbol(sym.Potencia, yychar, yyline, yytext());}

/* Operador modulo */
( "%%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Punto y coma */
( ":" ) {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}

/* Identificador */
[a-zA-Z][a-zA-Z_0-9\.]* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
\.[a-zA-Z_\.]+[a-zA-Z_\.0-9]* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
\. {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
 
/* Numero */
(-{D}+)|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Numero Real */ 
(-{D}|{D})*({D}\.|\.{D})+ {return new Symbol(sym.NumeroReal, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}