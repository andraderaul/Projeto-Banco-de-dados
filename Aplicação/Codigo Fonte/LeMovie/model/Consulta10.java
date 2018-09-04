/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta10JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta10 {
    
    private String nome;
    private String horas_assistidas ;

    public Consulta10(String nome, String horas_assistidas) {
        this.nome = nome;
        this.horas_assistidas = horas_assistidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHoras_assistidas() {
        return horas_assistidas;
    }

    public void setHoras_assistidas(String horas_assistidas) {
        this.horas_assistidas = horas_assistidas;
    }
    
        @Override
    public String toString() {
        return "Consulta10("
                + nome+"\t"
                + horas_assistidas+")\t"
                ;
    }

    //--------------
    private static Consulta10JDBC cons10 = new Consulta10JDBC();
    public static List<Consulta10> consulta() {
        return cons10.consulta();
    }
}
