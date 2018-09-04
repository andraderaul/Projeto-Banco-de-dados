package model.JDBC;

import model.Consulta6;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta6JDBC extends  JDBCbase{

    public List<Consulta6> consulta() {
        ArrayList <Consulta6> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT respostas_user.user1 AS comentou , respostas_user.user2 AS respondeu FROM lemovie.amizade am\n"+
                         " LEFT JOIN (\n" +
                         " SELECT DISTINCT c.usuario as USER1, c2.usuario as USER2 FROM lemovie.resposta r\n" +
                         " JOIN lemovie.comentario c ON(c.idcomentario = r.comentario1)\n" +
                         " JOIN lemovie.comentario c2 ON (c2.idcomentario = r.comentario2)\n" +
                         " ) as respostas_user ON(respostas_user.user1 = usuario1 )\n" +
                         " WHERE am.usuario2 = respostas_user.user2;";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta6 cons6 = new Consulta6(
                        resultado.getString(1), //COMENTOU
                        resultado.getString(2) //RESPONDEU
                     
                );
                cons.add(cons6);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
