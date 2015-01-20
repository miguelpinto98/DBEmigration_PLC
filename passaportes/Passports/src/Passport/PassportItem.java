package Passport;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class PassportItem {
    Integer ano;
    String numero_processo;
    String camara;

    String nome;
    String bi;
    String residencia;
    GregorianCalendar data_nasc;
    String local_nasc;
    String mae;
    String pai;
    String estado_civil;
    String conjugue;
    List<String> filhos;
    String profissao;
    String local_trabalho;
    String habilitacoes;
    String destino_pais_e_cidade;
    GregorianCalendar destin_data_partida;
    String destino_profissao;
    String destino_local_trabalho;

    PassportItem(){
        filhos = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return  "Passaporte: \n"
                + "  ano: " + ano.toString() + ",\n"
                + "  numero_processo: " + numero_processo + ",\n"
                + "  camara: " + camara + ",\n"
                + "  nome: " + nome + ",\n"
                + "  bi: " + bi + ",\n"
                + "  residencia: " + residencia + ",\n"
                + "  data_nasc: " + data_nasc.toString() + ",\n"
                + "  local_nasc: " + local_nasc + ",\n"
                + "  mae: " + mae + ",\n"
                + "  pai: " + pai + ",\n"
                + "  estado_civil: " + estado_civil + ",\n"
                + "  conjugue: " + conjugue + ",\n"
                + "  filhos: " + filhos.toString() + ",\n"
                + "  profissao: " + profissao + ",\n"
                + "  local_trabalho: " + local_trabalho + ",\n"
                + "  habilitacoes: " + habilitacoes + ",\n"
                + "  destino_pais_e_cidade: " + destino_pais_e_cidade + ",\n"
                + "  destin_data_partida: " + destin_data_partida.toString() + ",\n"
                + "  destino_profissao: " + destino_profissao + ",\n"
                + "  destino_local_trabalho: " + destino_local_trabalho + ".\n";
    }
}
