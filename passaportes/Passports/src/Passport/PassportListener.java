// Generated from /home/chalkos/MEI/PLC-TP/DBEmigration_PLC/passaportes/Passports/src/Passport/Passport.g4 by ANTLR 4.4.1-dev
package Passport;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PassportParser}.
 */
public interface PassportListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PassportParser#local_def}.
	 * @param ctx the parse tree
	 */
	void enterLocal_def(@NotNull PassportParser.Local_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#local_def}.
	 * @param ctx the parse tree
	 */
	void exitLocal_def(@NotNull PassportParser.Local_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#ident_card_def}.
	 * @param ctx the parse tree
	 */
	void enterIdent_card_def(@NotNull PassportParser.Ident_card_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#ident_card_def}.
	 * @param ctx the parse tree
	 */
	void exitIdent_card_def(@NotNull PassportParser.Ident_card_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#person}.
	 * @param ctx the parse tree
	 */
	void enterPerson(@NotNull PassportParser.PersonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#person}.
	 * @param ctx the parse tree
	 */
	void exitPerson(@NotNull PassportParser.PersonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#parents}.
	 * @param ctx the parse tree
	 */
	void enterParents(@NotNull PassportParser.ParentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#parents}.
	 * @param ctx the parse tree
	 */
	void exitParents(@NotNull PassportParser.ParentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#qualifications}.
	 * @param ctx the parse tree
	 */
	void enterQualifications(@NotNull PassportParser.QualificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#qualifications}.
	 * @param ctx the parse tree
	 */
	void exitQualifications(@NotNull PassportParser.QualificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#profession}.
	 * @param ctx the parse tree
	 */
	void enterProfession(@NotNull PassportParser.ProfessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#profession}.
	 * @param ctx the parse tree
	 */
	void exitProfession(@NotNull PassportParser.ProfessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#date_def}.
	 * @param ctx the parse tree
	 */
	void enterDate_def(@NotNull PassportParser.Date_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#date_def}.
	 * @param ctx the parse tree
	 */
	void exitDate_def(@NotNull PassportParser.Date_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#children}.
	 * @param ctx the parse tree
	 */
	void enterChildren(@NotNull PassportParser.ChildrenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#children}.
	 * @param ctx the parse tree
	 */
	void exitChildren(@NotNull PassportParser.ChildrenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#cityCouncil}.
	 * @param ctx the parse tree
	 */
	void enterCityCouncil(@NotNull PassportParser.CityCouncilContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#cityCouncil}.
	 * @param ctx the parse tree
	 */
	void exitCityCouncil(@NotNull PassportParser.CityCouncilContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#complete_name_def}.
	 * @param ctx the parse tree
	 */
	void enterComplete_name_def(@NotNull PassportParser.Complete_name_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#complete_name_def}.
	 * @param ctx the parse tree
	 */
	void exitComplete_name_def(@NotNull PassportParser.Complete_name_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#child}.
	 * @param ctx the parse tree
	 */
	void enterChild(@NotNull PassportParser.ChildContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#child}.
	 * @param ctx the parse tree
	 */
	void exitChild(@NotNull PassportParser.ChildContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(@NotNull PassportParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(@NotNull PassportParser.NumbersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#spouse}.
	 * @param ctx the parse tree
	 */
	void enterSpouse(@NotNull PassportParser.SpouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#spouse}.
	 * @param ctx the parse tree
	 */
	void exitSpouse(@NotNull PassportParser.SpouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull PassportParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull PassportParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#birthLocal}.
	 * @param ctx the parse tree
	 */
	void enterBirthLocal(@NotNull PassportParser.BirthLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#birthLocal}.
	 * @param ctx the parse tree
	 */
	void exitBirthLocal(@NotNull PassportParser.BirthLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#birthDate}.
	 * @param ctx the parse tree
	 */
	void enterBirthDate(@NotNull PassportParser.BirthDateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#birthDate}.
	 * @param ctx the parse tree
	 */
	void exitBirthDate(@NotNull PassportParser.BirthDateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(@NotNull PassportParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(@NotNull PassportParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#process_number_def}.
	 * @param ctx the parse tree
	 */
	void enterProcess_number_def(@NotNull PassportParser.Process_number_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#process_number_def}.
	 * @param ctx the parse tree
	 */
	void exitProcess_number_def(@NotNull PassportParser.Process_number_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#parentMother}.
	 * @param ctx the parse tree
	 */
	void enterParentMother(@NotNull PassportParser.ParentMotherContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#parentMother}.
	 * @param ctx the parse tree
	 */
	void exitParentMother(@NotNull PassportParser.ParentMotherContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#countryAndCity}.
	 * @param ctx the parse tree
	 */
	void enterCountryAndCity(@NotNull PassportParser.CountryAndCityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#countryAndCity}.
	 * @param ctx the parse tree
	 */
	void exitCountryAndCity(@NotNull PassportParser.CountryAndCityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#passports}.
	 * @param ctx the parse tree
	 */
	void enterPassports(@NotNull PassportParser.PassportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#passports}.
	 * @param ctx the parse tree
	 */
	void exitPassports(@NotNull PassportParser.PassportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#qualifications_def}.
	 * @param ctx the parse tree
	 */
	void enterQualifications_def(@NotNull PassportParser.Qualifications_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#qualifications_def}.
	 * @param ctx the parse tree
	 */
	void exitQualifications_def(@NotNull PassportParser.Qualifications_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#city_council_def}.
	 * @param ctx the parse tree
	 */
	void enterCity_council_def(@NotNull PassportParser.City_council_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#city_council_def}.
	 * @param ctx the parse tree
	 */
	void exitCity_council_def(@NotNull PassportParser.City_council_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#civilState}.
	 * @param ctx the parse tree
	 */
	void enterCivilState(@NotNull PassportParser.CivilStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#civilState}.
	 * @param ctx the parse tree
	 */
	void exitCivilState(@NotNull PassportParser.CivilStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#identCard}.
	 * @param ctx the parse tree
	 */
	void enterIdentCard(@NotNull PassportParser.IdentCardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#identCard}.
	 * @param ctx the parse tree
	 */
	void exitIdentCard(@NotNull PassportParser.IdentCardContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#profession_def}.
	 * @param ctx the parse tree
	 */
	void enterProfession_def(@NotNull PassportParser.Profession_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#profession_def}.
	 * @param ctx the parse tree
	 */
	void exitProfession_def(@NotNull PassportParser.Profession_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#dest_profession}.
	 * @param ctx the parse tree
	 */
	void enterDest_profession(@NotNull PassportParser.Dest_professionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#dest_profession}.
	 * @param ctx the parse tree
	 */
	void exitDest_profession(@NotNull PassportParser.Dest_professionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#parentFather}.
	 * @param ctx the parse tree
	 */
	void enterParentFather(@NotNull PassportParser.ParentFatherContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#parentFather}.
	 * @param ctx the parse tree
	 */
	void exitParentFather(@NotNull PassportParser.ParentFatherContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#departure}.
	 * @param ctx the parse tree
	 */
	void enterDeparture(@NotNull PassportParser.DepartureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#departure}.
	 * @param ctx the parse tree
	 */
	void exitDeparture(@NotNull PassportParser.DepartureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#processNumber}.
	 * @param ctx the parse tree
	 */
	void enterProcessNumber(@NotNull PassportParser.ProcessNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#processNumber}.
	 * @param ctx the parse tree
	 */
	void exitProcessNumber(@NotNull PassportParser.ProcessNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#destination}.
	 * @param ctx the parse tree
	 */
	void enterDestination(@NotNull PassportParser.DestinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#destination}.
	 * @param ctx the parse tree
	 */
	void exitDestination(@NotNull PassportParser.DestinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#process}.
	 * @param ctx the parse tree
	 */
	void enterProcess(@NotNull PassportParser.ProcessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#process}.
	 * @param ctx the parse tree
	 */
	void exitProcess(@NotNull PassportParser.ProcessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#dest_professionLocal}.
	 * @param ctx the parse tree
	 */
	void enterDest_professionLocal(@NotNull PassportParser.Dest_professionLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#dest_professionLocal}.
	 * @param ctx the parse tree
	 */
	void exitDest_professionLocal(@NotNull PassportParser.Dest_professionLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#residence}.
	 * @param ctx the parse tree
	 */
	void enterResidence(@NotNull PassportParser.ResidenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#residence}.
	 * @param ctx the parse tree
	 */
	void exitResidence(@NotNull PassportParser.ResidenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#professionLocal}.
	 * @param ctx the parse tree
	 */
	void enterProfessionLocal(@NotNull PassportParser.ProfessionLocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#professionLocal}.
	 * @param ctx the parse tree
	 */
	void exitProfessionLocal(@NotNull PassportParser.ProfessionLocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PassportParser#passport}.
	 * @param ctx the parse tree
	 */
	void enterPassport(@NotNull PassportParser.PassportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PassportParser#passport}.
	 * @param ctx the parse tree
	 */
	void exitPassport(@NotNull PassportParser.PassportContext ctx);
}