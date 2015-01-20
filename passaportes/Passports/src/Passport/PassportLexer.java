// Generated from /home/chalkos/MEI/PLC-TP/DBEmigration_PLC/passaportes/Passports/src/Passport/Passport.g4 by ANTLR 4.4.1-dev
package Passport;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PassportLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROCESS=1, YEAR=2, PROCESS_NUMBER=3, CITY_COUNCIL=4, PERSON=5, NAME=6, 
		IDENT_CARD=7, RESIDENCE=8, BIRTH_DATE=9, BIRTH_LOCAL=10, PARENTS=11, CIVIL_STATE=12, 
		SPOUSE=13, CHILDREN=14, PROFESSION=15, PROFESSION_LOCAL=16, QUALIFICATIONS=17, 
		PARENT_FATHER=18, PARENT_MOTHER=19, CHILD=20, DESTINATION=21, COUNTRY_AND_CITY=22, 
		DEPARTURE=23, DEFINED_BY=24, GROUP_START=25, GROUP_END=26, LIST_START=27, 
		LIST_END=28, ASP=29, SEPARATOR=30, HYPHEN=31, CIVIL_STATE_DEF=32, ESCAPECHARS=33, 
		ACCENTCHAR=34, SYMBOLS=35, LETTERS=36, NUM=37, WS=38, SL_COMMENT=39, ML_COMMENT=40, 
		SPACE=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'"
	};
	public static final String[] ruleNames = {
		"PROCESS", "YEAR", "PROCESS_NUMBER", "CITY_COUNCIL", "PERSON", "NAME", 
		"IDENT_CARD", "RESIDENCE", "BIRTH_DATE", "BIRTH_LOCAL", "PARENTS", "CIVIL_STATE", 
		"SPOUSE", "CHILDREN", "PROFESSION", "PROFESSION_LOCAL", "QUALIFICATIONS", 
		"PARENT_FATHER", "PARENT_MOTHER", "CHILD", "DESTINATION", "COUNTRY_AND_CITY", 
		"DEPARTURE", "DEFINED_BY", "GROUP_START", "GROUP_END", "LIST_START", "LIST_END", 
		"ASP", "SEPARATOR", "HYPHEN", "CIVIL_STATE_DEF", "ESCAPECHARS", "UNICODE", 
		"HEX", "ACCENTCHAR", "SYMBOLS", "LETTERS", "NUM", "WS", "SL_COMMENT", 
		"ML_COMMENT", "SPACE"
	};


	public PassportLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Passport.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u01e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u009c\n"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u0199\n!\3!\3!\3\"\3\"\3\"\5\"\u01a0\n\"\6\""+
		"\u01a2\n\"\r\"\16\"\u01a3\3#\3#\3#\3#\3#\3#\3$\3$\3%\6%\u01af\n%\r%\16"+
		"%\u01b0\3&\3&\3\'\6\'\u01b6\n\'\r\'\16\'\u01b7\3(\3(\3)\3)\5)\u01be\n"+
		")\3)\6)\u01c1\n)\r)\16)\u01c2\3)\3)\3*\3*\3*\3*\7*\u01cb\n*\f*\16*\u01ce"+
		"\13*\3*\3*\5*\u01d2\n*\3*\5*\u01d5\n*\3*\3*\3+\3+\3+\3+\7+\u01dd\n+\f"+
		"+\16+\u01e0\13+\3+\3+\3+\3+\3+\3,\3,\4\u01cc\u01de\2-\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I"+
		"$K%M&O\'Q(S)U*W+\3\2\20\4\2qq\u00f6\u00f6\4\2ccqq\4\2cc\u00e5\u00e5\4"+
		"\2ee\u00e9\u00e9\4\2qq\u00f7\u00f7\4\2kk\u00ef\u00ef\4\2ww\u00fc\u00fc"+
		"\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0101\6\2/\60^^\u00ac\u00ac\u00bc\u00bc\4\2C\\c|\3\2\62;\5\2\13\13\16"+
		"\16\"\"\u01f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\3Y\3\2\2\2\5e\3\2\2\2\7l\3\2\2\2\tv\3\2\2\2\13\u0080\3\2\2\2"+
		"\r\u008e\3\2\2\2\17\u0096\3\2\2\2\21\u009f\3\2\2\2\23\u00ad\3\2\2\2\25"+
		"\u00ba\3\2\2\2\27\u00c8\3\2\2\2\31\u00d0\3\2\2\2\33\u00e0\3\2\2\2\35\u00ec"+
		"\3\2\2\2\37\u00f6\3\2\2\2!\u0103\3\2\2\2#\u0115\3\2\2\2%\u0126\3\2\2\2"+
		"\'\u012d\3\2\2\2)\u0133\3\2\2\2+\u013c\3\2\2\2-\u0147\3\2\2\2/\u0159\3"+
		"\2\2\2\61\u0169\3\2\2\2\63\u016b\3\2\2\2\65\u016d\3\2\2\2\67\u016f\3\2"+
		"\2\29\u0171\3\2\2\2;\u0173\3\2\2\2=\u0175\3\2\2\2?\u0177\3\2\2\2A\u0179"+
		"\3\2\2\2C\u01a1\3\2\2\2E\u01a5\3\2\2\2G\u01ab\3\2\2\2I\u01ae\3\2\2\2K"+
		"\u01b2\3\2\2\2M\u01b5\3\2\2\2O\u01b9\3\2\2\2Q\u01c0\3\2\2\2S\u01c6\3\2"+
		"\2\2U\u01d8\3\2\2\2W\u01e6\3\2\2\2YZ\5;\36\2Z[\7r\2\2[\\\7t\2\2\\]\7q"+
		"\2\2]^\7e\2\2^_\7g\2\2_`\7u\2\2`a\7u\2\2ab\7q\2\2bc\3\2\2\2cd\5;\36\2"+
		"d\4\3\2\2\2ef\5;\36\2fg\7c\2\2gh\7p\2\2hi\7q\2\2ij\3\2\2\2jk\5;\36\2k"+
		"\6\3\2\2\2lm\5;\36\2mn\7p\2\2no\7w\2\2op\7o\2\2pq\7g\2\2qr\7t\2\2rs\7"+
		"q\2\2st\3\2\2\2tu\5;\36\2u\b\3\2\2\2vw\5;\36\2wx\7e\2\2xy\7c\2\2yz\7o"+
		"\2\2z{\7c\2\2{|\7t\2\2|}\7c\2\2}~\3\2\2\2~\177\5;\36\2\177\n\3\2\2\2\u0080"+
		"\u0081\5;\36\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7s\2"+
		"\2\u0084\u0085\7w\2\2\u0085\u0086\7g\2\2\u0086\u0087\7t\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7p\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\5;\36\2\u008d\f\3\2\2\2\u008e\u008f\5;\36\2"+
		"\u008f\u0090\7p\2\2\u0090\u0091\7q\2\2\u0091\u0092\7o\2\2\u0092\u0093"+
		"\7g\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5;\36\2\u0095\16\3\2\2\2\u0096"+
		"\u009b\5;\36\2\u0097\u0098\7d\2\2\u0098\u009c\7k\2\2\u0099\u009a\7D\2"+
		"\2\u009a\u009c\7K\2\2\u009b\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\5;\36\2\u009e\20\3\2\2\2\u009f\u00a0\5;\36\2\u00a0"+
		"\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7e\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\5;\36\2\u00ac\22\3\2\2\2\u00ad\u00ae\5;\36\2\u00ae\u00af\7f\2\2"+
		"\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7\"\2\2\u00b3\u00b4\7p\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7e\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\5;\36\2\u00b9\24\3\2\2\2"+
		"\u00ba\u00bb\5;\36\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7e\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7\"\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7e\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5;\36\2\u00c7\26\3\2\2\2\u00c8\u00c9"+
		"\5;\36\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7k\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5;\36\2\u00cf\30\3\2\2\2"+
		"\u00d0\u00d1\5;\36\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2\2\u00d7"+
		"\u00d8\7\"\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7x\2"+
		"\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\5;\36\2\u00df\32\3\2\2\2\u00e0\u00e1\5;\36\2\u00e1\u00e2\7e\2\2\u00e2"+
		"\u00e3\t\2\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7l\2\2\u00e5\u00e6\7w\2"+
		"\2\u00e6\u00e7\7i\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\5;\36\2\u00eb\34\3\2\2\2\u00ec\u00ed\5;\36\2\u00ed"+
		"\u00ee\7h\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7j\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5"+
		"\5;\36\2\u00f5\36\3\2\2\2\u00f6\u00f7\5;\36\2\u00f7\u00f8\7r\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7h\2\2\u00fb\u00fc\7k\2\2"+
		"\u00fc\u00fd\7u\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\t\4\2\2\u0100\u0101\7q\2\2\u0101\u0102\5;\36\2\u0102 \3\2\2\2\u0103\u0104"+
		"\5;\36\2\u0104\u0105\7n\2\2\u0105\u0106\7q\2\2\u0106\u0107\7e\2\2\u0107"+
		"\u0108\7c\2\2\u0108\u0109\7n\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7v\2"+
		"\2\u010b\u010c\7t\2\2\u010c\u010d\7c\2\2\u010d\u010e\7d\2\2\u010e\u010f"+
		"\7c\2\2\u010f\u0110\7n\2\2\u0110\u0111\7j\2\2\u0111\u0112\7q\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\5;\36\2\u0114\"\3\2\2\2\u0115\u0116\5;\36\2"+
		"\u0116\u0117\7j\2\2\u0117\u0118\7c\2\2\u0118\u0119\7d\2\2\u0119\u011a"+
		"\7k\2\2\u011a\u011b\7n\2\2\u011b\u011c\7k\2\2\u011c\u011d\7v\2\2\u011d"+
		"\u011e\7c\2\2\u011e\u011f\3\2\2\2\u011f\u0120\t\5\2\2\u0120\u0121\t\6"+
		"\2\2\u0121\u0122\7g\2\2\u0122\u0123\7u\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\5;\36\2\u0125$\3\2\2\2\u0126\u0127\5;\36\2\u0127\u0128\7r\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7k\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5;\36\2\u012c"+
		"&\3\2\2\2\u012d\u012e\5;\36\2\u012e\u012f\7o\2\2\u012f\u0130\t\4\2\2\u0130"+
		"\u0131\7g\2\2\u0131\u0132\5;\36\2\u0132(\3\2\2\2\u0133\u0134\5;\36\2\u0134"+
		"\u0135\7h\2\2\u0135\u0136\7k\2\2\u0136\u0137\7n\2\2\u0137\u0138\7j\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\u013a\t\3\2\2\u013a\u013b\5;\36\2\u013b*\3"+
		"\2\2\2\u013c\u013d\5;\36\2\u013d\u013e\7f\2\2\u013e\u013f\7g\2\2\u013f"+
		"\u0140\7u\2\2\u0140\u0141\7v\2\2\u0141\u0142\7k\2\2\u0142\u0143\7p\2\2"+
		"\u0143\u0144\7q\2\2\u0144\u0145\3\2\2\2\u0145\u0146\5;\36\2\u0146,\3\2"+
		"\2\2\u0147\u0148\5;\36\2\u0148\u0149\7r\2\2\u0149\u014a\7c\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\t\7\2\2\u014c\u014d\7u\2\2\u014d\u014e\7\"\2\2\u014e"+
		"\u014f\7g\2\2\u014f\u0150\7\"\2\2\u0150\u0151\7e\2\2\u0151\u0152\7k\2"+
		"\2\u0152\u0153\7f\2\2\u0153\u0154\7c\2\2\u0154\u0155\7f\2\2\u0155\u0156"+
		"\7g\2\2\u0156\u0157\3\2\2\2\u0157\u0158\5;\36\2\u0158.\3\2\2\2\u0159\u015a"+
		"\5;\36\2\u015a\u015b\7f\2\2\u015b\u015c\7c\2\2\u015c\u015d\7v\2\2\u015d"+
		"\u015e\7c\2\2\u015e\u015f\7\"\2\2\u015f\u0160\7r\2\2\u0160\u0161\7c\2"+
		"\2\u0161\u0162\7t\2\2\u0162\u0163\7v\2\2\u0163\u0164\7k\2\2\u0164\u0165"+
		"\7f\2\2\u0165\u0166\7c\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5;\36\2\u0168"+
		"\60\3\2\2\2\u0169\u016a\7<\2\2\u016a\62\3\2\2\2\u016b\u016c\7}\2\2\u016c"+
		"\64\3\2\2\2\u016d\u016e\7\177\2\2\u016e\66\3\2\2\2\u016f\u0170\7]\2\2"+
		"\u01708\3\2\2\2\u0171\u0172\7_\2\2\u0172:\3\2\2\2\u0173\u0174\7$\2\2\u0174"+
		"<\3\2\2\2\u0175\u0176\7.\2\2\u0176>\3\2\2\2\u0177\u0178\7/\2\2\u0178@"+
		"\3\2\2\2\u0179\u0198\5;\36\2\u017a\u017b\7u\2\2\u017b\u017c\7q\2\2\u017c"+
		"\u017d\7n\2\2\u017d\u017e\7v\2\2\u017e\u017f\7g\2\2\u017f\u0180\7k\2\2"+
		"\u0180\u0181\7t\2\2\u0181\u0199\7q\2\2\u0182\u0183\7e\2\2\u0183\u0184"+
		"\7c\2\2\u0184\u0185\7u\2\2\u0185\u0186\7c\2\2\u0186\u0187\7f\2\2\u0187"+
		"\u0199\7q\2\2\u0188\u0189\7f\2\2\u0189\u018a\7k\2\2\u018a\u018b\7x\2\2"+
		"\u018b\u018c\7q\2\2\u018c\u018d\7t\2\2\u018d\u018e\7e\2\2\u018e\u018f"+
		"\7k\2\2\u018f\u0190\7c\2\2\u0190\u0191\7f\2\2\u0191\u0199\7q\2\2\u0192"+
		"\u0193\7x\2\2\u0193\u0194\7k\2\2\u0194\u0195\3\2\2\2\u0195\u0196\t\b\2"+
		"\2\u0196\u0197\7x\2\2\u0197\u0199\7q\2\2\u0198\u017a\3\2\2\2\u0198\u0182"+
		"\3\2\2\2\u0198\u0188\3\2\2\2\u0198\u0192\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u019b\5;\36\2\u019bB\3\2\2\2\u019c\u019f\7^\2\2\u019d\u01a0\t\t\2\2\u019e"+
		"\u01a0\5E#\2\u019f\u019d\3\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a2\3\2\2"+
		"\2\u01a1\u019c\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4D\3\2\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\5G$\2\u01a7\u01a8"+
		"\5G$\2\u01a8\u01a9\5G$\2\u01a9\u01aa\5G$\2\u01aaF\3\2\2\2\u01ab\u01ac"+
		"\t\n\2\2\u01acH\3\2\2\2\u01ad\u01af\t\13\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1J\3\2\2\2"+
		"\u01b2\u01b3\t\f\2\2\u01b3L\3\2\2\2\u01b4\u01b6\t\r\2\2\u01b5\u01b4\3"+
		"\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"N\3\2\2\2\u01b9\u01ba\t\16\2\2\u01baP\3\2\2\2\u01bb\u01c1\t\17\2\2\u01bc"+
		"\u01be\7\17\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3"+
		"\2\2\2\u01bf\u01c1\7\f\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2"+
		"\2\2\u01c4\u01c5\b)\2\2\u01c5R\3\2\2\2\u01c6\u01c7\7\61\2\2\u01c7\u01c8"+
		"\7\61\2\2\u01c8\u01cc\3\2\2\2\u01c9\u01cb\13\2\2\2\u01ca\u01c9\3\2\2\2"+
		"\u01cb\u01ce\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d4"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d1\7\17\2\2\u01d0\u01d2\7\f\2\2"+
		"\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d5"+
		"\7\f\2\2\u01d4\u01cf\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\b*\3\2\u01d7T\3\2\2\2\u01d8\u01d9\7\61\2\2\u01d9\u01da\7,\2\2\u01da"+
		"\u01de\3\2\2\2\u01db\u01dd\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3"+
		"\2\2\2\u01de\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e2\7,\2\2\u01e2\u01e3\7\61\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e5\b+\3\2\u01e5V\3\2\2\2\u01e6\u01e7\7\"\2\2\u01e7X\3\2"+
		"\2\2\20\2\u009b\u0198\u019f\u01a3\u01b0\u01b7\u01bd\u01c0\u01c2\u01cc"+
		"\u01d1\u01d4\u01de\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}