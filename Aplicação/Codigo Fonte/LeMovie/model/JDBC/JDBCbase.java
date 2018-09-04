package model.JDBC;

import java.sql.*;

/*
@author Raul Andrade
*/
public class JDBCbase {

    protected Connection conn;

    public JDBCbase() {
        try {
            //Carregar driver JDBC do postgress
            Class.forName("org.postgresql.Driver");
            System.out.println("Carregou!");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    // abrindo a conexao
    public Connection open() throws SQLException {
        /*
        //NO MEU PC
        String host = "127.0.0.1:5432"; // no meu pc,
        String database = "lemovie";
        String user = "postgres";
        String password = "raul";
        */
        // NO SERVIDOR DE ANDRE

        String host = "10.27.159.214:5432"; // no servidor de andre,
        String database = "bd_trabalho";
        String user = "aluno";
        String password = "aluno";

        String url =  "jdbc:postgresql://" +
                host + "/" + database;

        conn = DriverManager.getConnection(url, user, password);
        System.out.println("conexao criada");

        return conn;
    }

    // fechando a conexao
    public void close() throws SQLException{
        if (conn != null) {
            conn.close();
        }
    }
}
