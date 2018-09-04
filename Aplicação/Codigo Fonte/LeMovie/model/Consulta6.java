/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import model.JDBC.Consulta6JDBC;

/**
 *
 * @author Netto Rangel
 */
public class Consulta6 {
    
    private String user_comentou;
    private String user_respondeu; 

    public Consulta6(String user_comentou, String user_respondeu) {
        this.user_comentou = user_comentou;
        this.user_respondeu = user_respondeu;
    }

    public String getUser_comentou() {
        return user_comentou;
    }

    public void setUser_comentou(String user_comentou) {
        this.user_comentou = user_comentou;
    }

    public String getUser_respondeu() {
        return user_respondeu;
    }

    public void setUser_respondeu(String user_respondeu) {
        this.user_respondeu = user_respondeu;
    }
    
    
        @Override
    public String toString() {
        return "Consulta6("
                + user_comentou+"\t"
                + user_respondeu+")\t"
                ;
    }

    //--------------
    private static Consulta6JDBC cons6 = new Consulta6JDBC();
    public static List<Consulta6> consulta() {
        return cons6.consulta();
    }
}
