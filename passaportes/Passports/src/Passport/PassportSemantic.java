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

        String TAB = "  ";

        s.append("ActiveRecord::Base.transaction do\n");

        for(PassportItem p : passports) {
            s.append(TAB).append("pessoa = Person.where(name: '").append(p.nome).append("').empty? ? Person.create!(name: '").append(p.nome).append("') : Person.where(name: '").append(p.nome).append("').first\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# e actualizar campos que estejam vazios na pessoa\n")
                    .append(TAB).append("pessoa.nasc = Date.new(").append(p.data_nasc_ano).append(",").append(p.data_nasc_mes).append(",").append(p.data_nasc_dia).append(") unless pessoa.nasc?\n")
                    .append(TAB).append("pessoa.habil = '").append(p.habilitacoes).append("' unless pessoa.habil?\n")
                    .append(TAB).append("pessoa.bi = '").append(p.bi).append("' unless pessoa.bi?\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("pessoa.gender = ").append(p.genero).append(" if pessoa.undefined?\n")
                    .append(TAB).append("pessoa.civil = ").append(p.estado_civil).append(" #actualizar sempre\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# (criar e) obter profissao e ligar à pessoa\n")
                    .append(TAB).append("unless pessoa.profession_id?\n")
                    .append(TAB).append(TAB).append("pessoa.profession = Profession.where(desc: '").append(p.profissao).append("').empty? ? Profession.create!(desc: '").append(p.profissao).append("') : Profession.where(desc: '").append(p.profissao).append("').first\n")
                    .append(TAB).append("end\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# (criar e) obter local_nascimento e ligar à pessoa\n")
                    .append(TAB).append("unless pessoa.local_nasc?\n")
                    .append(TAB).append(TAB).append("pessoa.localNasc = Local.where(desc: '").append(p.local_nasc).append("').empty? ? Local.create!(desc: '").append(p.local_nasc).append("') : Local.where(desc: '").append(p.local_nasc).append("').first\n")
                    .append(TAB).append("end\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# (criar e) obter local_trabalho e ligar à pessoa\n")
                    .append(TAB).append("unless pessoa.local_work?\n")
                    .append(TAB).append(TAB).append("pessoa.localWork = Local.where(desc: '").append(p.local_trabalho).append("').empty? ? Local.create!(desc: '").append(p.local_trabalho).append("') : Local.where(desc: '").append(p.local_trabalho).append("').first\n")
                    .append(TAB).append("end\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# (criar e) obter residencia e ligar à pessoa\n")
                    .append(TAB).append("unless pessoa.residence?\n")
                    .append(TAB).append(TAB).append("pessoa.residence = Local.where(desc: '").append(p.residencia).append("').empty? ? Local.create!(desc: '").append(p.residencia).append("') : Local.where(desc: '").append(p.residencia).append("').first\n")
                    .append(TAB).append("end\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# criar e obter passaporte e ligar à pessoa\n")
                    .append(TAB).append("# (criar e) obter profissao do passaporte e ligar ao passaporte\n")
                    .append(TAB).append("# (criar e) obter local de destino do passaporte e ligar ao passaporte\n")
                    .append(TAB).append("# (criar e) obter local de trabalho do passaporte e ligar ao passaporte\n")
                    .append(TAB).append("Passport.create!({\n")
                    .append(TAB).append(TAB).append("number: '").append(p.numero_passaporte).append("',\n")
                    .append(TAB).append(TAB).append("process: '").append(p.numero_processo).append("',\n")
                    .append(TAB).append(TAB).append("year: ").append(p.ano).append(",\n")
                    .append(TAB).append(TAB).append("municipio: '").append(p.camara).append("',\n")
                    .append(TAB).append(TAB).append("submitted: Date.new(").append(p.submetido_ano).append(",").append(p.submetido_mes).append(",").append(p.submetido_dia).append("),\n")
                    .append(TAB).append(TAB).append("profession: Profession.where(desc:'").append(p.profissao).append("').empty? ? Profession.create!(desc:'").append(p.profissao).append("') : Profession.where(desc:'").append(p.profissao).append("').first,\n")
                    .append(TAB).append(TAB).append("local: Local.where(desc: '").append(p.destino_pais_e_cidade).append("').empty? ? Local.create!(desc:'").append(p.destino_pais_e_cidade).append("') : Local.where(desc:'").append(p.destino_pais_e_cidade).append("').first,\n")
                    .append(TAB).append(TAB).append("person: pessoa,\n")
                    .append(TAB).append(TAB).append("work_local_id: Local.where(desc: '").append(p.destino_local_trabalho).append("').empty? ? Local.create!(desc:'").append(p.destino_local_trabalho).append("').id : Local.where(desc:'").append(p.destino_local_trabalho).append("').first.id,\n")
                    .append(TAB).append(TAB).append("departure: Date.new(").append(p.destino_data_partida_ano).append(",").append(p.destino_data_partida_mes).append(",").append(p.destino_data_partida_dia).append("),\n")
                    .append(TAB).append("})\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# (criar e) obter o pai da pessoa\n")
                    .append(TAB).append("pai = Person.where(name: '").append(p.pai).append("').empty? ? Person.create!(name: '").append(p.pai).append("') : Person.where(name: '").append(p.pai).append("').first\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# (criar e) obter a mãe da pessoa\n")
                    .append(TAB).append("mae = Person.where(name: '").append(p.mae).append("').empty? ? Person.create!(name: '").append(p.mae).append("') : Person.where(name: '").append(p.mae).append("').first\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# criar o casamento entre o pai e a mae da pessoa se nao existir\n")
                    .append(TAB).append("casamento = Marriage.where(husband: pai, wife: mae).empty? ? Marriage.create!(husband: pai, wife: mae) : Marriage.where(husband: pai, wife: mae).first\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# adicionar a pessoa ao casamento.children\n")
                    .append(TAB).append("casamento.children << pessoa\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# criar e obter a pessoa (conjungue), meter o sexo caso esteja a criar uma nova pessoa\n")
                    .append(TAB).append("if Person.where(name: '").append(p.conjugue).append("').empty?\n")
                    .append(TAB).append(TAB).append("genero = :female if pessoa.male?\n")
                    .append(TAB).append(TAB).append("conjugue = Person.create!(name: '").append(p.conjugue).append("', gender: pessoa.male? ? :female : :male)\n")
                    .append(TAB).append("else\n")
                    .append(TAB).append(TAB).append("conjugue = Person.where(name: '").append(p.conjugue).append("').first\n")
                    .append(TAB).append("end\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# criar um casamento entre as duas pessoas\n")
                    .append(TAB).append("if pessoa.male?\n")
                    .append(TAB).append(TAB).append("homem = pessoa\n")
                    .append(TAB).append(TAB).append("mulher = conjugue\n")
                    .append(TAB).append("else\n")
                    .append(TAB).append(TAB).append("homem = conjugue\n")
                    .append(TAB).append(TAB).append("mulher = pessoa\n")
                    .append(TAB).append("end\n")
                    .append(TAB).append("casamento = Marriage.where(husband: homem, wife: mulher).empty? ? Marriage.create!(husband: homem, wife: mulher) : Marriage.where(husband: homem, wife: mulher).first\n")
                    .append(TAB).append("\n")
                    .append(TAB).append("# para cada filho\n")
                    .append(TAB).append("# -criar a pessoa caso não exista\n")
                    .append(TAB).append("# -adicionar a pessoa ao casamento.children\n");

            for(String f : p.filhos)
                s.append(TAB).append("casamento.children << (Person.where(name: '").append(f).append("').empty? ? Person.create!(name: '").append(f).append("') : Person.where(name: '").append(f).append("').first)\n");

            s.append(TAB).append("\n")
                    .append(TAB).append("# guardar a pessoa no fim\n")
                    .append(TAB).append("pessoa.save!\n")
                    .append(TAB).append("#--------------------------\n\n\n");
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

    // numero do processo
    public void processNumber(String text){
        passport.numero_processo=getText(text);
    }

    // numero do passaporte
    public void passportNumber(String text){
        passport.numero_passaporte=getText(text);
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

    // género
    void gender(String text){
        text = getText(text);
        if( text.equals("feminino") )
            passport.genero = 2;
        else if( text.equals("masculino") )
            passport.genero = 1;
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
        text = getText(text);
        if( text.equals("solteiro") )
            passport.estado_civil = 0;
        else if( text.equals("casado") )
            passport.estado_civil = 1;
        else if( text.equals("divorciado") )
            passport.estado_civil = 2;
        else if( text.equals("viuvo") || text.equals("viúvo") )
            passport.estado_civil = 3;
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
        passport.profissao=getText(text);
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

    // data de submissão do processo
    public void submitted(int year, int month, int day){
        passport.submetido_ano = year;
        passport.submetido_mes = month;
        passport.submetido_dia = day;
    }

    // data de partida
    public void departure(int year, int month, int day){
        passport.destino_data_partida_ano = year;
        passport.destino_data_partida_mes = month;
        passport.destino_data_partida_dia = day;
    }

    // data de nascimento
    public void birthDate(int year, int month, int day){
        passport.data_nasc_ano = year;
        passport.data_nasc_mes = month;
        passport.data_nasc_dia = day;
    }

}
