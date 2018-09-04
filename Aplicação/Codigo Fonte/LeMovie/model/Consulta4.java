/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta4JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta4 {
    
    private String qtd_nota;
    private String nota;

    public Consulta4(String qtd_nota, String nota) {
        this.qtd_nota = qtd_nota;
        this.nota = nota;
    }

    public String getQtd_nota() {
        return qtd_nota;
    }

    public void setQtd_nota(String qtd_nota) {
        this.qtd_nota = qtd_nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
        @Override
    public String toString() {
        return "Consulta4("
                + qtd_nota+"\t"
                + nota+")\t"
                ;
    }

    //--------------
    private static Consulta4JDBC cons4 = new Consulta4JDBC();
    public static List<Consulta4> consulta() {
        return cons4.consulta();
    }
    
    
}
