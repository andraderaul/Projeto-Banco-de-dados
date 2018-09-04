package model;

/*
@author Raul Andrade
*/
import model.JDBC.SerieJDBC;
import java.util.List;

public class Serie {

    private String nome;
    private String autor;
    private String diretor;
    private String ano;
    private String idioma;
    private String temporadas;


    public Serie(String nome, String autor, String diretor, String ano, String idioma, String temporadas) {
        this.nome = nome;
        this.autor = autor;
        this.diretor = diretor;
        this.ano = ano;
        this.idioma = idioma;
        this.temporadas = temporadas;
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

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie("
                + nome+"\t"
                + autor+"\t"
                + diretor+"\t"
                + ano+"\t"
                + idioma+"\t"
                + temporadas+")\t"
                ;
    }

    //--------------
    private static SerieJDBC serie = new SerieJDBC();
    public static List<Serie> consulta() {
        return serie.consulta();
    }

}
