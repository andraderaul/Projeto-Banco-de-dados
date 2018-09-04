/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta8JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta8 {
    
    private String nome ;
    private String tipo ;
    private String media;

    public Consulta8(String nome, String tipo, String media) {
        this.nome = nome;
        this.tipo = tipo;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
    
    
        @Override
    public String toString() {
        return "Consulta8("
                + nome+"\t"
                + tipo+"\t"
                + media+")\t"
                ;
    }

    //--------------
    private static Consulta8JDBC cons8 = new Consulta8JDBC();
    public static List<Consulta8> consulta() {
        return cons8.consulta();
    }
    
}
