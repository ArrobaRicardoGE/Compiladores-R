/* The following code was generated by JFlex 1.4.3 on 28/03/23 07:34 PM */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 28/03/23 07:34 PM from the specification file
 * <tt>D:/ricar/Documents/UP/8/Compiladores/Compiladores-R/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 47,  7,  4,  0, 44, 45,  6, 50, 51, 41, 40,  3, 39, 59, 42, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 57, 56, 38, 49, 48,  0, 
     0, 34, 58, 58, 58, 32, 33, 58, 58, 58, 58, 58, 35, 58, 37, 58, 
    58, 58, 30, 36, 29, 31, 58, 58, 58, 58, 58, 54,  0, 55, 43,  1, 
     0, 13, 20, 12, 18, 16, 27, 10, 24, 11, 58, 26,  8, 21, 14,  9, 
    22, 58, 17, 28, 15, 19, 58, 25, 23, 58, 58, 52, 46, 53,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\2\1\17\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\1\3\13\1\5\1\1"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\4\1\0\1\24\1\0\1\25\1\0\1\25\1\4"+
    "\1\26\1\27\16\4\1\30\1\5\1\31\1\2\1\32"+
    "\1\33\1\34\1\13\1\0\1\24\1\0\6\4\1\35"+
    "\6\4\1\36\3\4\1\0\4\4\1\37\4\4\1\40"+
    "\2\4\1\41\10\4\1\42\1\43\1\4\1\44\4\4"+
    "\1\45\1\46\1\47\1\4\1\50\1\51\1\52\3\4"+
    "\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\74\0\170\0\264\0\360\0\u012c\0\u0168\0\u01a4"+
    "\0\u01e0\0\u021c\0\u0258\0\u0294\0\u02d0\0\u030c\0\u0348\0\u0384"+
    "\0\u03c0\0\u03fc\0\u0438\0\u0474\0\u04b0\0\u04ec\0\u0528\0\u0564"+
    "\0\u05a0\0\u05dc\0\u05dc\0\74\0\u0618\0\u0654\0\u0690\0\u06cc"+
    "\0\u0708\0\u06cc\0\74\0\74\0\74\0\74\0\74\0\74"+
    "\0\74\0\74\0\u0744\0\u0780\0\u07bc\0\u012c\0\u012c\0\u0168"+
    "\0\u0168\0\u07f8\0\u0834\0\u01e0\0\u0870\0\u08ac\0\u08e8\0\u0924"+
    "\0\u0960\0\u099c\0\u09d8\0\u0a14\0\u0a50\0\u0a8c\0\u0ac8\0\u0b04"+
    "\0\u0b40\0\u0b7c\0\u01e0\0\74\0\74\0\u0bb8\0\74\0\74"+
    "\0\74\0\74\0\u0bf4\0\u0c30\0\u0c6c\0\u0ca8\0\u0ce4\0\u0d20"+
    "\0\u0d5c\0\u0d98\0\u0dd4\0\u01e0\0\u0e10\0\u0e4c\0\u0e88\0\u0ec4"+
    "\0\u0f00\0\u0f3c\0\u01e0\0\u0f78\0\u0fb4\0\u0ff0\0\u102c\0\u1068"+
    "\0\u10a4\0\u10e0\0\u111c\0\u01e0\0\u1158\0\u1194\0\u11d0\0\u120c"+
    "\0\u01e0\0\u1248\0\u1284\0\u01e0\0\u12c0\0\u12fc\0\u1338\0\u1374"+
    "\0\u13b0\0\u13ec\0\u1428\0\u1464\0\u01e0\0\u01e0\0\u14a0\0\u01e0"+
    "\0\u14dc\0\u1518\0\u1554\0\u1590\0\u01e0\0\u01e0\0\u01e0\0\u15cc"+
    "\0\u01e0\0\u01e0\0\u01e0\0\u1608\0\u1644\0\u1680\0\u01e0\0\u01e0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\4\1\6\1\7\1\10"+
    "\2\11\1\12\1\13\1\11\1\14\1\11\1\15\1\16"+
    "\1\17\1\11\1\20\1\21\3\11\1\22\1\11\1\23"+
    "\1\11\1\24\3\11\1\25\3\11\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\11\1\53\76\0\1\3\44\0\1\54"+
    "\23\0\1\55\3\0\1\4\1\0\1\4\66\0\5\5"+
    "\1\0\66\5\5\56\1\0\1\57\65\56\5\60\1\0"+
    "\1\60\1\61\64\60\1\0\2\11\5\0\1\11\1\62"+
    "\34\11\24\0\2\11\1\0\2\11\5\0\36\11\24\0"+
    "\2\11\1\0\2\11\5\0\6\11\1\63\14\11\1\64"+
    "\12\11\24\0\2\11\1\0\2\11\5\0\1\11\1\65"+
    "\16\11\1\66\15\11\24\0\2\11\1\0\2\11\5\0"+
    "\10\11\1\67\25\11\24\0\2\11\1\0\2\11\5\0"+
    "\1\70\35\11\24\0\2\11\1\0\2\11\5\0\5\11"+
    "\1\71\2\11\1\72\25\11\24\0\2\11\1\0\2\11"+
    "\5\0\1\11\1\73\34\11\24\0\2\11\1\0\2\11"+
    "\5\0\11\11\1\74\24\11\24\0\2\11\1\0\2\11"+
    "\5\0\5\11\1\75\30\11\24\0\2\11\1\0\2\11"+
    "\5\0\20\11\1\76\15\11\24\0\2\11\1\0\2\11"+
    "\5\0\1\11\1\77\11\11\1\100\22\11\24\0\2\11"+
    "\1\0\2\11\5\0\26\11\1\101\7\11\24\0\2\11"+
    "\1\0\2\11\5\0\32\11\1\102\3\11\24\0\2\11"+
    "\1\0\2\11\5\0\32\11\1\103\3\11\24\0\2\11"+
    "\46\0\1\104\1\105\11\0\1\104\14\0\1\106\44\0"+
    "\1\107\11\0\1\110\62\0\1\107\10\0\1\110\73\0"+
    "\1\110\66\0\1\111\4\0\1\110\67\0\1\112\74\0"+
    "\1\112\76\0\1\104\72\0\2\104\13\0\1\11\1\55"+
    "\5\0\36\11\24\0\2\11\2\0\1\113\73\0\1\114"+
    "\70\0\1\115\1\0\2\11\5\0\2\11\1\116\33\11"+
    "\24\0\2\11\1\0\2\11\5\0\7\11\1\117\26\11"+
    "\24\0\2\11\1\0\2\11\5\0\15\11\1\120\20\11"+
    "\24\0\2\11\1\0\2\11\5\0\5\11\1\121\30\11"+
    "\24\0\2\11\1\0\2\11\5\0\17\11\1\122\16\11"+
    "\24\0\2\11\1\0\2\11\5\0\24\11\1\123\11\11"+
    "\24\0\2\11\1\0\2\11\5\0\21\11\1\124\14\11"+
    "\24\0\2\11\1\0\2\11\5\0\7\11\1\125\6\11"+
    "\1\126\17\11\24\0\2\11\1\0\2\11\5\0\13\11"+
    "\1\127\22\11\24\0\2\11\1\0\2\11\5\0\10\11"+
    "\1\130\25\11\24\0\2\11\1\0\2\11\5\0\3\11"+
    "\1\131\32\11\24\0\2\11\1\0\2\11\5\0\3\11"+
    "\1\132\32\11\24\0\2\11\1\0\2\11\5\0\11\11"+
    "\1\133\24\11\24\0\2\11\1\0\2\11\5\0\6\11"+
    "\1\134\27\11\24\0\2\11\1\0\2\11\5\0\27\11"+
    "\1\135\6\11\24\0\2\11\1\0\2\11\5\0\33\11"+
    "\1\136\2\11\24\0\2\11\2\0\1\3\44\0\1\54"+
    "\23\0\1\115\2\0\1\137\44\0\1\54\23\0\1\115"+
    "\2\0\1\114\70\0\1\55\2\0\1\55\72\0\2\11"+
    "\5\0\3\11\1\140\32\11\24\0\2\11\1\0\2\11"+
    "\5\0\10\11\1\141\25\11\24\0\2\11\1\0\2\11"+
    "\5\0\16\11\1\142\17\11\24\0\2\11\1\0\2\11"+
    "\5\0\11\11\1\143\24\11\24\0\2\11\1\0\2\11"+
    "\5\0\7\11\1\144\26\11\24\0\2\11\1\0\2\11"+
    "\5\0\10\11\1\64\25\11\24\0\2\11\1\0\2\11"+
    "\5\0\13\11\1\145\22\11\24\0\2\11\1\0\2\11"+
    "\5\0\10\11\1\146\25\11\24\0\2\11\1\0\2\11"+
    "\5\0\14\11\1\147\21\11\24\0\2\11\1\0\2\11"+
    "\5\0\5\11\1\150\30\11\24\0\2\11\1\0\2\11"+
    "\5\0\6\11\1\151\27\11\24\0\2\11\1\0\2\11"+
    "\5\0\1\152\35\11\24\0\2\11\1\0\2\11\5\0"+
    "\4\11\1\153\31\11\24\0\2\11\1\0\2\11\5\0"+
    "\30\11\1\154\5\11\24\0\2\11\1\0\2\11\5\0"+
    "\34\11\1\155\1\11\24\0\2\11\2\0\1\137\44\0"+
    "\1\54\23\0\1\55\1\0\2\11\5\0\4\11\1\156"+
    "\31\11\24\0\2\11\1\0\2\11\5\0\2\11\1\157"+
    "\33\11\24\0\2\11\1\0\2\11\5\0\1\160\35\11"+
    "\24\0\2\11\1\0\2\11\5\0\5\11\1\161\30\11"+
    "\24\0\2\11\1\0\2\11\5\0\11\11\1\162\24\11"+
    "\24\0\2\11\1\0\2\11\5\0\5\11\1\163\30\11"+
    "\24\0\2\11\1\0\2\11\5\0\1\164\35\11\24\0"+
    "\2\11\1\0\2\11\5\0\22\11\1\165\13\11\24\0"+
    "\2\11\1\0\2\11\5\0\10\11\1\166\25\11\24\0"+
    "\2\11\1\0\2\11\5\0\7\11\1\167\26\11\24\0"+
    "\2\11\1\0\2\11\5\0\30\11\1\170\5\11\24\0"+
    "\2\11\1\0\2\11\5\0\5\11\1\171\30\11\24\0"+
    "\2\11\1\0\2\11\5\0\10\11\1\172\25\11\24\0"+
    "\2\11\1\0\2\11\5\0\10\11\1\173\25\11\24\0"+
    "\2\11\1\0\2\11\5\0\4\11\1\174\31\11\24\0"+
    "\2\11\1\0\2\11\5\0\6\11\1\175\27\11\24\0"+
    "\2\11\1\0\2\11\5\0\7\11\1\176\26\11\24\0"+
    "\2\11\1\0\2\11\5\0\10\11\1\177\25\11\24\0"+
    "\2\11\1\0\2\11\5\0\3\11\1\200\32\11\24\0"+
    "\2\11\1\0\2\11\5\0\1\201\35\11\24\0\2\11"+
    "\1\0\2\11\5\0\11\11\1\202\24\11\24\0\2\11"+
    "\1\0\2\11\5\0\17\11\1\203\16\11\24\0\2\11"+
    "\1\0\2\11\5\0\7\11\1\204\26\11\24\0\2\11"+
    "\1\0\2\11\5\0\1\11\1\205\34\11\24\0\2\11"+
    "\1\0\2\11\5\0\10\11\1\206\25\11\24\0\2\11"+
    "\1\0\2\11\5\0\6\11\1\207\27\11\24\0\2\11"+
    "\1\0\2\11\5\0\11\11\1\210\24\11\24\0\2\11";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5820];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\31\1\1\11\6\1\10\11\1\1\1\0"+
    "\1\1\1\0\1\1\1\0\23\1\2\11\1\1\4\11"+
    "\1\0\1\1\1\0\21\1\1\0\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[136];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 45: break;
        case 21: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 46: break;
        case 34: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 47: break;
        case 27: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 48: break;
        case 11: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 49: break;
        case 16: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 50: break;
        case 9: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 51: break;
        case 38: 
          { return new Symbol(sym.Repeat, yychar, yyline, yytext());
          }
        case 52: break;
        case 30: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 53: break;
        case 12: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 54: break;
        case 6: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 55: break;
        case 44: 
          { return new Symbol(sym.Character, yychar, yyline, yytext());
          }
        case 56: break;
        case 43: 
          { return new Symbol(sym.Function, yychar, yyline, yytext());
          }
        case 57: break;
        case 15: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 58: break;
        case 20: 
          { return new Symbol(sym.NumeroReal, yychar, yyline, yytext());
          }
        case 59: break;
        case 28: 
          { return new Symbol(sym.Modulo, yychar, yyline, yytext());
          }
        case 60: break;
        case 40: 
          { return new Symbol(sym.Logical, yychar, yyline, yytext());
          }
        case 61: break;
        case 37: 
          { return new Symbol(sym.Return, yychar, yyline, yytext());
          }
        case 62: break;
        case 29: 
          { return new Symbol(sym.Raw, yychar, yyline, yytext());
          }
        case 63: break;
        case 17: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 64: break;
        case 23: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 65: break;
        case 26: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 66: break;
        case 19: 
          { return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());
          }
        case 67: break;
        case 39: 
          { return new Symbol(sym.Double, yychar, yyline, yytext());
          }
        case 68: break;
        case 32: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 69: break;
        case 42: 
          { return new Symbol(sym.Complex, yychar, yyline, yytext());
          }
        case 70: break;
        case 13: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 71: break;
        case 18: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 72: break;
        case 10: 
          { return new Symbol(sym.Potencia, yychar, yyline, yytext());
          }
        case 73: break;
        case 8: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 74: break;
        case 41: 
          { return new Symbol(sym.Integer, yychar, yyline, yytext());
          }
        case 75: break;
        case 7: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 76: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 77: break;
        case 36: 
          { return new Symbol(sym.False, yychar, yyline, yytext());
          }
        case 78: break;
        case 35: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 79: break;
        case 31: 
          { return new Symbol(sym.Next, yychar, yyline, yytext());
          }
        case 80: break;
        case 3: 
          { /*Ignore*/
          }
        case 81: break;
        case 25: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 82: break;
        case 33: 
          { return new Symbol(sym.True, yychar, yyline, yytext());
          }
        case 83: break;
        case 4: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 84: break;
        case 2: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 85: break;
        case 22: 
          { return new Symbol(sym.In, yychar, yyline, yytext());
          }
        case 86: break;
        case 5: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 87: break;
        case 24: 
          { return new Symbol(sym.NA, yychar, yyline, yytext());
          }
        case 88: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
