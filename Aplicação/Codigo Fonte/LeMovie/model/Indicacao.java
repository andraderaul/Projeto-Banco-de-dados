package model;

import java.util.List;
import model.JDBC.IndicacaoJDBC;
/*
@author Raul Andrade
*/
public class Indicacao {

    private String usuarioindicador;
    private String usuarioindicado;
    private String comentario;
    private String dataregistro;

    public Indicacao(String usuarioindicador, String usuarioindicado, String comentario, String dataregistro) {
        this.usuarioindicador = usuarioindicador;
        this.usuarioindicado = usuarioindicado;
        this.comentario = comentario;
        this.dataregistro = dataregistro;
    }

    public String getUsuarioindicador() {
        return usuarioindicador;
    }

    public void setUsuarioindicador(String usuarioindicador) {
        this.usuarioindicador = usuarioindicador;
    }

    public String getUsuarioindicado() {
        return usuarioindicado;
    }

    public void setUsuarioindicado(String usuarioindicado) {
        this.usuarioindicado = usuarioindicado;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDataregistro() {
        return dataregistro;
    }

    public void setDataregistro(String dataregistro) {
        this.dataregistro = dataregistro;
    }

    @Override
    public String toString() {
        return "Indicacao("
                + usuarioindicador+"\t"
                + usuarioindicado+"\t"
                + comentario+"\t"
                + dataregistro+"\t"
                ;
    }

    //--------------
    private static IndicacaoJDBC indica = new IndicacaoJDBC();
    public static List<Indicacao> consulta() {
        return indica.consulta();
    }

}
