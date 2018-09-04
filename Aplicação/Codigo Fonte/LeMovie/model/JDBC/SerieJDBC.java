package model.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Serie;
import java.util.List;

/*
@author Raul Andrade
*/
public class SerieJDBC extends JDBCbase{

    public List<Serie> consulta() {
        ArrayList<Serie> series = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT nome, autor, diretor, ano, idioma, temporadas FROM lemovie.midia " +
            "JOIN lemovie.serie ON (idmidia = idserie)";
           // System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Serie s = new Serie(
                        resultado.getString(1), //nome
                        resultado.getString(2), //autor
                        resultado.getString(3), //diretor
                        resultado.getString(4), //ano
                        (String) resultado.getString(5), //idioma
                        (String) resultado.getString(6)  //temporadas
                );
                series.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return series;
    }

}
