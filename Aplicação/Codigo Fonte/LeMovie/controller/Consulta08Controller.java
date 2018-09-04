package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta8;
/*
@author Raul Andrade
*/
public class Consulta08Controller {

    @FXML
    private TableView<Consulta8> tvConsulta8;

    @FXML
    protected void initialize() {

        TableColumn<Consulta8, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Consulta8, String> colTipo = new TableColumn<>("Tipo");
        colTipo.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTipo()));

        TableColumn<Consulta8, String> colMedia = new TableColumn<>("Media");
        colMedia.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMedia()));

        tvConsulta8.getColumns().addAll(colNome, colTipo, colMedia);
        tvConsulta8.getItems().addAll(Consulta8.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
