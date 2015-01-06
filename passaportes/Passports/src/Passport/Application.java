package Passport;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Application {
    public static void main(String[] args){
        //preparar o parser
        CharStream stream;
        if(args.length == 1){
            try {
                stream = new ANTLRFileStream(args[0]);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler o ficheiro \"" + args[0] + "\".");
                e.printStackTrace();
                return;
            }
        } else if(args.length == 0){
            try {
                stream = new ANTLRInputStream(System.in);
            } catch (IOException e) {
                System.err.println("Ocorreu um problema ao tentar ler do stdin.");
                e.printStackTrace();
                return;
            }
        } else {
            System.err.print("Formas de uso:\n"
                            + "* Fornecer um nome de ficheiro como unico argumento para ler esse ficheiro.\n"
                            + "* Fornecer texto por stdin e invocar o programa sem especificar argumentos.\n"
            );
            return;
        }
        PassportLexer lexer = new PassportLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        PassportParser parser = new PassportParser(tokenStream);
        PassportSemantic semantic = new PassportSemantic();

        // validar e obter os dados
        semantic = parser.passports(new PassportSemantic()).outS;


    }
}
