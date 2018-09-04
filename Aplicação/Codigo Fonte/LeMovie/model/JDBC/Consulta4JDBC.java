package model.JDBC;

import model.Consulta4;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta4JDBC extends  JDBCbase{

    public List<Consulta4> consulta() {
        ArrayList <Consulta4> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT count(*) as qtd_notas , n.valor FROM lemovie.midia m\n" +
                            " JOIN lemovie.filme s ON (s.idfilme = m.idmidia) \n" +
                            " LEFT JOIN lemovie.avaliacao a ON(m.idmidia = a.midia)\n" +
                            " LEFT JOIN lemovie.nota n ON (a.idavaliacao = n.idnota)\n" +
                            " GROUP BY(valor) ;";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta4 cons4 = new Consulta4(
                        resultado.getString(1), //qtd nota
                        resultado.getString(2) //nota
                     
                );
                cons.add(cons4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
