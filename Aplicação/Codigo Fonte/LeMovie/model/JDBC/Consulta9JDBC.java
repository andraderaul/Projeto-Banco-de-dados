package model.JDBC;

import model.Consulta9;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta9JDBC extends  JDBCbase{

    public List<Consulta9> consulta() {
        ArrayList <Consulta9> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT m.ano, m.nome , count(av.visto) AS quantos_viram FROM lemovie.midia m\n" +
                "JOIN lemovie.avaliacao av ON(idmidia = midia)\n" +
                "\n" +
                "WHERE ano BETWEEN '1970' AND '1999'\n" +
                "GROUP BY(idmidia)\n" +
                "ORDER BY (ano);";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta9 cons9 = new Consulta9(
                        resultado.getString(1), //ano
                        resultado.getString(2), // midia
                        resultado.getString(3) // quantos viram
                     
                );
                cons.add(cons9);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
