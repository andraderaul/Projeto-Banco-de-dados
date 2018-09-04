package model;

import java.util.List;
import model.JDBC.LivroJDBC;
/*
@author Raul Andrade
*/
public class Livro {

    private String isbn;
    private String nome;
    private String autor;
    private String ano;
    private String idioma;
    private String paginas;


    public Livro(String isbn, String nome, String autor, String ano, String idioma, String paginas) {
        this.isbn = isbn;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.idioma = idioma;
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro("
                + isbn+"\t"
                + nome+"\t"
                + autor+"\t"
                + ano+"\t"
                + idioma+"\t"
                + paginas+")\t"
                ;
    }

    //--------------
    private static LivroJDBC livro = new LivroJDBC();
    public static List<Livro> consulta() {
        return livro.consulta();
    }

}
