/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta9JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta9 {
    private String ano;
    private String quantos_viram;
    private String midia;

    public Consulta9(String ano, String quantos_viram, String midia) {
        this.ano = ano;
        this.quantos_viram = quantos_viram;
        this.midia = midia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getQuantos_viram() {
        return quantos_viram;
    }

    public void setQuantos_viram(String quantos_viram) {
        this.quantos_viram = quantos_viram;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }
        @Override
    public String toString() {
        return "Consulta9("
                + ano+"\t"
                + quantos_viram+")\t"
                ;
    }

    //--------------
    private static Consulta9JDBC cons9 = new Consulta9JDBC();
    public static List<Consulta9> consulta() {
        return cons9.consulta();
    }
    
}
