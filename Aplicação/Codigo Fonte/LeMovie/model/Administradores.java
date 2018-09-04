package model;

import model.JDBC.AdministradoresJDBC;

import java.util.List;
/*
@author Raul Andrade
*/
public class Administradores {
    public String login;
    public String senha;

    public Administradores(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Administradores("
                + login+"\t"
                + senha+")\t"
                ;
    }

    //--------------
    private static AdministradoresJDBC adm = new AdministradoresJDBC();
    public static List<String> consulta() {
        return adm.consulta();
    }


}
