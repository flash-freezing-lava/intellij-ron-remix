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
    "\11\0\1\3\1\2\2\1\1\2\22\0\1\42\1\67\1\33\1\66\3\0\1\32\1\54\1\55\1\70\1\17"+
    "\1\63\1\17\1\30\1\4\1\20\1\25\6\27\2\16\1\62\6\0\1\47\1\35\1\40\1\22\1\31"+
    "\1\22\1\53\1\15\1\52\1\15\1\41\1\36\1\43\1\44\1\37\2\15\1\46\1\51\1\45\2\15"+
    "\1\50\3\15\1\56\1\34\1\57\1\0\1\23\1\0\1\12\1\24\2\22\1\10\1\11\5\15\1\13"+
    "\1\64\1\65\1\26\2\15\1\6\1\14\1\5\1\7\2\15\1\21\2\15\1\60\1\0\1\61\7\0\1\1"+
    "\32\0\1\3\337\0\1\3\177\0\13\3\35\0\2\1\5\0\1\3\57\0\1\3\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\1\5\3\1\4\1\1\1\4"+
    "\3\1\4\3\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\1\1\15\1\16\1\17\1\15\1\20"+
    "\1\21\1\3\1\22\1\0\2\3\1\4\1\23\6\0"+
    "\1\24\1\0\4\3\1\0\1\25\3\3\1\0\3\4"+
    "\2\26\1\24\4\3\1\27\1\30\1\3\1\23\1\3"+
    "\1\31\1\0\1\32\2\3\1\0\1\33\11\0\1\34"+
    "\2\0\1\35";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
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
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\u0357"+
    "\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\344\0\344"+
    "\0\344\0\344\0\344\0\344\0\344\0\344\0\u04e6\0\344"+
    "\0\u051f\0\344\0\u0558\0\u0591\0\344\0\u05ca\0\344\0\u0603"+
    "\0\u063c\0\u0675\0\u06ae\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb"+
    "\0\u0804\0\u03c9\0\344\0\u083d\0\u0876\0\u08af\0\u08e8\0\u0921"+
    "\0\u095a\0\344\0\u0993\0\u09cc\0\u0a05\0\u0a3e\0\u0a77\0\u0ab0"+
    "\0\u0ae9\0\344\0\u07cb\0\u03c9\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd"+
    "\0\344\0\u0201\0\u0c06\0\u0a3e\0\u0c3f\0\u0201\0\u0c78\0\u0201"+
    "\0\u0cb1\0\u0cea\0\u0d23\0\u0201\0\u0d5c\0\u0d95\0\u0dce\0\u0e07"+
    "\0\u0e40\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24\0\344\0\u0f5d\0\u0f96"+
    "\0\344";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
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
    "\4\12\1\15\1\16\1\17\4\12\1\15\1\12\1\15"+
    "\1\20\1\12\1\21\1\22\1\5\1\23\4\12\1\6"+
    "\1\12\1\24\1\12\1\25\2\12\1\26\2\12\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\2\12"+
    "\1\37\2\5\33\40\1\41\35\40\71\42\70\40\1\43"+
    "\72\0\3\6\36\0\1\6\32\0\1\44\63\0\1\45"+
    "\5\0\1\12\1\46\10\12\1\0\10\12\1\0\1\12"+
    "\3\0\5\12\1\0\11\12\10\0\2\12\10\0\12\12"+
    "\1\0\10\12\1\0\1\12\1\0\1\47\1\0\5\12"+
    "\1\0\11\12\10\0\2\12\1\50\7\0\12\12\1\0"+
    "\10\12\1\0\1\12\3\0\5\12\1\0\11\12\10\0"+
    "\2\12\10\0\12\12\1\0\10\12\1\0\1\12\3\0"+
    "\5\12\1\0\11\12\10\0\1\12\1\51\10\0\5\12"+
    "\1\52\4\12\1\0\10\12\1\0\1\12\3\0\5\12"+
    "\1\0\11\12\10\0\2\12\21\0\1\15\1\0\1\15"+
    "\2\0\1\53\1\0\1\15\1\0\1\15\1\54\56\0"+
    "\1\15\1\0\1\17\4\0\1\15\1\0\1\15\57\0"+
    "\1\15\1\0\1\15\1\55\1\0\1\53\1\56\1\15"+
    "\1\57\1\15\1\54\56\0\1\54\1\0\1\54\4\0"+
    "\1\54\1\0\1\54\41\0\2\60\1\0\30\60\1\0"+
    "\1\61\34\60\2\62\1\0\30\62\1\63\1\64\34\62"+
    "\5\0\12\12\1\0\10\12\1\0\1\12\3\0\1\12"+
    "\1\65\3\12\1\0\11\12\10\0\2\12\10\0\12\12"+
    "\1\0\6\12\1\66\1\12\1\0\1\12\3\0\5\12"+
    "\1\0\11\12\10\0\2\12\10\0\12\12\1\0\10\12"+
    "\1\0\1\12\3\0\5\12\1\0\4\12\1\67\4\12"+
    "\10\0\2\12\10\0\12\12\1\0\6\12\1\70\1\12"+
    "\1\0\1\12\3\0\5\12\1\0\11\12\10\0\2\12"+
    "\72\0\1\71\67\0\1\41\6\0\1\72\64\0\1\44"+
    "\2\0\66\44\5\0\2\12\1\73\7\12\1\0\10\12"+
    "\1\0\1\12\3\0\5\12\1\0\11\12\10\0\2\12"+
    "\36\0\1\47\32\0\1\50\7\0\5\12\1\74\4\12"+
    "\1\0\10\12\1\0\1\12\3\0\5\12\1\0\11\12"+
    "\10\0\2\12\10\0\6\12\1\75\3\12\1\0\10\12"+
    "\1\0\1\12\3\0\5\12\1\0\11\12\10\0\2\12"+
    "\21\0\1\53\1\0\1\53\2\0\1\53\1\0\1\53"+
    "\1\0\1\53\51\0\1\76\5\0\1\54\1\0\1\54"+
    "\4\0\1\54\1\0\1\54\1\0\1\76\47\0\3\77"+
    "\3\0\1\77\1\0\1\77\1\0\1\77\1\0\2\77"+
    "\1\0\1\77\1\0\1\77\3\0\1\77\2\0\1\77"+
    "\6\0\1\77\41\0\1\100\4\0\1\100\63\0\1\101"+
    "\4\0\1\101\1\0\1\101\73\0\1\102\36\0\1\60"+
    "\3\0\26\60\1\103\7\60\1\0\26\60\2\62\1\0"+
    "\30\62\1\104\1\64\34\62\5\0\12\12\1\0\10\12"+
    "\1\0\1\12\3\0\2\12\1\105\2\12\1\0\11\12"+
    "\10\0\2\12\10\0\12\12\1\0\10\12\1\0\1\12"+
    "\3\0\5\12\1\0\11\12\10\0\1\12\1\106\10\0"+
    "\12\12\1\0\10\12\1\0\1\12\3\0\5\12\1\0"+
    "\5\12\1\107\3\12\10\0\2\12\10\0\12\12\1\0"+
    "\10\12\1\0\1\12\3\0\5\12\1\0\11\12\10\0"+
    "\1\110\1\12\61\0\1\111\17\0\3\12\1\112\6\12"+
    "\1\0\10\12\1\0\1\12\3\0\5\12\1\0\11\12"+
    "\10\0\2\12\10\0\12\12\1\0\4\12\1\113\3\12"+
    "\1\0\1\12\3\0\5\12\1\0\11\12\10\0\2\12"+
    "\10\0\7\12\1\73\2\12\1\0\10\12\1\0\1\12"+
    "\3\0\5\12\1\0\11\12\10\0\2\12\21\0\1\114"+
    "\1\0\1\114\4\0\1\114\1\0\1\114\51\0\3\77"+
    "\3\0\1\77\1\0\1\77\1\0\4\77\1\0\1\77"+
    "\1\0\1\77\3\0\1\77\2\0\1\77\6\0\1\77"+
    "\41\0\1\100\2\0\1\100\1\0\1\100\63\0\1\101"+
    "\2\0\1\101\1\0\1\101\1\0\1\101\46\0\12\12"+
    "\1\0\10\12\1\0\1\12\3\0\3\12\1\115\1\12"+
    "\1\0\11\12\10\0\2\12\10\0\3\12\1\116\6\12"+
    "\1\0\10\12\1\0\1\12\3\0\5\12\1\0\11\12"+
    "\10\0\2\12\10\0\12\12\1\0\10\12\1\0\1\12"+
    "\3\0\5\12\1\117\11\12\10\0\2\12\10\0\3\12"+
    "\1\120\6\12\1\0\10\12\1\0\1\12\3\0\5\12"+
    "\1\0\11\12\10\0\2\12\10\0\6\12\1\121\3\12"+
    "\1\0\10\12\1\0\1\12\3\0\5\12\1\0\11\12"+
    "\10\0\2\12\10\0\12\12\1\0\10\12\1\0\1\12"+
    "\3\0\4\12\1\122\1\0\11\12\10\0\2\12\54\0"+
    "\1\123\24\0\3\12\1\124\6\12\1\0\10\12\1\0"+
    "\1\12\3\0\5\12\1\0\11\12\10\0\2\12\10\0"+
    "\12\12\1\0\10\12\1\0\1\12\3\0\5\12\1\125"+
    "\11\12\10\0\2\12\50\0\1\126\63\0\1\127\76\0"+
    "\1\130\61\0\1\131\103\0\1\132\61\0\1\133\71\0"+
    "\1\134\67\0\1\135\100\0\1\136\46\0\1\137\103\0"+
    "\1\140\71\0\1\141\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4047];
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
    "\4\0\1\11\21\1\10\11\1\1\1\11\1\1\1\11"+
    "\2\1\1\11\1\1\1\11\1\0\4\1\6\0\1\11"+
    "\1\0\4\1\1\0\1\11\3\1\1\0\3\1\1\11"+
    "\6\1\1\11\5\1\1\0\3\1\1\0\1\1\11\0"+
    "\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
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
            case 98: break;
            case IN_RAW_STRING_SUFFIX: {
              return imbueRawLiteral();
            }  // fall though
            case 99: break;
            case IN_BLOCK_COMMENT: {
              return imbueBlockComment();
            }  // fall though
            case 100: break;
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
            { return CHAR;
            } 
            // fall through
          case 51: break;
          case 23: 
            { return EXT_PREFIX;
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
