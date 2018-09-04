package model.JDBC;

import model.Filme;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class FilmeJDBC extends  JDBCbase{

    public List<Filme> consulta() {
        ArrayList <Filme> filmes = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT nome, autor, diretor, ano, idioma, duracao FROM lemovie.midia " +
                    "JOIN lemovie.filme ON (idmidia = idfilme);";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Filme movie = new Filme(
                        resultado.getString(1), //nome
                        resultado.getString(2), //autor
                        resultado.getString(3), //diretor
                        resultado.getString(4), //ano
                        (String) resultado.getString(5), //idioma
                        (String) resultado.getString(6)  //duracao
                );
                filmes.add(movie);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filmes;
    }

}
