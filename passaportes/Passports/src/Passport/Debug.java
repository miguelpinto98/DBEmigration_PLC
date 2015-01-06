package Passport;

public class Debug {
    private static PassportParser.PassportContext ctx;

    public static void set(PassportParser.PassportContext ctx){
        Debug.ctx = ctx;
    }

    public static String get(){
        return "Perto da linha " + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
    }
}
