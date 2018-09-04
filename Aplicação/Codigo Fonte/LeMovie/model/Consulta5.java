/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta5JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta5 {
    private String usuario;
    private String nome;
    private String sobrenome;

    public Consulta5(String usuario, String nome, String sobrenome) {
        this.usuario = usuario;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
        @Override
    public String toString() {
        return "Consulta5("
                + usuario+"\t"
                + nome+"\t"
                + sobrenome+")\t"
                ;
    }

    //--------------
    private static Consulta5JDBC cons5 = new Consulta5JDBC();
    public static List<Consulta5> consulta() {
        return cons5.consulta();
    }
    
}
