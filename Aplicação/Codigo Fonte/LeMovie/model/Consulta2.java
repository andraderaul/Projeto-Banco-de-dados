/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta2JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta2 {
    
    
    private String nome;
    private String ano;
    
            
  public Consulta2(String nome, String ano){
      
      this.nome = nome;
      this.ano = ano;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
  
        @Override
    public String toString() {
        return "Consulta2("
                + nome+"\t"
                + ano+")\t"
                ;
    }

    //--------------
    private static Consulta2JDBC cons2 = new Consulta2JDBC();
    public static List<Consulta2> consulta() {
        return cons2.consulta();
    }
  
  
  
}
