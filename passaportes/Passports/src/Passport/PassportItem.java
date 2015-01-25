package Passport;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class PassportItem {
    Integer ano;
    String numero_processo;
    String numero_passaporte;
    String camara;
    Integer submetido_mes;
    Integer submetido_ano;
    Integer submetido_dia;

    String nome;
    String bi;
    String residencia;
    Integer data_nasc_ano;
    Integer data_nasc_mes;
    Integer data_nasc_dia;
    String local_nasc;
    Integer genero; // female: 2, male: 1
    String mae;
    String pai;
    Integer estado_civil; //single: 0, married: 1, divorced: 2, widowed: 3
    String conjugue;
    List<String> filhos;
    String profissao;
    String local_trabalho;
    String habilitacoes;

    String destino_pais_e_cidade;
    Integer destino_data_partida_ano;
    Integer destino_data_partida_mes;
    Integer destino_data_partida_dia;
    String destino_profissao;
    String destino_local_trabalho;

    PassportItem(){
        filhos = new ArrayList<String>();
    }
}
