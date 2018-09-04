/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta1JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta1 {
    
    private String nome;
    private String sobrenome;
    
            
  public Consulta1(String nome, String sobrenome){
      
      this.nome = nome;
      this.sobrenome = sobrenome;
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
        return "Consulta1("
                + nome+"\t"
                + sobrenome+")\t"
                ;
    }

    //--------------
    private static Consulta1JDBC cons1 = new Consulta1JDBC();
    public static List<Consulta1> consulta() {
        return cons1.consulta();
    }
    
}
