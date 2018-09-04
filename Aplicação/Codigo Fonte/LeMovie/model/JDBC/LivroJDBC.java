package model.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Livro;
import java.util.List;

public class LivroJDBC extends JDBCbase{
    //String isbn, String nome, String autor, String ano, String idioma, String paginas

    public List<Livro> consulta() {
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT  isbn, nome, autor, ano, idioma, paginas FROM lemovie.midia " +
                    "JOIN lemovie.livro ON (idmidia = idlivro)";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            // String isbn, String nome, String autor, String ano, String idioma, String paginas
            while (resultado.next()) {
                Livro livro = new Livro(
                        resultado.getString(1), //isbn
                        resultado.getString(2), //nome
                        resultado.getString(3), //autor
                        resultado.getString(4), //ano
                        resultado.getString(5), //idioma
                        (String) resultado.getString(6)//paginas
                );
                livros.add(livro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livros;
    }

}
