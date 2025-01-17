/* The following code was generated by JFlex 1.7.0-1 tweaked for IntelliJ platform */

package com.github.madwareru.intellijronremix.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.github.madwareru.intellijronremix.language.psi.RONTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-1
 * from the specification file <tt>/shared/Projects/IntelliJPlugins/intellij-ron-remix/src/main/kotlin/com/github/madwareru/intellijronremix/language/__RONLexer.flex</tt>
 */
public class __RONLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int IN_RAW_STRING = 2;
  public static final int IN_RAW_STRING_SUFFIX = 4;
  public static final int IN_BLOCK_COMMENT = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\3\1\2\2\1\1\2\22\0\1\46\1\70\1\37\1\15\3\0\1\36\1\57\1\60\1\71\1\21"+
    "\1\66\1\21\1\16\1\4\1\22\1\27\6\31\2\20\1\65\6\0\1\52\1\41\1\44\1\24\1\32"+
    "\1\24\1\56\1\17\1\55\1\17\1\45\1\42\1\47\1\33\1\43\2\17\1\51\1\54\1\50\2\17"+
    "\1\53\3\17\1\61\1\40\1\62\1\0\1\25\1\0\1\12\1\26\2\24\1\10\1\11\2\17\1\34"+
    "\2\17\1\13\1\67\1\35\1\30\2\17\1\6\1\14\1\5\1\7\2\17\1\23\2\17\1\63\1\0\1"+
    "\64\7\0\1\1\32\0\1\3\337\0\1\3\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\1\5\3\2\1\1\4\1\1"+
    "\1\4\1\3\2\1\3\3\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\15"+
    "\1\20\1\21\1\3\1\0\1\22\2\3\1\0\1\23"+
    "\1\4\6\0\1\3\3\0\1\24\1\0\3\3\1\25"+
    "\2\3\1\0\2\3\1\26\3\0\3\4\1\3\2\27"+
    "\1\24\3\3\1\30\1\3\1\23\1\0\1\23\1\31"+
    "\1\3\1\0\1\32\2\3\1\0\1\33\11\0\1\34"+
    "\2\0\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[106];
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
    "\0\0\0\72\0\164\0\256\0\350\0\u0122\0\u015c\0\u0196"+
    "\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2\0\u032c\0\u0366"+
    "\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2\0\u04fc\0\350"+
    "\0\350\0\350\0\350\0\350\0\350\0\350\0\350\0\350"+
    "\0\u0536\0\350\0\u0570\0\u05aa\0\350\0\u05e4\0\u061e\0\350"+
    "\0\u0658\0\u0692\0\u06cc\0\u0706\0\u0740\0\u02f2\0\u077a\0\u07b4"+
    "\0\u07ee\0\u0828\0\u0862\0\u089c\0\u08d6\0\u0910\0\u044e\0\350"+
    "\0\u094a\0\u0984\0\u09be\0\u09f8\0\350\0\u0a32\0\u0a6c\0\u0aa6"+
    "\0\u0ae0\0\u0b1a\0\350\0\u0b54\0\u0b8e\0\u0bc8\0\u0c02\0\u0c3c"+
    "\0\u0c76\0\u0cb0\0\350\0\u08d6\0\u044e\0\u0cea\0\u0d24\0\u0d5e"+
    "\0\u020a\0\u0d98\0\u0dd2\0\u0dd2\0\350\0\u020a\0\u0e0c\0\u0e46"+
    "\0\u020a\0\u0e80\0\u0eba\0\u0ef4\0\u020a\0\u0f2e\0\u0f68\0\u0fa2"+
    "\0\u0fdc\0\u1016\0\u1050\0\u108a\0\u10c4\0\u10fe\0\350\0\u1138"+
    "\0\u1172\0\350";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[106];
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
    "\1\5\3\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\3\12\1\15\1\16\1\12\1\17\1\20\1\21\4\12"+
    "\1\17\1\12\1\17\1\12\1\22\2\12\1\23\1\24"+
    "\1\5\1\25\4\12\1\6\2\12\1\26\2\12\1\27"+
    "\2\12\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\12\2\5\37\40\1\41\32\40\72\42\71\40"+
    "\1\43\73\0\3\6\42\0\1\6\27\0\1\44\64\0"+
    "\1\45\5\0\1\12\1\46\6\12\2\0\2\12\1\0"+
    "\14\12\3\0\5\12\1\0\10\12\10\0\1\12\7\0"+
    "\10\12\1\47\1\0\2\12\1\0\14\12\1\0\1\50"+
    "\1\0\5\12\1\0\10\12\10\0\1\12\7\0\10\12"+
    "\2\0\2\12\1\0\14\12\3\0\5\12\1\0\10\12"+
    "\10\0\1\12\7\0\10\12\2\0\2\12\1\0\13\12"+
    "\1\51\3\0\5\12\1\0\10\12\10\0\1\12\7\0"+
    "\5\12\1\52\2\12\2\0\2\12\1\0\14\12\3\0"+
    "\5\12\1\0\10\12\10\0\1\12\72\0\1\53\21\0"+
    "\1\54\1\0\1\54\4\0\1\54\1\0\1\54\56\0"+
    "\1\54\1\0\1\17\1\0\1\17\2\0\1\55\1\0"+
    "\1\17\1\0\1\17\56\0\1\56\1\0\1\17\1\0"+
    "\1\21\4\0\1\17\1\0\1\17\1\0\1\57\1\60"+
    "\53\0\1\54\1\0\1\17\1\0\1\17\1\61\1\0"+
    "\1\55\1\62\1\17\1\63\1\17\45\0\10\12\2\0"+
    "\2\12\1\0\6\12\1\64\5\12\3\0\5\12\1\0"+
    "\10\12\10\0\1\12\2\0\2\65\1\0\34\65\1\0"+
    "\1\66\31\65\2\67\1\0\34\67\1\70\1\71\31\67"+
    "\5\0\10\12\2\0\2\12\1\0\14\12\3\0\1\12"+
    "\1\72\3\12\1\0\10\12\10\0\1\12\7\0\10\12"+
    "\2\0\2\12\1\0\14\12\3\0\5\12\1\0\3\12"+
    "\1\73\4\12\10\0\1\12\7\0\10\12\2\0\2\12"+
    "\1\0\6\12\1\74\5\12\3\0\5\12\1\0\10\12"+
    "\10\0\1\12\17\0\1\41\60\0\1\75\65\0\1\44"+
    "\2\0\67\44\5\0\2\12\1\76\5\12\2\0\2\12"+
    "\1\0\14\12\3\0\5\12\1\0\10\12\10\0\1\12"+
    "\7\0\10\77\1\100\20\77\1\0\1\50\1\0\5\77"+
    "\1\0\10\77\10\0\1\77\7\0\5\12\1\101\2\12"+
    "\2\0\2\12\1\0\14\12\3\0\5\12\1\0\10\12"+
    "\10\0\1\12\7\0\6\12\1\102\1\12\2\0\2\12"+
    "\1\0\14\12\3\0\5\12\1\0\10\12\10\0\1\12"+
    "\63\0\1\103\20\0\1\104\7\0\1\54\1\0\1\54"+
    "\4\0\1\54\1\0\1\54\1\104\57\0\1\55\1\0"+
    "\1\55\2\0\1\55\1\0\1\55\1\0\1\55\52\0"+
    "\1\105\114\0\1\106\44\0\3\107\5\0\1\107\1\0"+
    "\1\107\1\0\1\107\1\0\2\107\1\0\2\107\6\0"+
    "\1\107\2\0\1\107\5\0\1\107\41\0\1\110\4\0"+
    "\1\110\64\0\1\111\4\0\1\111\1\0\1\111\45\0"+
    "\10\12\2\0\2\12\1\0\13\12\1\112\3\0\5\12"+
    "\1\0\10\12\10\0\1\12\40\0\1\113\33\0\1\65"+
    "\3\0\32\65\1\114\7\65\1\0\23\65\2\67\1\0"+
    "\34\67\1\115\1\71\31\67\5\0\10\12\2\0\2\12"+
    "\1\0\14\12\3\0\2\12\1\116\2\12\1\0\10\12"+
    "\10\0\1\12\7\0\10\12\2\0\2\12\1\0\14\12"+
    "\3\0\5\12\1\0\4\12\1\117\3\12\10\0\1\12"+
    "\7\0\10\12\2\0\2\12\1\0\14\12\3\0\5\12"+
    "\1\0\10\12\10\0\1\120\7\0\3\12\1\121\4\12"+
    "\2\0\2\12\1\0\14\12\3\0\5\12\1\0\10\12"+
    "\10\0\1\12\7\0\10\77\1\0\20\77\3\0\5\77"+
    "\1\0\10\77\10\0\1\77\17\0\1\100\21\0\1\50"+
    "\37\0\10\12\2\0\2\12\1\0\4\12\1\122\7\12"+
    "\3\0\5\12\1\0\10\12\10\0\1\12\7\0\7\12"+
    "\1\76\2\0\2\12\1\0\14\12\3\0\5\12\1\0"+
    "\10\12\10\0\1\12\22\0\1\123\1\124\1\123\4\0"+
    "\1\123\1\0\1\123\73\0\1\125\47\0\1\125\70\0"+
    "\3\107\5\0\1\107\1\0\1\107\1\0\4\107\1\0"+
    "\2\107\6\0\1\107\2\0\1\107\5\0\1\107\41\0"+
    "\1\110\2\0\1\110\1\0\1\110\64\0\1\111\2\0"+
    "\1\111\1\0\1\111\1\0\1\111\45\0\3\12\1\126"+
    "\4\12\2\0\2\12\1\0\14\12\3\0\5\12\1\0"+
    "\10\12\10\0\1\12\7\0\10\12\2\0\2\12\1\0"+
    "\14\12\3\0\3\12\1\127\1\12\1\0\10\12\10\0"+
    "\1\12\7\0\10\12\2\0\2\12\1\0\14\12\3\0"+
    "\5\12\1\130\10\12\10\0\1\12\7\0\3\12\1\131"+
    "\4\12\2\0\2\12\1\0\14\12\3\0\5\12\1\0"+
    "\10\12\10\0\1\12\7\0\6\12\1\132\1\12\2\0"+
    "\2\12\1\0\14\12\3\0\5\12\1\0\10\12\10\0"+
    "\1\12\22\0\1\123\1\0\1\123\4\0\1\123\1\0"+
    "\1\123\45\0\10\12\2\0\2\12\1\0\14\12\3\0"+
    "\4\12\1\133\1\0\10\12\10\0\1\12\56\0\1\134"+
    "\22\0\3\12\1\135\4\12\2\0\2\12\1\0\14\12"+
    "\3\0\5\12\1\0\10\12\10\0\1\12\7\0\10\12"+
    "\2\0\2\12\1\0\14\12\3\0\5\12\1\136\10\12"+
    "\10\0\1\12\52\0\1\137\65\0\1\140\76\0\1\141"+
    "\63\0\1\142\103\0\1\143\63\0\1\144\55\0\1\145"+
    "\105\0\1\146\100\0\1\147\45\0\1\150\72\0\1\151"+
    "\106\0\1\152\21\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4524];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\22\1\11\11\1\1\1\11\2\1\1\11"+
    "\1\1\1\0\1\11\2\1\1\0\2\1\6\0\1\1"+
    "\3\0\1\11\1\0\3\1\1\11\2\1\1\0\2\1"+
    "\1\11\3\0\4\1\1\11\10\1\1\0\1\11\2\1"+
    "\1\0\3\1\1\0\1\1\11\0\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[106];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public __RONLexer() {
    this((java.io.Reader)null);
  }
  private int zzShaStride = -1;

  private int zzPostponedMarkedPos = -1;
  IElementType imbueRawLiteral() {
    yybegin(YYINITIAL);

    zzStartRead = zzPostponedMarkedPos;
    zzShaStride = -1;
    zzPostponedMarkedPos = -1;

    return RAW_STRING;
  }

  IElementType imbueBlockComment() {
    yybegin(YYINITIAL);

    zzStartRead = zzPostponedMarkedPos;
    zzPostponedMarkedPos = -1;

    return BLOCK_COMMENT;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public __RONLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case IN_RAW_STRING: {
              return imbueRawLiteral();
            }  // fall though
            case 107: break;
            case IN_RAW_STRING_SUFFIX: {
              return imbueRawLiteral();
            }  // fall though
            case 108: break;
            case IN_BLOCK_COMMENT: {
              return imbueBlockComment();
            }  // fall though
            case 109: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 30: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 31: break;
          case 3: 
            { return IDENT;
            } 
            // fall through
          case 32: break;
          case 4: 
            { return INTEGER;
            } 
            // fall through
          case 33: break;
          case 5: 
            { return PARENTHESISL;
            } 
            // fall through
          case 34: break;
          case 6: 
            { return PARENTHESISR;
            } 
            // fall through
          case 35: break;
          case 7: 
            { return BRACKETL;
            } 
            // fall through
          case 36: break;
          case 8: 
            { return BRACKETR;
            } 
            // fall through
          case 37: break;
          case 9: 
            { return BRACEL;
            } 
            // fall through
          case 38: break;
          case 10: 
            { return BRACER;
            } 
            // fall through
          case 39: break;
          case 11: 
            { return COLON;
            } 
            // fall through
          case 40: break;
          case 12: 
            { return COMMA;
            } 
            // fall through
          case 41: break;
          case 13: 
            { 
            } 
            // fall through
          case 42: break;
          case 14: 
            { int shaExcess = yylength() - 1 - zzShaStride;
                          if (shaExcess >= 0) {
                              yybegin(IN_RAW_STRING_SUFFIX);
                              yypushback(shaExcess);
                          }
            } 
            // fall through
          case 43: break;
          case 15: 
            { yypushback(1);
                          return imbueRawLiteral();
            } 
            // fall through
          case 44: break;
          case 16: 
            { return COMMENT;
            } 
            // fall through
          case 45: break;
          case 17: 
            { yybegin(IN_BLOCK_COMMENT);
                         yypushback(2);
            } 
            // fall through
          case 46: break;
          case 18: 
            { yybegin(IN_RAW_STRING);
                          zzPostponedMarkedPos = zzStartRead;
                          zzShaStride = yylength() - 2;
            } 
            // fall through
          case 47: break;
          case 19: 
            { return FLOAT;
            } 
            // fall through
          case 48: break;
          case 20: 
            { return STRING;
            } 
            // fall through
          case 49: break;
          case 21: 
            { return imbueBlockComment();
            } 
            // fall through
          case 50: break;
          case 22: 
            { return EXT_PREFIX;
            } 
            // fall through
          case 51: break;
          case 23: 
            { return CHAR;
            } 
            // fall through
          case 52: break;
          case 24: 
            { return BOOLEAN;
            } 
            // fall through
          case 53: break;
          case 25: 
            { return NONE;
            } 
            // fall through
          case 54: break;
          case 26: 
            { return SOME;
            } 
            // fall through
          case 55: break;
          case 27: 
            { return ENABLE_KEYWORD;
            } 
            // fall through
          case 56: break;
          case 28: 
            { return RAW_STRING;
            } 
            // fall through
          case 57: break;
          case 29: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 58: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
