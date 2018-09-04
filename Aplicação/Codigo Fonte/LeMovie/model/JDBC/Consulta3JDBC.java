package model.JDBC;

import model.Consulta3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta3JDBC extends  JDBCbase{

    public List<Consulta3> consulta() {
        ArrayList <Consulta3> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT DISTINCT  u.nome, c.texto, a.visto, m.nome FROM lemovie.usuario u \n" +
                        " JOIN lemovie.comentario c ON(u.login = c.usuario)\n" +
                        " JOIN lemovie.avaliacao a USING (midia)\n" +
                        " JOIN lemovie.midia m ON (a.midia = m.idmidia);";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta3 cons3 = new Consulta3(
                        resultado.getString(1), //nome user
                        resultado.getString(2), //nome midia
                        resultado.getString(3), //comentario
                        resultado.getString(4) //visto
                     
                );
                cons.add(cons3);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
