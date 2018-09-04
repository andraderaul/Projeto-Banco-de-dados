package model.JDBC;

import model.Consulta7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta7JDBC extends  JDBCbase{

    public List<Consulta7> consulta() {
        ArrayList <Consulta7> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT av.usuario,av.visto,comments_user.nome_midia,comments_user.texto FROM lemovie.avaliacao av\n" +
"LEFT JOIN (\n" +
"\n" +
"	SELECT u.midia,  lower(u.texto) as texto , m.nome AS nome_midia, u.usuario \n" +
"\n" +
"		FROM lemovie.comentario u\n" +
"\n" +
"			JOIN lemovie.midia m ON (m.idmidia = u.midia)\n" +
"		\n" +
"		\n" +
"\n" +
") AS comments_user ON ( av.midia =  comments_user.midia AND av.usuario = comments_user.usuario)\n" +
"\n" +
"\n" +
"WHERE (comments_user.midia IS NOT NULL) \n" +
"	AND (comments_user.texto ILIKE '%adoro%') \n" +
"		AND visto IS FALSE ;";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta7 cons7= new Consulta7(
                        resultado.getString(1), //USUARIO
                        resultado.getString(2), //VISTO
                        resultado.getString(3), //NOME MIDIA
                        resultado.getString(4) //COMENTARIO
                     
                );
                cons.add(cons7);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
