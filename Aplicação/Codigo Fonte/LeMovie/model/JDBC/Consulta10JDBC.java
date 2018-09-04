package model.JDBC;

import model.Consulta10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta10JDBC extends  JDBCbase{

    public List<Consulta10> consulta() {
        ArrayList <Consulta10> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT u.nome, sum(dur_mid.duracao) AS ASSISTIU  FROM lemovie.usuario u\n" +
"\n" +
"	JOIN lemovie.avaliacao a ON(u.login = a.usuario)\n" +
"	\n" +
"	LEFT JOIN ( \n" +
"\n" +
"		SELECT m.idmidia, f.duracao,nome  FROM lemovie.midia m\n" +
"			JOIN lemovie.filme f ON (m.idmidia = f.idfilme)\n" +
"\n" +
") AS dur_mid ON(dur_mid.idmidia = a.midia )\n" +
"WHERE visto = 't'\n" +
"GROUP BY (login);";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta10 cons10 = new Consulta10(
                        resultado.getString(1), //nome
                        resultado.getString(2) //horas assistidas
                     
                );
                cons.add(cons10);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
