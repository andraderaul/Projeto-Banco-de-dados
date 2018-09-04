package model;

import model.JDBC.UsuarioJDBC;

import java.util.List;
/*
@author Raul Andrade
*/
public class Usuario {

    private String login;
    private String nome;
    private String sobrenome;
    private String genero;
    private String senha;
    private String nivelAcesso;
    private String dataRegistro;

    public Usuario(String login, String nome, String sobrenome, String genero, String senha, String nivelAcesso, String dataRegistro) {
        this.login = login;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.senha = "****";
        this.nivelAcesso = nivelAcesso;
        this.dataRegistro = dataRegistro;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public void setSobrenoe(String sobrenoe) {
        this.sobrenome = sobrenoe;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String toString() {
        return "Usuario("
                + login+"\t"
                + nome+"\t"
                + sobrenome+"\t"
                + genero+"\t"
                + senha+"\t"
                + nivelAcesso+"\t"
                + dataRegistro+")\t"
                ;
    }

    //-------------
    private static UsuarioJDBC user = new UsuarioJDBC();
    public static List<Usuario> consulta() {
        return user.consulta();
    }

    public static Usuario filtrar(String login) {
        return user.filtrar(login);
    }

}
