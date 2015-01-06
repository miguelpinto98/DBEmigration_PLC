// Generated from /home/chalkos/MEI/PLC-TP/DBEmigration_PLC/passaportes/Passports/src/Passport/Passport.g4 by ANTLR 4.4.1-dev
package Passport;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PassportParser extends Parser {
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
		LIST_END=28, ASP=29, SEPARATOR=30, HYPHEN=31, CIVIL_STATE_DEF=32, SPECIALCHAR=33, 
		SYMBOLS=34, LETTERS=35, NUM=36, WS=37, SL_COMMENT=38, ML_COMMENT=39, SPACE=40;
	public static final String[] tokenNames = {
		"<INVALID>", "PROCESS", "YEAR", "PROCESS_NUMBER", "CITY_COUNCIL", "PERSON", 
		"NAME", "IDENT_CARD", "RESIDENCE", "BIRTH_DATE", "BIRTH_LOCAL", "PARENTS", 
		"CIVIL_STATE", "SPOUSE", "CHILDREN", "PROFESSION", "PROFESSION_LOCAL", 
		"QUALIFICATIONS", "PARENT_FATHER", "PARENT_MOTHER", "CHILD", "DESTINATION", 
		"COUNTRY_AND_CITY", "DEPARTURE", "DEFINED_BY", "'{'", "'}'", "'['", "']'", 
		"'\"'", "','", "'-'", "CIVIL_STATE_DEF", "SPECIALCHAR", "SYMBOLS", "LETTERS", 
		"NUM", "WS", "SL_COMMENT", "ML_COMMENT", "' '"
	};
	public static final int
		RULE_passports = 0, RULE_passport = 1, RULE_process = 2, RULE_year = 3, 
		RULE_processNumber = 4, RULE_cityCouncil = 5, RULE_person = 6, RULE_name = 7, 
		RULE_identCard = 8, RULE_residence = 9, RULE_birthDate = 10, RULE_birthLocal = 11, 
		RULE_parents = 12, RULE_parentFather = 13, RULE_parentMother = 14, RULE_civilState = 15, 
		RULE_spouse = 16, RULE_children = 17, RULE_child = 18, RULE_profession = 19, 
		RULE_professionLocal = 20, RULE_qualifications = 21, RULE_destination = 22, 
		RULE_countryAndCity = 23, RULE_departure = 24, RULE_ident_card_def = 25, 
		RULE_process_number_def = 26, RULE_city_council_def = 27, RULE_complete_name_def = 28, 
		RULE_profession_def = 29, RULE_qualifications_def = 30, RULE_local_def = 31, 
		RULE_date_def = 32, RULE_numbers = 33;
	public static final String[] ruleNames = {
		"passports", "passport", "process", "year", "processNumber", "cityCouncil", 
		"person", "name", "identCard", "residence", "birthDate", "birthLocal", 
		"parents", "parentFather", "parentMother", "civilState", "spouse", "children", 
		"child", "profession", "professionLocal", "qualifications", "destination", 
		"countryAndCity", "departure", "ident_card_def", "process_number_def", 
		"city_council_def", "complete_name_def", "profession_def", "qualifications_def", 
		"local_def", "date_def", "numbers"
	};

	@Override
	public String getGrammarFileName() { return "Passport.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PassportParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PassportsContext extends ParserRuleContext {
		public Semantic inS;
		public Semantic outS;
		public PassportContext passport(int i) {
			return getRuleContext(PassportContext.class,i);
		}
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public List<PassportContext> passport() {
			return getRuleContexts(PassportContext.class);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public TerminalNode LIST_START() { return getToken(PassportParser.LIST_START, 0); }
		public TerminalNode LIST_END() { return getToken(PassportParser.LIST_END, 0); }
		public PassportsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PassportsContext(ParserRuleContext parent, int invokingState, Semantic inS) {
			super(parent, invokingState);
			this.inS = inS;
		}
		@Override public int getRuleIndex() { return RULE_passports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterPassports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitPassports(this);
		}
	}

	public final PassportsContext passports(Semantic inS) throws RecognitionException {
		PassportsContext _localctx = new PassportsContext(_ctx, getState(), inS);
		enterRule(_localctx, 0, RULE_passports);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(LIST_START);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69); passport();
					setState(70); match(SEPARATOR);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(77); passport();
			setState(78); match(LIST_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassportContext extends ParserRuleContext {
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public TerminalNode GROUP_END() { return getToken(PassportParser.GROUP_END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public PersonContext person() {
			return getRuleContext(PersonContext.class,0);
		}
		public TerminalNode GROUP_START() { return getToken(PassportParser.GROUP_START, 0); }
		public DestinationContext destination() {
			return getRuleContext(DestinationContext.class,0);
		}
		public PassportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterPassport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitPassport(this);
		}
	}

	public final PassportContext passport() throws RecognitionException {
		PassportContext _localctx = new PassportContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_passport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(GROUP_START);
			setState(81); process();
			setState(82); match(SEPARATOR);
			setState(83); person();
			setState(84); match(SEPARATOR);
			setState(85); destination();
			setState(86); match(GROUP_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode PROCESS() { return getToken(PassportParser.PROCESS, 0); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode GROUP_END() { return getToken(PassportParser.GROUP_END, 0); }
		public ProcessNumberContext processNumber() {
			return getRuleContext(ProcessNumberContext.class,0);
		}
		public CityCouncilContext cityCouncil() {
			return getRuleContext(CityCouncilContext.class,0);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public TerminalNode GROUP_START() { return getToken(PassportParser.GROUP_START, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitProcess(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(PROCESS);
			setState(89); match(DEFINED_BY);
			setState(90); match(GROUP_START);
			setState(91); year();
			setState(92); match(SEPARATOR);
			setState(93); processNumber();
			setState(94); match(SEPARATOR);
			setState(95); cityCouncil();
			setState(96); match(GROUP_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(PassportParser.YEAR, 0); }
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public NumbersContext numbers() {
			return getRuleContext(NumbersContext.class,0);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(YEAR);
			setState(99); match(DEFINED_BY);
			setState(100); numbers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcessNumberContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode PROCESS_NUMBER() { return getToken(PassportParser.PROCESS_NUMBER, 0); }
		public Process_number_defContext process_number_def() {
			return getRuleContext(Process_number_defContext.class,0);
		}
		public ProcessNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterProcessNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitProcessNumber(this);
		}
	}

	public final ProcessNumberContext processNumber() throws RecognitionException {
		ProcessNumberContext _localctx = new ProcessNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_processNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(PROCESS_NUMBER);
			setState(103); match(DEFINED_BY);
			setState(104); process_number_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CityCouncilContext extends ParserRuleContext {
		public City_council_defContext city_council_def() {
			return getRuleContext(City_council_defContext.class,0);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode CITY_COUNCIL() { return getToken(PassportParser.CITY_COUNCIL, 0); }
		public CityCouncilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cityCouncil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterCityCouncil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitCityCouncil(this);
		}
	}

	public final CityCouncilContext cityCouncil() throws RecognitionException {
		CityCouncilContext _localctx = new CityCouncilContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cityCouncil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(CITY_COUNCIL);
			setState(107); match(DEFINED_BY);
			setState(108); city_council_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonContext extends ParserRuleContext {
		public QualificationsContext qualifications() {
			return getRuleContext(QualificationsContext.class,0);
		}
		public TerminalNode PERSON() { return getToken(PassportParser.PERSON, 0); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public ChildrenContext children() {
			return getRuleContext(ChildrenContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public ParentsContext parents() {
			return getRuleContext(ParentsContext.class,0);
		}
		public IdentCardContext identCard() {
			return getRuleContext(IdentCardContext.class,0);
		}
		public SpouseContext spouse() {
			return getRuleContext(SpouseContext.class,0);
		}
		public ResidenceContext residence() {
			return getRuleContext(ResidenceContext.class,0);
		}
		public TerminalNode GROUP_END() { return getToken(PassportParser.GROUP_END, 0); }
		public BirthLocalContext birthLocal() {
			return getRuleContext(BirthLocalContext.class,0);
		}
		public ProfessionContext profession() {
			return getRuleContext(ProfessionContext.class,0);
		}
		public BirthDateContext birthDate() {
			return getRuleContext(BirthDateContext.class,0);
		}
		public ProfessionLocalContext professionLocal() {
			return getRuleContext(ProfessionLocalContext.class,0);
		}
		public CivilStateContext civilState() {
			return getRuleContext(CivilStateContext.class,0);
		}
		public TerminalNode GROUP_START() { return getToken(PassportParser.GROUP_START, 0); }
		public PersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_person; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitPerson(this);
		}
	}

	public final PersonContext person() throws RecognitionException {
		PersonContext _localctx = new PersonContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_person);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(PERSON);
			setState(111); match(DEFINED_BY);
			setState(112); match(GROUP_START);
			setState(113); name();
			setState(114); match(SEPARATOR);
			setState(115); identCard();
			setState(116); match(SEPARATOR);
			setState(117); residence();
			setState(118); match(SEPARATOR);
			setState(119); birthDate();
			setState(120); match(SEPARATOR);
			setState(121); birthLocal();
			setState(122); match(SEPARATOR);
			setState(123); parents();
			setState(124); match(SEPARATOR);
			setState(125); civilState();
			setState(126); match(SEPARATOR);
			setState(130);
			_la = _input.LA(1);
			if (_la==SPOUSE) {
				{
				setState(127); spouse();
				setState(128); match(SEPARATOR);
				}
			}

			setState(135);
			_la = _input.LA(1);
			if (_la==CHILDREN) {
				{
				setState(132); children();
				setState(133); match(SEPARATOR);
				}
			}

			setState(137); profession();
			setState(138); match(SEPARATOR);
			setState(142);
			_la = _input.LA(1);
			if (_la==PROFESSION_LOCAL) {
				{
				setState(139); professionLocal();
				setState(140); match(SEPARATOR);
				}
			}

			setState(144); qualifications();
			setState(145); match(GROUP_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode NAME() { return getToken(PassportParser.NAME, 0); }
		public Complete_name_defContext complete_name_def() {
			return getRuleContext(Complete_name_defContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(NAME);
			setState(148); match(DEFINED_BY);
			setState(149); complete_name_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentCardContext extends ParserRuleContext {
		public Ident_card_defContext ident_card_def() {
			return getRuleContext(Ident_card_defContext.class,0);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode IDENT_CARD() { return getToken(PassportParser.IDENT_CARD, 0); }
		public IdentCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterIdentCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitIdentCard(this);
		}
	}

	public final IdentCardContext identCard() throws RecognitionException {
		IdentCardContext _localctx = new IdentCardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identCard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(IDENT_CARD);
			setState(152); match(DEFINED_BY);
			setState(153); ident_card_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResidenceContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public Local_defContext local_def() {
			return getRuleContext(Local_defContext.class,0);
		}
		public TerminalNode RESIDENCE() { return getToken(PassportParser.RESIDENCE, 0); }
		public ResidenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_residence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterResidence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitResidence(this);
		}
	}

	public final ResidenceContext residence() throws RecognitionException {
		ResidenceContext _localctx = new ResidenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_residence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(RESIDENCE);
			setState(156); match(DEFINED_BY);
			setState(157); local_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BirthDateContext extends ParserRuleContext {
		public Date_defContext date_def() {
			return getRuleContext(Date_defContext.class,0);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode BIRTH_DATE() { return getToken(PassportParser.BIRTH_DATE, 0); }
		public BirthDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_birthDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterBirthDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitBirthDate(this);
		}
	}

	public final BirthDateContext birthDate() throws RecognitionException {
		BirthDateContext _localctx = new BirthDateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_birthDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(BIRTH_DATE);
			setState(160); match(DEFINED_BY);
			setState(161); date_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BirthLocalContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode BIRTH_LOCAL() { return getToken(PassportParser.BIRTH_LOCAL, 0); }
		public Local_defContext local_def() {
			return getRuleContext(Local_defContext.class,0);
		}
		public BirthLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_birthLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterBirthLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitBirthLocal(this);
		}
	}

	public final BirthLocalContext birthLocal() throws RecognitionException {
		BirthLocalContext _localctx = new BirthLocalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_birthLocal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(BIRTH_LOCAL);
			setState(164); match(DEFINED_BY);
			setState(165); local_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentsContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public ParentMotherContext parentMother() {
			return getRuleContext(ParentMotherContext.class,0);
		}
		public ParentFatherContext parentFather() {
			return getRuleContext(ParentFatherContext.class,0);
		}
		public TerminalNode GROUP_END() { return getToken(PassportParser.GROUP_END, 0); }
		public TerminalNode SEPARATOR() { return getToken(PassportParser.SEPARATOR, 0); }
		public TerminalNode PARENTS() { return getToken(PassportParser.PARENTS, 0); }
		public TerminalNode GROUP_START() { return getToken(PassportParser.GROUP_START, 0); }
		public ParentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterParents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitParents(this);
		}
	}

	public final ParentsContext parents() throws RecognitionException {
		ParentsContext _localctx = new ParentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(PARENTS);
			setState(168); match(DEFINED_BY);
			setState(169); match(GROUP_START);
			setState(173);
			_la = _input.LA(1);
			if (_la==PARENT_FATHER) {
				{
				setState(170); parentFather();
				setState(171); match(SEPARATOR);
				}
			}

			setState(176);
			_la = _input.LA(1);
			if (_la==PARENT_MOTHER) {
				{
				setState(175); parentMother();
				}
			}

			setState(178); match(GROUP_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentFatherContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode PARENT_FATHER() { return getToken(PassportParser.PARENT_FATHER, 0); }
		public Complete_name_defContext complete_name_def() {
			return getRuleContext(Complete_name_defContext.class,0);
		}
		public ParentFatherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentFather; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterParentFather(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitParentFather(this);
		}
	}

	public final ParentFatherContext parentFather() throws RecognitionException {
		ParentFatherContext _localctx = new ParentFatherContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parentFather);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(PARENT_FATHER);
			setState(181); match(DEFINED_BY);
			setState(182); complete_name_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentMotherContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public Complete_name_defContext complete_name_def() {
			return getRuleContext(Complete_name_defContext.class,0);
		}
		public TerminalNode PARENT_MOTHER() { return getToken(PassportParser.PARENT_MOTHER, 0); }
		public ParentMotherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentMother; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterParentMother(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitParentMother(this);
		}
	}

	public final ParentMotherContext parentMother() throws RecognitionException {
		ParentMotherContext _localctx = new ParentMotherContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parentMother);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); match(PARENT_MOTHER);
			setState(185); match(DEFINED_BY);
			setState(186); complete_name_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CivilStateContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode CIVIL_STATE_DEF() { return getToken(PassportParser.CIVIL_STATE_DEF, 0); }
		public TerminalNode CIVIL_STATE() { return getToken(PassportParser.CIVIL_STATE, 0); }
		public CivilStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_civilState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterCivilState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitCivilState(this);
		}
	}

	public final CivilStateContext civilState() throws RecognitionException {
		CivilStateContext _localctx = new CivilStateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_civilState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(CIVIL_STATE);
			setState(189); match(DEFINED_BY);
			setState(190); match(CIVIL_STATE_DEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpouseContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode SPOUSE() { return getToken(PassportParser.SPOUSE, 0); }
		public Complete_name_defContext complete_name_def() {
			return getRuleContext(Complete_name_defContext.class,0);
		}
		public SpouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterSpouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitSpouse(this);
		}
	}

	public final SpouseContext spouse() throws RecognitionException {
		SpouseContext _localctx = new SpouseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_spouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(SPOUSE);
			setState(193); match(DEFINED_BY);
			setState(194); complete_name_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildrenContext extends ParserRuleContext {
		public ChildContext child(int i) {
			return getRuleContext(ChildContext.class,i);
		}
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public List<ChildContext> child() {
			return getRuleContexts(ChildContext.class);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public TerminalNode LIST_START() { return getToken(PassportParser.LIST_START, 0); }
		public TerminalNode LIST_END() { return getToken(PassportParser.LIST_END, 0); }
		public TerminalNode CHILDREN() { return getToken(PassportParser.CHILDREN, 0); }
		public ChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_children; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterChildren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitChildren(this);
		}
	}

	public final ChildrenContext children() throws RecognitionException {
		ChildrenContext _localctx = new ChildrenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_children);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(CHILDREN);
			setState(197); match(DEFINED_BY);
			setState(198); match(LIST_START);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199); child();
					setState(200); match(SEPARATOR);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(207); child();
			setState(208); match(LIST_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChildContext extends ParserRuleContext {
		public Complete_name_defContext complete_name_def() {
			return getRuleContext(Complete_name_defContext.class,0);
		}
		public ChildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_child; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterChild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitChild(this);
		}
	}

	public final ChildContext child() throws RecognitionException {
		ChildContext _localctx = new ChildContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); complete_name_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfessionContext extends ParserRuleContext {
		public Profession_defContext profession_def() {
			return getRuleContext(Profession_defContext.class,0);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode PROFESSION() { return getToken(PassportParser.PROFESSION, 0); }
		public ProfessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterProfession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitProfession(this);
		}
	}

	public final ProfessionContext profession() throws RecognitionException {
		ProfessionContext _localctx = new ProfessionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_profession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(PROFESSION);
			setState(213); match(DEFINED_BY);
			setState(214); profession_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfessionLocalContext extends ParserRuleContext {
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public Local_defContext local_def() {
			return getRuleContext(Local_defContext.class,0);
		}
		public TerminalNode PROFESSION_LOCAL() { return getToken(PassportParser.PROFESSION_LOCAL, 0); }
		public ProfessionLocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_professionLocal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterProfessionLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitProfessionLocal(this);
		}
	}

	public final ProfessionLocalContext professionLocal() throws RecognitionException {
		ProfessionLocalContext _localctx = new ProfessionLocalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_professionLocal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(PROFESSION_LOCAL);
			setState(217); match(DEFINED_BY);
			setState(218); local_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualificationsContext extends ParserRuleContext {
		public TerminalNode QUALIFICATIONS() { return getToken(PassportParser.QUALIFICATIONS, 0); }
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public Qualifications_defContext qualifications_def() {
			return getRuleContext(Qualifications_defContext.class,0);
		}
		public QualificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterQualifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitQualifications(this);
		}
	}

	public final QualificationsContext qualifications() throws RecognitionException {
		QualificationsContext _localctx = new QualificationsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_qualifications);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(QUALIFICATIONS);
			setState(221); match(DEFINED_BY);
			setState(222); qualifications_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DestinationContext extends ParserRuleContext {
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public DepartureContext departure() {
			return getRuleContext(DepartureContext.class,0);
		}
		public TerminalNode GROUP_END() { return getToken(PassportParser.GROUP_END, 0); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public CountryAndCityContext countryAndCity() {
			return getRuleContext(CountryAndCityContext.class,0);
		}
		public ProfessionContext profession() {
			return getRuleContext(ProfessionContext.class,0);
		}
		public TerminalNode DESTINATION() { return getToken(PassportParser.DESTINATION, 0); }
		public ProfessionLocalContext professionLocal() {
			return getRuleContext(ProfessionLocalContext.class,0);
		}
		public TerminalNode GROUP_START() { return getToken(PassportParser.GROUP_START, 0); }
		public DestinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterDestination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitDestination(this);
		}
	}

	public final DestinationContext destination() throws RecognitionException {
		DestinationContext _localctx = new DestinationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_destination);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(DESTINATION);
			setState(225); match(DEFINED_BY);
			setState(226); match(GROUP_START);
			setState(227); countryAndCity();
			setState(228); match(SEPARATOR);
			setState(229); departure();
			setState(230); match(SEPARATOR);
			setState(231); profession();
			setState(232); match(SEPARATOR);
			setState(234);
			_la = _input.LA(1);
			if (_la==PROFESSION_LOCAL) {
				{
				setState(233); professionLocal();
				}
			}

			setState(236); match(GROUP_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountryAndCityContext extends ParserRuleContext {
		public TerminalNode COUNTRY_AND_CITY() { return getToken(PassportParser.COUNTRY_AND_CITY, 0); }
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public Local_defContext local_def() {
			return getRuleContext(Local_defContext.class,0);
		}
		public CountryAndCityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countryAndCity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterCountryAndCity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitCountryAndCity(this);
		}
	}

	public final CountryAndCityContext countryAndCity() throws RecognitionException {
		CountryAndCityContext _localctx = new CountryAndCityContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_countryAndCity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(COUNTRY_AND_CITY);
			setState(239); match(DEFINED_BY);
			setState(240); local_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DepartureContext extends ParserRuleContext {
		public Date_defContext date_def() {
			return getRuleContext(Date_defContext.class,0);
		}
		public TerminalNode DEFINED_BY() { return getToken(PassportParser.DEFINED_BY, 0); }
		public TerminalNode DEPARTURE() { return getToken(PassportParser.DEPARTURE, 0); }
		public DepartureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_departure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterDeparture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitDeparture(this);
		}
	}

	public final DepartureContext departure() throws RecognitionException {
		DepartureContext _localctx = new DepartureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_departure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); match(DEPARTURE);
			setState(243); match(DEFINED_BY);
			setState(244); date_def();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ident_card_defContext extends ParserRuleContext {
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public Ident_card_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_card_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterIdent_card_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitIdent_card_def(this);
		}
	}

	public final Ident_card_defContext ident_card_def() throws RecognitionException {
		Ident_card_defContext _localctx = new Ident_card_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ident_card_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); match(ASP);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(249);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(247); match(LETTERS);
					}
					break;
				case NUM:
					{
					setState(248); numbers();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTERS || _la==NUM );
			setState(253); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Process_number_defContext extends ParserRuleContext {
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public Process_number_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process_number_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterProcess_number_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitProcess_number_def(this);
		}
	}

	public final Process_number_defContext process_number_def() throws RecognitionException {
		Process_number_defContext _localctx = new Process_number_defContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_process_number_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(ASP);
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(258);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(256); match(LETTERS);
					}
					break;
				case NUM:
					{
					setState(257); numbers();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTERS || _la==NUM );
			setState(262); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class City_council_defContext extends ParserRuleContext {
		public List<TerminalNode> SPECIALCHAR() { return getTokens(PassportParser.SPECIALCHAR); }
		public List<TerminalNode> SPACE() { return getTokens(PassportParser.SPACE); }
		public TerminalNode SPECIALCHAR(int i) {
			return getToken(PassportParser.SPECIALCHAR, i);
		}
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(PassportParser.SPACE, i);
		}
		public City_council_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_city_council_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterCity_council_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitCity_council_def(this);
		}
	}

	public final City_council_defContext city_council_def() throws RecognitionException {
		City_council_defContext _localctx = new City_council_defContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_city_council_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(ASP);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHAR) | (1L << LETTERS) | (1L << SPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHAR) | (1L << LETTERS) | (1L << SPACE))) != 0) );
			setState(270); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Complete_name_defContext extends ParserRuleContext {
		public List<TerminalNode> SPECIALCHAR() { return getTokens(PassportParser.SPECIALCHAR); }
		public List<TerminalNode> SPACE() { return getTokens(PassportParser.SPACE); }
		public TerminalNode SPECIALCHAR(int i) {
			return getToken(PassportParser.SPECIALCHAR, i);
		}
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(PassportParser.SPACE, i);
		}
		public Complete_name_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complete_name_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterComplete_name_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitComplete_name_def(this);
		}
	}

	public final Complete_name_defContext complete_name_def() throws RecognitionException {
		Complete_name_defContext _localctx = new Complete_name_defContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_complete_name_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(ASP);
			setState(274); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(273);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHAR) | (1L << LETTERS) | (1L << SPACE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPECIALCHAR) | (1L << LETTERS) | (1L << SPACE))) != 0) );
			setState(278); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Profession_defContext extends ParserRuleContext {
		public TerminalNode SYMBOLS(int i) {
			return getToken(PassportParser.SYMBOLS, i);
		}
		public List<TerminalNode> SPECIALCHAR() { return getTokens(PassportParser.SPECIALCHAR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(PassportParser.SPACE); }
		public TerminalNode SPECIALCHAR(int i) {
			return getToken(PassportParser.SPECIALCHAR, i);
		}
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public List<TerminalNode> SYMBOLS() { return getTokens(PassportParser.SYMBOLS); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public TerminalNode SPACE(int i) {
			return getToken(PassportParser.SPACE, i);
		}
		public Profession_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profession_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterProfession_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitProfession_def(this);
		}
	}

	public final Profession_defContext profession_def() throws RecognitionException {
		Profession_defContext _localctx = new Profession_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_profession_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(ASP);
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(287);
				switch (_input.LA(1)) {
				case SPECIALCHAR:
					{
					setState(281); match(SPECIALCHAR);
					}
					break;
				case LETTERS:
					{
					setState(282); match(LETTERS);
					}
					break;
				case SYMBOLS:
					{
					setState(283); match(SYMBOLS);
					}
					break;
				case SPACE:
					{
					setState(284); match(SPACE);
					}
					break;
				case SEPARATOR:
					{
					setState(285); match(SEPARATOR);
					}
					break;
				case NUM:
					{
					setState(286); numbers();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEPARATOR) | (1L << SPECIALCHAR) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << NUM) | (1L << SPACE))) != 0) );
			setState(291); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualifications_defContext extends ParserRuleContext {
		public TerminalNode SYMBOLS(int i) {
			return getToken(PassportParser.SYMBOLS, i);
		}
		public List<TerminalNode> SPECIALCHAR() { return getTokens(PassportParser.SPECIALCHAR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(PassportParser.SPACE); }
		public TerminalNode SPECIALCHAR(int i) {
			return getToken(PassportParser.SPECIALCHAR, i);
		}
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public List<TerminalNode> SYMBOLS() { return getTokens(PassportParser.SYMBOLS); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public TerminalNode SPACE(int i) {
			return getToken(PassportParser.SPACE, i);
		}
		public Qualifications_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifications_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterQualifications_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitQualifications_def(this);
		}
	}

	public final Qualifications_defContext qualifications_def() throws RecognitionException {
		Qualifications_defContext _localctx = new Qualifications_defContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_qualifications_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); match(ASP);
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(300);
				switch (_input.LA(1)) {
				case SPECIALCHAR:
					{
					setState(294); match(SPECIALCHAR);
					}
					break;
				case LETTERS:
					{
					setState(295); match(LETTERS);
					}
					break;
				case SYMBOLS:
					{
					setState(296); match(SYMBOLS);
					}
					break;
				case SPACE:
					{
					setState(297); match(SPACE);
					}
					break;
				case SEPARATOR:
					{
					setState(298); match(SEPARATOR);
					}
					break;
				case NUM:
					{
					setState(299); numbers();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEPARATOR) | (1L << SPECIALCHAR) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << NUM) | (1L << SPACE))) != 0) );
			setState(304); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_defContext extends ParserRuleContext {
		public TerminalNode SYMBOLS(int i) {
			return getToken(PassportParser.SYMBOLS, i);
		}
		public List<TerminalNode> SPECIALCHAR() { return getTokens(PassportParser.SPECIALCHAR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(PassportParser.SEPARATOR, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(PassportParser.SPACE); }
		public TerminalNode SPECIALCHAR(int i) {
			return getToken(PassportParser.SPECIALCHAR, i);
		}
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public List<TerminalNode> SEPARATOR() { return getTokens(PassportParser.SEPARATOR); }
		public List<TerminalNode> SYMBOLS() { return getTokens(PassportParser.SYMBOLS); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public List<TerminalNode> LETTERS() { return getTokens(PassportParser.LETTERS); }
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public TerminalNode LETTERS(int i) {
			return getToken(PassportParser.LETTERS, i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public TerminalNode SPACE(int i) {
			return getToken(PassportParser.SPACE, i);
		}
		public Local_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterLocal_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitLocal_def(this);
		}
	}

	public final Local_defContext local_def() throws RecognitionException {
		Local_defContext _localctx = new Local_defContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_local_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(ASP);
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(313);
				switch (_input.LA(1)) {
				case SPECIALCHAR:
					{
					setState(307); match(SPECIALCHAR);
					}
					break;
				case LETTERS:
					{
					setState(308); match(LETTERS);
					}
					break;
				case SYMBOLS:
					{
					setState(309); match(SYMBOLS);
					}
					break;
				case SPACE:
					{
					setState(310); match(SPACE);
					}
					break;
				case SEPARATOR:
					{
					setState(311); match(SEPARATOR);
					}
					break;
				case NUM:
					{
					setState(312); numbers();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEPARATOR) | (1L << SPECIALCHAR) | (1L << SYMBOLS) | (1L << LETTERS) | (1L << NUM) | (1L << SPACE))) != 0) );
			setState(317); match(ASP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_defContext extends ParserRuleContext {
		public int out_year;
		public int out_month;
		public int out_day;
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public Token e;
		public Token f;
		public Token g;
		public Token h;
		public TerminalNode HYPHEN(int i) {
			return getToken(PassportParser.HYPHEN, i);
		}
		public List<TerminalNode> ASP() { return getTokens(PassportParser.ASP); }
		public List<TerminalNode> HYPHEN() { return getTokens(PassportParser.HYPHEN); }
		public TerminalNode ASP(int i) {
			return getToken(PassportParser.ASP, i);
		}
		public TerminalNode NUM(int i) {
			return getToken(PassportParser.NUM, i);
		}
		public List<TerminalNode> NUM() { return getTokens(PassportParser.NUM); }
		public Date_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterDate_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitDate_def(this);
		}
	}

	public final Date_defContext date_def() throws RecognitionException {
		Date_defContext _localctx = new Date_defContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_date_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(ASP);
			setState(320); ((Date_defContext)_localctx).a = match(NUM);
			setState(321); ((Date_defContext)_localctx).b = match(NUM);
			setState(322); ((Date_defContext)_localctx).c = match(NUM);
			setState(323); ((Date_defContext)_localctx).d = match(NUM);
			setState(324); match(HYPHEN);
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(325); ((Date_defContext)_localctx).e = match(NUM);
				}
				break;
			}
			setState(328); ((Date_defContext)_localctx).f = match(NUM);
			setState(329); match(HYPHEN);
			setState(331);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(330); ((Date_defContext)_localctx).g = match(NUM);
				}
				break;
			}
			setState(333); ((Date_defContext)_localctx).h = match(NUM);
			setState(334); match(ASP);

			           ((Date_defContext)_localctx).out_year =  Integer.parseInt((((Date_defContext)_localctx).a!=null?((Date_defContext)_localctx).a.getText():null)+(((Date_defContext)_localctx).b!=null?((Date_defContext)_localctx).b.getText():null)+(((Date_defContext)_localctx).c!=null?((Date_defContext)_localctx).c.getText():null)+(((Date_defContext)_localctx).d!=null?((Date_defContext)_localctx).d.getText():null));
			           ((Date_defContext)_localctx).out_month =  Integer.parseInt((((Date_defContext)_localctx).e!=null?((Date_defContext)_localctx).e.getText():null)+(((Date_defContext)_localctx).f!=null?((Date_defContext)_localctx).f.getText():null));
			           ((Date_defContext)_localctx).out_day =  Integer.parseInt((((Date_defContext)_localctx).g!=null?((Date_defContext)_localctx).g.getText():null)+(((Date_defContext)_localctx).h!=null?((Date_defContext)_localctx).h.getText():null));
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumbersContext extends ParserRuleContext {
		public int out_int;
		public Token NUM;
		public TerminalNode NUM(int i) {
			return getToken(PassportParser.NUM, i);
		}
		public List<TerminalNode> NUM() { return getTokens(PassportParser.NUM); }
		public NumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).enterNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PassportListener ) ((PassportListener)listener).exitNumbers(this);
		}
	}

	public final NumbersContext numbers() throws RecognitionException {
		NumbersContext _localctx = new NumbersContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numbers);
		 ((NumbersContext)_localctx).out_int =  0; 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(337); ((NumbersContext)_localctx).NUM = match(NUM);
					 ((NumbersContext)_localctx).out_int =  _localctx.out_int*10 + Integer.parseInt((((NumbersContext)_localctx).NUM!=null?((NumbersContext)_localctx).NUM.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085"+
		"\n\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0091\n\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b0\n\16\3\16"+
		"\5\16\u00b3\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u00cd\n\23\f\23\16\23\u00d0\13\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ed\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\6\33\u00fc\n\33\r\33\16\33\u00fd"+
		"\3\33\3\33\3\34\3\34\3\34\6\34\u0105\n\34\r\34\16\34\u0106\3\34\3\34\3"+
		"\35\3\35\6\35\u010d\n\35\r\35\16\35\u010e\3\35\3\35\3\36\3\36\6\36\u0115"+
		"\n\36\r\36\16\36\u0116\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6"+
		"\37\u0122\n\37\r\37\16\37\u0123\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \6 \u012f"+
		"\n \r \16 \u0130\3 \3 \3!\3!\3!\3!\3!\3!\3!\6!\u013c\n!\r!\16!\u013d\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0149\n\"\3\"\3\"\3\"\5\"\u014e\n"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\6#\u0156\n#\r#\16#\u0157\3#\2\2$\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\3\5\2##%%**"+
		"\u015a\2F\3\2\2\2\4R\3\2\2\2\6Z\3\2\2\2\bd\3\2\2\2\nh\3\2\2\2\fl\3\2\2"+
		"\2\16p\3\2\2\2\20\u0095\3\2\2\2\22\u0099\3\2\2\2\24\u009d\3\2\2\2\26\u00a1"+
		"\3\2\2\2\30\u00a5\3\2\2\2\32\u00a9\3\2\2\2\34\u00b6\3\2\2\2\36\u00ba\3"+
		"\2\2\2 \u00be\3\2\2\2\"\u00c2\3\2\2\2$\u00c6\3\2\2\2&\u00d4\3\2\2\2(\u00d6"+
		"\3\2\2\2*\u00da\3\2\2\2,\u00de\3\2\2\2.\u00e2\3\2\2\2\60\u00f0\3\2\2\2"+
		"\62\u00f4\3\2\2\2\64\u00f8\3\2\2\2\66\u0101\3\2\2\28\u010a\3\2\2\2:\u0112"+
		"\3\2\2\2<\u011a\3\2\2\2>\u0127\3\2\2\2@\u0134\3\2\2\2B\u0141\3\2\2\2D"+
		"\u0155\3\2\2\2FL\7\35\2\2GH\5\4\3\2HI\7 \2\2IK\3\2\2\2JG\3\2\2\2KN\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\5\4\3\2PQ\7\36\2\2Q\3\3"+
		"\2\2\2RS\7\33\2\2ST\5\6\4\2TU\7 \2\2UV\5\16\b\2VW\7 \2\2WX\5.\30\2XY\7"+
		"\34\2\2Y\5\3\2\2\2Z[\7\3\2\2[\\\7\32\2\2\\]\7\33\2\2]^\5\b\5\2^_\7 \2"+
		"\2_`\5\n\6\2`a\7 \2\2ab\5\f\7\2bc\7\34\2\2c\7\3\2\2\2de\7\4\2\2ef\7\32"+
		"\2\2fg\5D#\2g\t\3\2\2\2hi\7\5\2\2ij\7\32\2\2jk\5\66\34\2k\13\3\2\2\2l"+
		"m\7\6\2\2mn\7\32\2\2no\58\35\2o\r\3\2\2\2pq\7\7\2\2qr\7\32\2\2rs\7\33"+
		"\2\2st\5\20\t\2tu\7 \2\2uv\5\22\n\2vw\7 \2\2wx\5\24\13\2xy\7 \2\2yz\5"+
		"\26\f\2z{\7 \2\2{|\5\30\r\2|}\7 \2\2}~\5\32\16\2~\177\7 \2\2\177\u0080"+
		"\5 \21\2\u0080\u0084\7 \2\2\u0081\u0082\5\"\22\2\u0082\u0083\7 \2\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0089\3\2"+
		"\2\2\u0086\u0087\5$\23\2\u0087\u0088\7 \2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5("+
		"\25\2\u008c\u0090\7 \2\2\u008d\u008e\5*\26\2\u008e\u008f\7 \2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\5,\27\2\u0093\u0094\7\34\2\2\u0094\17\3\2\2\2\u0095\u0096"+
		"\7\b\2\2\u0096\u0097\7\32\2\2\u0097\u0098\5:\36\2\u0098\21\3\2\2\2\u0099"+
		"\u009a\7\t\2\2\u009a\u009b\7\32\2\2\u009b\u009c\5\64\33\2\u009c\23\3\2"+
		"\2\2\u009d\u009e\7\n\2\2\u009e\u009f\7\32\2\2\u009f\u00a0\5@!\2\u00a0"+
		"\25\3\2\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4\5B\""+
		"\2\u00a4\27\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\7\32\2\2\u00a7\u00a8"+
		"\5@!\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\7\32\2\2\u00ab"+
		"\u00af\7\33\2\2\u00ac\u00ad\5\34\17\2\u00ad\u00ae\7 \2\2\u00ae\u00b0\3"+
		"\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00b3\5\36\20\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\7\34\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\24\2\2\u00b7"+
		"\u00b8\7\32\2\2\u00b8\u00b9\5:\36\2\u00b9\35\3\2\2\2\u00ba\u00bb\7\25"+
		"\2\2\u00bb\u00bc\7\32\2\2\u00bc\u00bd\5:\36\2\u00bd\37\3\2\2\2\u00be\u00bf"+
		"\7\16\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c1\7\"\2\2\u00c1!\3\2\2\2\u00c2"+
		"\u00c3\7\17\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\5:\36\2\u00c5#\3\2\2"+
		"\2\u00c6\u00c7\7\20\2\2\u00c7\u00c8\7\32\2\2\u00c8\u00ce\7\35\2\2\u00c9"+
		"\u00ca\5&\24\2\u00ca\u00cb\7 \2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5&\24\2\u00d2\u00d3\7\36"+
		"\2\2\u00d3%\3\2\2\2\u00d4\u00d5\5:\36\2\u00d5\'\3\2\2\2\u00d6\u00d7\7"+
		"\21\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00d9\5<\37\2\u00d9)\3\2\2\2\u00da"+
		"\u00db\7\22\2\2\u00db\u00dc\7\32\2\2\u00dc\u00dd\5@!\2\u00dd+\3\2\2\2"+
		"\u00de\u00df\7\23\2\2\u00df\u00e0\7\32\2\2\u00e0\u00e1\5> \2\u00e1-\3"+
		"\2\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\7\32\2\2\u00e4\u00e5\7\33\2\2"+
		"\u00e5\u00e6\5\60\31\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\5\62\32\2\u00e8"+
		"\u00e9\7 \2\2\u00e9\u00ea\5(\25\2\u00ea\u00ec\7 \2\2\u00eb\u00ed\5*\26"+
		"\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7\34\2\2\u00ef/\3\2\2\2\u00f0\u00f1\7\30\2\2\u00f1\u00f2\7\32\2\2\u00f2"+
		"\u00f3\5@!\2\u00f3\61\3\2\2\2\u00f4\u00f5\7\31\2\2\u00f5\u00f6\7\32\2"+
		"\2\u00f6\u00f7\5B\"\2\u00f7\63\3\2\2\2\u00f8\u00fb\7\37\2\2\u00f9\u00fc"+
		"\7%\2\2\u00fa\u00fc\5D#\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0100\7\37\2\2\u0100\65\3\2\2\2\u0101\u0104\7\37\2\2\u0102"+
		"\u0105\7%\2\2\u0103\u0105\5D#\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2"+
		"\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\7\37\2\2\u0109\67\3\2\2\2\u010a\u010c\7\37\2\2\u010b"+
		"\u010d\t\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\37\2\2\u0111"+
		"9\3\2\2\2\u0112\u0114\7\37\2\2\u0113\u0115\t\2\2\2\u0114\u0113\3\2\2\2"+
		"\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\7\37\2\2\u0119;\3\2\2\2\u011a\u0121\7\37\2\2\u011b"+
		"\u0122\7#\2\2\u011c\u0122\7%\2\2\u011d\u0122\7$\2\2\u011e\u0122\7*\2\2"+
		"\u011f\u0122\7 \2\2\u0120\u0122\5D#\2\u0121\u011b\3\2\2\2\u0121\u011c"+
		"\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\37\2\2\u0126=\3\2\2\2\u0127\u012e"+
		"\7\37\2\2\u0128\u012f\7#\2\2\u0129\u012f\7%\2\2\u012a\u012f\7$\2\2\u012b"+
		"\u012f\7*\2\2\u012c\u012f\7 \2\2\u012d\u012f\5D#\2\u012e\u0128\3\2\2\2"+
		"\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c"+
		"\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7\37\2\2\u0133?\3\2\2\2"+
		"\u0134\u013b\7\37\2\2\u0135\u013c\7#\2\2\u0136\u013c\7%\2\2\u0137\u013c"+
		"\7$\2\2\u0138\u013c\7*\2\2\u0139\u013c\7 \2\2\u013a\u013c\5D#\2\u013b"+
		"\u0135\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\37"+
		"\2\2\u0140A\3\2\2\2\u0141\u0142\7\37\2\2\u0142\u0143\7&\2\2\u0143\u0144"+
		"\7&\2\2\u0144\u0145\7&\2\2\u0145\u0146\7&\2\2\u0146\u0148\7!\2\2\u0147"+
		"\u0149\7&\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\7&\2\2\u014b\u014d\7!\2\2\u014c\u014e\7&\2\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7&\2\2\u0150"+
		"\u0151\7\37\2\2\u0151\u0152\b\"\1\2\u0152C\3\2\2\2\u0153\u0154\7&\2\2"+
		"\u0154\u0156\b#\1\2\u0155\u0153\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158E\3\2\2\2\31L\u0084\u0089\u0090\u00af"+
		"\u00b2\u00ce\u00ec\u00fb\u00fd\u0104\u0106\u010e\u0116\u0121\u0123\u012e"+
		"\u0130\u013b\u013d\u0148\u014d\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}