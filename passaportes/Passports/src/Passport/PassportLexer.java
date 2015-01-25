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
		T__0=1, PROCESS=2, YEAR=3, PROCESS_NUMBER=4, CITY_COUNCIL=5, PERSON=6, 
		NAME=7, IDENT_CARD=8, RESIDENCE=9, BIRTH_DATE=10, BIRTH_LOCAL=11, GENDER=12, 
		PARENTS=13, CIVIL_STATE=14, SPOUSE=15, CHILDREN=16, PROFESSION=17, PROFESSION_LOCAL=18, 
		QUALIFICATIONS=19, PARENT_FATHER=20, PARENT_MOTHER=21, CHILD=22, DESTINATION=23, 
		COUNTRY_AND_CITY=24, DEPARTURE=25, DEFINED_BY=26, GROUP_START=27, GROUP_END=28, 
		LIST_START=29, LIST_END=30, ASP=31, SEPARATOR=32, HYPHEN=33, CIVIL_STATE_DEF=34, 
		GENDER_DEF=35, ESCAPECHARS=36, ACCENTCHAR=37, SYMBOLS=38, LETTERS=39, 
		NUM=40, WS=41, SL_COMMENT=42, ML_COMMENT=43, SPACE=44;
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
		"'('", "')'", "'*'", "'+'", "','"
	};
	public static final String[] ruleNames = {
		"T__0", "PROCESS", "YEAR", "PROCESS_NUMBER", "CITY_COUNCIL", "PERSON", 
		"NAME", "IDENT_CARD", "RESIDENCE", "BIRTH_DATE", "BIRTH_LOCAL", "GENDER", 
		"PARENTS", "CIVIL_STATE", "SPOUSE", "CHILDREN", "PROFESSION", "PROFESSION_LOCAL", 
		"QUALIFICATIONS", "PARENT_FATHER", "PARENT_MOTHER", "CHILD", "DESTINATION", 
		"COUNTRY_AND_CITY", "DEPARTURE", "DEFINED_BY", "GROUP_START", "GROUP_END", 
		"LIST_START", "LIST_END", "ASP", "SEPARATOR", "HYPHEN", "CIVIL_STATE_DEF", 
		"GENDER_DEF", "ESCAPECHARS", "UNICODE", "HEX", "ACCENTCHAR", "SYMBOLS", 
		"LETTERS", "NUM", "WS", "SL_COMMENT", "ML_COMMENT", "SPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0210\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01ab\n#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c1\n$\3$\3$\3%\3%\3%\5%\u01c8"+
		"\n%\6%\u01ca\n%\r%\16%\u01cb\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\6(\u01d7\n("+
		"\r(\16(\u01d8\3)\3)\3*\6*\u01de\n*\r*\16*\u01df\3+\3+\3,\3,\5,\u01e6\n"+
		",\3,\6,\u01e9\n,\r,\16,\u01ea\3,\3,\3-\3-\3-\3-\7-\u01f3\n-\f-\16-\u01f6"+
		"\13-\3-\3-\5-\u01fa\n-\3-\5-\u01fd\n-\3-\3-\3.\3.\3.\3.\7.\u0205\n.\f"+
		".\16.\u0208\13.\3.\3.\3.\3.\3.\3/\3/\4\u01f4\u0206\2\60\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\2M\2O\'Q(S)U*W+Y,[-].\3\2\21\4\2gg\u00eb\u00eb\4\2qq\u00f6\u00f6"+
		"\4\2ccqq\4\2cc\u00e5\u00e5\4\2ee\u00e9\u00e9\4\2qq\u00f7\u00f7\4\2kk\u00ef"+
		"\u00ef\4\2ww\u00fc\u00fc\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0101\6\2/\60^^\u00ac\u00ac\u00bc\u00bc\4\2C"+
		"\\c|\3\2\62;\5\2\13\13\16\16\"\"\u021d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3"+
		"_\3\2\2\2\5a\3\2\2\2\7m\3\2\2\2\tt\3\2\2\2\13~\3\2\2\2\r\u0088\3\2\2\2"+
		"\17\u0096\3\2\2\2\21\u009e\3\2\2\2\23\u00a7\3\2\2\2\25\u00b5\3\2\2\2\27"+
		"\u00c2\3\2\2\2\31\u00d0\3\2\2\2\33\u00da\3\2\2\2\35\u00e2\3\2\2\2\37\u00f2"+
		"\3\2\2\2!\u00fe\3\2\2\2#\u0108\3\2\2\2%\u0115\3\2\2\2\'\u0127\3\2\2\2"+
		")\u0138\3\2\2\2+\u013f\3\2\2\2-\u0145\3\2\2\2/\u014e\3\2\2\2\61\u0159"+
		"\3\2\2\2\63\u016b\3\2\2\2\65\u017b\3\2\2\2\67\u017d\3\2\2\29\u017f\3\2"+
		"\2\2;\u0181\3\2\2\2=\u0183\3\2\2\2?\u0185\3\2\2\2A\u0187\3\2\2\2C\u0189"+
		"\3\2\2\2E\u018b\3\2\2\2G\u01ae\3\2\2\2I\u01c9\3\2\2\2K\u01cd\3\2\2\2M"+
		"\u01d3\3\2\2\2O\u01d6\3\2\2\2Q\u01da\3\2\2\2S\u01dd\3\2\2\2U\u01e1\3\2"+
		"\2\2W\u01e8\3\2\2\2Y\u01ee\3\2\2\2[\u0200\3\2\2\2]\u020e\3\2\2\2_`\7\61"+
		"\2\2`\4\3\2\2\2ab\5? \2bc\7r\2\2cd\7t\2\2de\7q\2\2ef\7e\2\2fg\7g\2\2g"+
		"h\7u\2\2hi\7u\2\2ij\7q\2\2jk\3\2\2\2kl\5? \2l\6\3\2\2\2mn\5? \2no\7c\2"+
		"\2op\7p\2\2pq\7q\2\2qr\3\2\2\2rs\5? \2s\b\3\2\2\2tu\5? \2uv\7p\2\2vw\7"+
		"w\2\2wx\7o\2\2xy\7g\2\2yz\7t\2\2z{\7q\2\2{|\3\2\2\2|}\5? \2}\n\3\2\2\2"+
		"~\177\5? \2\177\u0080\7e\2\2\u0080\u0081\7c\2\2\u0081\u0082\7o\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\3\2\2"+
		"\2\u0086\u0087\5? \2\u0087\f\3\2\2\2\u0088\u0089\5? \2\u0089\u008a\7t"+
		"\2\2\u008a\u008b\7g\2\2\u008b\u008c\7s\2\2\u008c\u008d\7w\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5? \2"+
		"\u0095\16\3\2\2\2\u0096\u0097\5? \2\u0097\u0098\7p\2\2\u0098\u0099\7q"+
		"\2\2\u0099\u009a\7o\2\2\u009a\u009b\7g\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\5? \2\u009d\20\3\2\2\2\u009e\u00a3\5? \2\u009f\u00a0\7d\2\2\u00a0\u00a4"+
		"\7k\2\2\u00a1\u00a2\7D\2\2\u00a2\u00a4\7K\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5? \2\u00a6\22\3\2\2\2"+
		"\u00a7\u00a8\5? \2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7"+
		"u\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af"+
		"\7p\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\5? \2\u00b4\24\3\2\2\2\u00b5\u00b6\5? \2\u00b6"+
		"\u00b7\7f\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5? \2\u00c1"+
		"\26\3\2\2\2\u00c2\u00c3\5? \2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7q\2\2\u00c5"+
		"\u00c6\7e\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7\"\2"+
		"\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd"+
		"\7e\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5? \2\u00cf\30\3\2\2\2\u00d0\u00d1"+
		"\5? \2\u00d1\u00d2\7i\2\2\u00d2\u00d3\t\2\2\2\u00d3\u00d4\7p\2\2\u00d4"+
		"\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d9\5? \2\u00d9\32\3\2\2\2\u00da\u00db\5? \2\u00db\u00dc\7"+
		"r\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7u\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\5? \2\u00e1\34\3\2\2\2\u00e2\u00e3\5? \2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7c\2\2\u00e7"+
		"\u00e8\7f\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\7e\2"+
		"\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7x\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5? \2\u00f1\36\3\2\2\2\u00f2\u00f3"+
		"\5? \2\u00f3\u00f4\7e\2\2\u00f4\u00f5\t\3\2\2\u00f5\u00f6\7p\2\2\u00f6"+
		"\u00f7\7l\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9\7i\2\2\u00f9\u00fa\7w\2\2"+
		"\u00fa\u00fb\7g\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\5? \2\u00fd \3\2\2"+
		"\2\u00fe\u00ff\5? \2\u00ff\u0100\7h\2\2\u0100\u0101\7k\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7j\2\2\u0103\u0104\3\2\2\2\u0104\u0105\t\4\2\2\u0105"+
		"\u0106\7u\2\2\u0106\u0107\5? \2\u0107\"\3\2\2\2\u0108\u0109\5? \2\u0109"+
		"\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c\u010d\7h\2\2"+
		"\u010d\u010e\7k\2\2\u010e\u010f\7u\2\2\u010f\u0110\7u\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\t\5\2\2\u0112\u0113\7q\2\2\u0113\u0114\5? \2\u0114"+
		"$\3\2\2\2\u0115\u0116\5? \2\u0116\u0117\7n\2\2\u0117\u0118\7q\2\2\u0118"+
		"\u0119\7e\2\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b\u011c\7\"\2"+
		"\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120"+
		"\7d\2\2\u0120\u0121\7c\2\2\u0121\u0122\7n\2\2\u0122\u0123\7j\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5? \2\u0126&\3\2\2\2\u0127"+
		"\u0128\5? \2\u0128\u0129\7j\2\2\u0129\u012a\7c\2\2\u012a\u012b\7d\2\2"+
		"\u012b\u012c\7k\2\2\u012c\u012d\7n\2\2\u012d\u012e\7k\2\2\u012e\u012f"+
		"\7v\2\2\u012f\u0130\7c\2\2\u0130\u0131\3\2\2\2\u0131\u0132\t\6\2\2\u0132"+
		"\u0133\t\7\2\2\u0133\u0134\7g\2\2\u0134\u0135\7u\2\2\u0135\u0136\3\2\2"+
		"\2\u0136\u0137\5? \2\u0137(\3\2\2\2\u0138\u0139\5? \2\u0139\u013a\7r\2"+
		"\2\u013a\u013b\7c\2\2\u013b\u013c\7k\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\5? \2\u013e*\3\2\2\2\u013f\u0140\5? \2\u0140\u0141\7o\2\2\u0141\u0142"+
		"\t\5\2\2\u0142\u0143\7g\2\2\u0143\u0144\5? \2\u0144,\3\2\2\2\u0145\u0146"+
		"\5? \2\u0146\u0147\7h\2\2\u0147\u0148\7k\2\2\u0148\u0149\7n\2\2\u0149"+
		"\u014a\7j\2\2\u014a\u014b\3\2\2\2\u014b\u014c\t\4\2\2\u014c\u014d\5? "+
		"\2\u014d.\3\2\2\2\u014e\u014f\5? \2\u014f\u0150\7f\2\2\u0150\u0151\7g"+
		"\2\2\u0151\u0152\7u\2\2\u0152\u0153\7v\2\2\u0153\u0154\7k\2\2\u0154\u0155"+
		"\7p\2\2\u0155\u0156\7q\2\2\u0156\u0157\3\2\2\2\u0157\u0158\5? \2\u0158"+
		"\60\3\2\2\2\u0159\u015a\5? \2\u015a\u015b\7r\2\2\u015b\u015c\7c\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015e\t\b\2\2\u015e\u015f\7u\2\2\u015f\u0160\7\""+
		"\2\2\u0160\u0161\7g\2\2\u0161\u0162\7\"\2\2\u0162\u0163\7e\2\2\u0163\u0164"+
		"\7k\2\2\u0164\u0165\7f\2\2\u0165\u0166\7c\2\2\u0166\u0167\7f\2\2\u0167"+
		"\u0168\7g\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5? \2\u016a\62\3\2\2\2\u016b"+
		"\u016c\5? \2\u016c\u016d\7f\2\2\u016d\u016e\7c\2\2\u016e\u016f\7v\2\2"+
		"\u016f\u0170\7c\2\2\u0170\u0171\7\"\2\2\u0171\u0172\7r\2\2\u0172\u0173"+
		"\7c\2\2\u0173\u0174\7t\2\2\u0174\u0175\7v\2\2\u0175\u0176\7k\2\2\u0176"+
		"\u0177\7f\2\2\u0177\u0178\7c\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5? \2"+
		"\u017a\64\3\2\2\2\u017b\u017c\7<\2\2\u017c\66\3\2\2\2\u017d\u017e\7}\2"+
		"\2\u017e8\3\2\2\2\u017f\u0180\7\177\2\2\u0180:\3\2\2\2\u0181\u0182\7]"+
		"\2\2\u0182<\3\2\2\2\u0183\u0184\7_\2\2\u0184>\3\2\2\2\u0185\u0186\7$\2"+
		"\2\u0186@\3\2\2\2\u0187\u0188\7.\2\2\u0188B\3\2\2\2\u0189\u018a\7/\2\2"+
		"\u018aD\3\2\2\2\u018b\u01aa\5? \2\u018c\u018d\7u\2\2\u018d\u018e\7q\2"+
		"\2\u018e\u018f\7n\2\2\u018f\u0190\7v\2\2\u0190\u0191\7g\2\2\u0191\u0192"+
		"\7k\2\2\u0192\u0193\7t\2\2\u0193\u01ab\7q\2\2\u0194\u0195\7e\2\2\u0195"+
		"\u0196\7c\2\2\u0196\u0197\7u\2\2\u0197\u0198\7c\2\2\u0198\u0199\7f\2\2"+
		"\u0199\u01ab\7q\2\2\u019a\u019b\7f\2\2\u019b\u019c\7k\2\2\u019c\u019d"+
		"\7x\2\2\u019d\u019e\7q\2\2\u019e\u019f\7t\2\2\u019f\u01a0\7e\2\2\u01a0"+
		"\u01a1\7k\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7f\2\2\u01a3\u01ab\7q\2\2"+
		"\u01a4\u01a5\7x\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8"+
		"\t\t\2\2\u01a8\u01a9\7x\2\2\u01a9\u01ab\7q\2\2\u01aa\u018c\3\2\2\2\u01aa"+
		"\u0194\3\2\2\2\u01aa\u019a\3\2\2\2\u01aa\u01a4\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\5? \2\u01adF\3\2\2\2\u01ae\u01c0\5? \2\u01af\u01b0\7"+
		"h\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7o\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4"+
		"\7p\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7p\2\2\u01b6\u01c1\7q\2\2\u01b7"+
		"\u01b8\7o\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb\7e\2\2"+
		"\u01bb\u01bc\7w\2\2\u01bc\u01bd\7n\2\2\u01bd\u01be\7k\2\2\u01be\u01bf"+
		"\7p\2\2\u01bf\u01c1\7q\2\2\u01c0\u01af\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\5? \2\u01c3H\3\2\2\2\u01c4\u01c7\7^\2\2\u01c5"+
		"\u01c8\t\n\2\2\u01c6\u01c8\5K&\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2"+
		"\2\u01c8\u01ca\3\2\2\2\u01c9\u01c4\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccJ\3\2\2\2\u01cd\u01ce\7w\2\2\u01ce\u01cf"+
		"\5M\'\2\u01cf\u01d0\5M\'\2\u01d0\u01d1\5M\'\2\u01d1\u01d2\5M\'\2\u01d2"+
		"L\3\2\2\2\u01d3\u01d4\t\13\2\2\u01d4N\3\2\2\2\u01d5\u01d7\t\f\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9P\3\2\2\2\u01da\u01db\t\r\2\2\u01dbR\3\2\2\2\u01dc\u01de\t\16"+
		"\2\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0T\3\2\2\2\u01e1\u01e2\t\17\2\2\u01e2V\3\2\2\2\u01e3"+
		"\u01e9\t\20\2\2\u01e4\u01e6\7\17\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3"+
		"\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\7\f\2\2\u01e8\u01e3\3\2\2\2\u01e8"+
		"\u01e5\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\b,\2\2\u01edX\3\2\2\2\u01ee\u01ef"+
		"\7\61\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f4\3\2\2\2\u01f1\u01f3\13\2\2"+
		"\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f5\u01fc\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\7\17\2\2"+
		"\u01f8\u01fa\7\f\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fd"+
		"\3\2\2\2\u01fb\u01fd\7\f\2\2\u01fc\u01f7\3\2\2\2\u01fc\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u01ff\b-\3\2\u01ffZ\3\2\2\2\u0200\u0201\7\61\2\2"+
		"\u0201\u0202\7,\2\2\u0202\u0206\3\2\2\2\u0203\u0205\13\2\2\2\u0204\u0203"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7,\2\2\u020a\u020b\7\61"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\b.\3\2\u020d\\\3\2\2\2\u020e\u020f"+
		"\7\"\2\2\u020f^\3\2\2\2\21\2\u00a3\u01aa\u01c0\u01c7\u01cb\u01d8\u01df"+
		"\u01e5\u01e8\u01ea\u01f4\u01f9\u01fc\u0206\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}