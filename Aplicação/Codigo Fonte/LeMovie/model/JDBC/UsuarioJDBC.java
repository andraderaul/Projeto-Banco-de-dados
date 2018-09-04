package model.JDBC;

import model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioJDBC extends JDBCbase{

    // consultando todos os usuarios
    public List<Usuario> consulta() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao


            String SQL = " SELECT * FROM lemovie.usuario;";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Usuario user = new Usuario(
                        resultado.getString(1), //login
                        resultado.getString(2), //nome
                        resultado.getString(3), //sobrenome
                        resultado.getString(4), //genero
                        resultado.getString(5), //senha
                        (String) resultado.getString(6), //nivelAcesso
                        (String) resultado.getString(7)  //date
                );
                usuarios.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    // filtrando por login
    public Usuario filtrar(String username) {

        Usuario user = null;

        try {
            conn = open();

            String SQL = " SELECT * FROM lemovie.usuario WHERE login = ?;";
            System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            comando.setString(1, username);
            ResultSet resultado = comando.executeQuery();

            // so vai retornar um
            if (resultado.next()) {
                Usuario u = new Usuario(
                        resultado.getString(1), //login
                        resultado.getString(2), //nome
                        resultado.getString(3), //sobrenome
                        resultado.getString(4), //genero
                        resultado.getString(5), //senha
                        (String) resultado.getString(6), //nivelAcesso
                        (String) resultado.getString(7)  //date
                );
                user = u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

}
