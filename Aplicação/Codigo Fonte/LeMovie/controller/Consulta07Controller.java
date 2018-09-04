package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta7;
/*
@author Raul Andrade
*/
public class Consulta07Controller {

    @FXML
    private TableView<Consulta7> tvConsulta7;

    @FXML
    protected void initialize() {
        TableColumn<Consulta7, String> colUsuario = new TableColumn<>("Usuario");
        colUsuario.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUsuario()));

        TableColumn<Consulta7, String> colVisto = new TableColumn<>("Visto");
        colVisto.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getVisto()));

        TableColumn<Consulta7, String> colMidia = new TableColumn<>("Midia");
        colMidia.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome_midia()));

        TableColumn<Consulta7, String> colComentario = new TableColumn<>("Comentario");
        colComentario.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getComentario()));

        tvConsulta7.getColumns().addAll(colUsuario, colVisto, colMidia, colComentario);
        tvConsulta7.getItems().addAll(Consulta7.consulta());
    }

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
