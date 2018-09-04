package model.JDBC;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Indicacao;

public class IndicacaoJDBC extends JDBCbase{

    public List<Indicacao> consulta() {
        ArrayList<Indicacao> indicacoes = new ArrayList<>();
        try {
            open(); // precisa abrir a conexao

            String SQL = "SELECT usuarioindicador, usuarioindicado, comentario, dataregistro FROM lemovie.indicacao";
            //System.out.println(SQL);

            PreparedStatement comando = conn.prepareStatement(SQL);
            ResultSet resultado = comando.executeQuery();
            ResultSetMetaData metadado = resultado.getMetaData();

            while (resultado.next()) {
                Indicacao indicacao = new Indicacao(
                        resultado.getString(1), //usuarioindicador
                        resultado.getString(2), //usuarioindicado
                        resultado.getString(3), //comenario
                        resultado.getString(4) //dataregistro
                );
                indicacoes.add(indicacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return indicacoes;
    }

}
