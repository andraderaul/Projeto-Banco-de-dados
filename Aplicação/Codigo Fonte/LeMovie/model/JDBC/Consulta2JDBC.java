package model.JDBC;

import model.Consulta2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta2JDBC extends  JDBCbase{

    public List<Consulta2> consulta() {
        ArrayList <Consulta2> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT nome, ano FROM lemovie.midia JOIN lemovie.filme ON (idmidia = idfilme);";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta2 cons2 = new Consulta2(
                        resultado.getString(1), //nome
                        resultado.getString(2) //ano
                     
                );
                cons.add(cons2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
