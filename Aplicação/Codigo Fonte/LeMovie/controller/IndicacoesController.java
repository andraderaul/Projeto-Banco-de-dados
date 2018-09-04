package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Indicacao;
/*
@author Raul Andrade
*/
public class IndicacoesController {

    @FXML
    private TableView<Indicacao> tvIndicacoes;
    // String usuarioindicador, String usuarioindicado, String comentario, String dataregistro
    //a tabela é desenhada aqui
    @FXML
    protected void initialize() {
        TableColumn<Indicacao, String> colUsuarioindicador = new TableColumn<>("Usuarioindicado");
        colUsuarioindicador.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUsuarioindicador()));

        TableColumn<Indicacao, String> colUsuarioindicado = new TableColumn<>("Usuarioindicado");
        colUsuarioindicado.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUsuarioindicado()));

        TableColumn<Indicacao, String> colComentario = new TableColumn<>("Comentario");
        colComentario.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getComentario()));

        TableColumn<Indicacao, String> colDataregistro = new TableColumn<>("Dataregistro");
        colDataregistro.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDataregistro()));

        tvIndicacoes.getColumns().addAll(colUsuarioindicador, colUsuarioindicado, colComentario, colDataregistro);
        tvIndicacoes.getItems().addAll(Indicacao.consulta());

    }

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("query"); //quero ir pra tela de querys
    }

}
