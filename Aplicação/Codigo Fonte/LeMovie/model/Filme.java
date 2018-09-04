package model;


import model.JDBC.FilmeJDBC;

import java.util.List;
/*
@author Raul Andrade
*/
public class Filme {

    private String nome;
    private String autor;
    private String diretor;
    private String ano;
    private String idioma;
    private String duracao;

    public Filme(String nome, String autor, String diretor, String ano, String idioma, String duracao) {
        this.nome = nome;
        this.autor = autor;
        this.diretor = diretor;
        this.ano = ano;
        this.idioma = idioma;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme("
                + nome+"\t"
                + autor+"\t"
                + diretor+"\t"
                + ano+"\t"
                + idioma+"\t"
                + duracao+")\t"
                ;
    }

    //--------------
    private static FilmeJDBC movie = new FilmeJDBC();
    public static List<Filme> consulta() {
        return movie.consulta();
    }


}
