package Passport;

public class Debug {
    private static int line;
    private static int pos;
    private static boolean erro = false;

    public static void set(int l, int p){
        Debug.line = l;
        Debug.pos = p;
    }

    public static String get(){
        erro = true;
        return "Perto da linha " + Debug.line + ":" + Debug.pos;
    }

    public static void error(String prepend){
        erro = true;
        System.err.println(prepend + " (perto da linha " + Debug.line + ":" + Debug.pos + ")");
    }

    public static void error_final(String texto){
        erro = true;
        System.err.println("validação final: " + texto);
    }

    public static boolean hasError(){return erro;}
}
