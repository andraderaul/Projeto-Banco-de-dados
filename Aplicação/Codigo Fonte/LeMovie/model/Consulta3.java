/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta3JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta3 {
    
    private String nome_user;
    private String nome_midia;
    private String comentario;
    private String visto;

    public Consulta3(String nome_user, String nome_midia, String comentario, String visto) {
        this.nome_user = nome_user;
        this.nome_midia = nome_midia;
        this.comentario = comentario;
        this.visto = visto;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getNome_midia() {
        return nome_midia;
    }

    public void setNome_midia(String nome_midia) {
        this.nome_midia = nome_midia;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }
    
    
        @Override
    public String toString() {
        return "Consulta3("
                + nome_user+"\t"
                + nome_midia+"\t"
                + comentario+"\t"
                + visto+")\t"
                ;
    }

    //--------------
    private static Consulta3JDBC cons3= new Consulta3JDBC();
    public static List<Consulta3> consulta() {
        return cons3.consulta();
    }

  
}
