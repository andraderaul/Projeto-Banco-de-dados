package model.JDBC;

import model.Consulta5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta5JDBC extends  JDBCbase{

    public List<Consulta5> consulta() {
        ArrayList <Consulta5> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT user_cmm.usuario , u.nome, u.sobrenome FROM lemovie.usuario u\n" +
                    "\n" +
                    "\tJOIN (\t\n" +
                    "\t\tSELECT usuario FROM lemovie.comentario c\n" +
                    "\t\tGROUP BY (c.usuario)\n" +
                    "\t\tHAVING count(c.usuario) > 1\n" +
                    "\t\t\n" +
                    ") AS user_cmm ON(user_cmm.usuario = u.login)";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta5 cons5 = new Consulta5(
                        resultado.getString(1), //USUARIO
                        resultado.getString(2), //nome
                        resultado.getString(3) //sobrenome
                     
                );
                cons.add(cons5);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
