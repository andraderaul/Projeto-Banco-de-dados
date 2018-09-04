package model.JDBC;

import model.Administradores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdministradoresJDBC extends JDBCbase{

    public List<String> consulta() {
        ArrayList<String> adms = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT login, senha FROM lemovie.usuario WHERE nivelacesso = 'ADMIN';";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {

                resultado.getString(1); //login
                String senha = resultado.getString(2); //senha

                adms.add(senha);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adms;
    }

}
