/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta7JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta7 {
    
    private String usuario;
    private String visto;
    private String nome_midia;
    private String comentario;

    public Consulta7(String usuario, String visto, String nome_midia, String comentario) {
        this.usuario = usuario;
        this.visto = visto;
        this.nome_midia = nome_midia;
        this.comentario = comentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
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
    
        @Override
    public String toString() {
        return "Consulta7("
                + usuario+"\t"
                + visto+"\t"
                + nome_midia+"\t"
                + comentario+")\t"
                ;
    }

    //--------------
    private static Consulta7JDBC cons7 = new Consulta7JDBC();
    public static List<Consulta7> consulta() {
        return cons7.consulta();
    }

    
}
