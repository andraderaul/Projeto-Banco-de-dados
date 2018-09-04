package model.JDBC;

import model.Consulta1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta1JDBC extends  JDBCbase{

    public List<Consulta1> consulta() {
        ArrayList <Consulta1> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT nome,sobrenome FROM lemovie.usuario WHERE nivelacesso = 'USER';";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta1 cons1 = new Consulta1(
                        resultado.getString(1), //nome
                        resultado.getString(2) //sobrenome
                     
                );
                cons.add(cons1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
