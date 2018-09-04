package model.JDBC;

import model.Consulta8;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
@author Raul Andrade
*/
public class Consulta8JDBC extends  JDBCbase{

    public List<Consulta8> consulta() {
        ArrayList <Consulta8> cons = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "WITH media_midia AS(\n" +
"SELECT av.midia,avg(valor) AS media FROM lemovie.avaliacao av\n" +
"JOIN lemovie.nota n ON(n.idnota = av.idavaliacao)\n" +
"GROUP BY (av.midia)\n" +
")\n" +
"\n" +
"SELECT mi.nome,mi.tipo, mm.media FROM media_midia mm\n" +
"JOIN lemovie.midia mi ON(mm.midia = mi.idmidia )\n" +
"WHERE mm.media =  (\n" +
"\n" +
"SELECT max(mm.media) FROM media_midia mm\n" +
"\n" +
");";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Consulta8 cons8 = new Consulta8(
                        resultado.getString(1), //nome
                        resultado.getString(2), //nome
                        resultado.getString(3) //sobrenome
                     
                );
                cons.add(cons8);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cons;
    }

}
