package Passport;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassportSemantic {
    PassportItem passport;
    List<PassportItem> passports;

    PassportSemantic(){
        passports = new ArrayList<PassportItem>();
    }

    //////////////////////////////////////////////////////////////////
    ///////
    ///////     métodos auxiliares
    ///////
    //////////////////////////////////////////////////////////////////

    public String getRuby(){
        StringBuilder s = new StringBuilder();

        String SPACE = " ";
        String TAB1 = SPACE + SPACE;
        String TAB2 = TAB1 + TAB1;
        String TAB3 = TAB2 + TAB1;
        String TAB4 = TAB2 + TAB2;

        s.append("ActiveRecord::Base.transaction do");

        for(PassportItem p : passports){
            s.append(TAB1).append("mae = ????.where(nome: \"").append(p.mae).append("\")").append("\n");
            s.append(TAB1).append("pai = ????.where(nome: \"").append(p.pai).append("\")").append("\n");
        }

        s.append("end");

        return s.toString();
    }

    private String getText(String text){
        if(text == null || text.isEmpty())
            return null;

        if(!text.startsWith("\"") || !text.endsWith("\""))
            return null;

        text = text.substring(1,text.length()-1);

        text = text.replaceAll("\\b","")
                .replaceAll("\\f","")
                .replaceAll("\\n","")
                .replaceAll("\\r","")
                .replaceAll("\\t","")
                .replaceAll("\\\\","")
                .replaceAll("\\/","");

        // substituir unicode
        Pattern p = Pattern.compile("\\\\u(\\p{XDigit}{4})");
        Matcher m = p.matcher(text);
        StringBuffer buf = new StringBuffer(text.length());
        while (m.find()) {
            String ch = String.valueOf((char) Integer.parseInt(m.group(1), 16));
            m.appendReplacement(buf, Matcher.quoteReplacement(ch));
        }
        m.appendTail(buf);

        text = buf.toString();

        if(text.isEmpty())
            Debug.error("String vazia");

        return buf.toString();
    }

    public List<String> validarPassaporte(){
        ArrayList<String> erros = new ArrayList<String>();

        //TODO validar o passaporte

        return erros;
    }

    public List<String> validarPassaportes(){
        ArrayList<String> erros = new ArrayList<String>();

        //TODO validar o passaportes

        return erros;
    }

    //////////////////////////////////////////////////////////////////
    ///////
    ///////     chamadas feitas pelo ANTLR
    ///////
    //////////////////////////////////////////////////////////////////

    // terminou a leitura de um passaporte
    public void passportEnd(){
        for(String e : validarPassaporte())
            Debug.error(e);

        passports.add(passport);
    }

    // iniciar a leitura de um passaporte
    public void passportStart(){
        passport = new PassportItem();
    }

    // leu o ano do processo
    public void year(int y){
        passport.ano = y;

        if( y <= 1000 )
            Debug.error("Ano de registo do passaporte é menor que 1000");
    }

    // leu o numero do processo
    public void processNumber(String text){
        passport.numero_processo=getText(text);
    }

    // camara municipal
    public void cityCouncil(String text){
        passport.camara=getText(text);
    }

    // nome da pessoa
    public void name(String text){
        passport.nome=getText(text);
    }

    // bilhete de identidade
    public void identCard(String text){
        passport.bi=getText(text);
    }

    // residencia
    public void residence(String text){
        passport.residencia=getText(text);
    }

    // local de nascimento
    public void birthLocal(String text){
        passport.local_nasc=getText(text);
    }

    // nome do pai
    public void parentFather(String text){
        passport.pai=getText(text);
    }

    // nome da mãe
    public void parentMother(String text){
        passport.mae=getText(text);
    }

    // estado civil
    public void civilState(String text){
        passport.estado_civil=getText(text);
    }

    // nome da esposa/marido
    public void spouse(String text){
        passport.conjugue=getText(text);
    }

    // nome do filho/filha
    public void child(String text){
        passport.filhos.add(getText(text));

    }

    // profissão do requerente
    public void profession(String text){
        text=getText(text);

    }

    // local de trabalho
    public void professionLocal(String text){
        passport.local_trabalho=getText(text);

    }

    // habilitações
    public void qualifications(String text){
        passport.habilitacoes=getText(text);

    }

    // país e cidade de destino
    public void countryAndCity(String text){
        passport.destino_pais_e_cidade=getText(text);

    }

    // profissão que vai exercer no destino
    public void dest_profession(String text){
        passport.destino_profissao=getText(text);

    }

    // local onde vai trabalhar no destino
    public void dest_professionLocal(String text){
        passport.destino_local_trabalho=getText(text);

    }

    // data de partida
    public void departure(int year, int month, int day){
        passport.destin_data_partida = new GregorianCalendar(year,month,day);
    }

    // data de nascimento
    public void birthDate(int year, int month, int day){
        passport.data_nasc = new GregorianCalendar(year,month,day);
    }

}
