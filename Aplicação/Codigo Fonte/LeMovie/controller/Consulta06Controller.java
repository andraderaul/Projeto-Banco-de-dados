package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta6;
/*
@author Raul Andrade
*/
public class Consulta06Controller {

    @FXML
    private TableView<Consulta6> tvConsulta6;

    @FXML
    protected void initialize() {
        TableColumn<Consulta6, String> colComentou = new TableColumn<>("Usuario Comentou");
        colComentou.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUser_comentou()));

        TableColumn<Consulta6, String> colRespondeu = new TableColumn<>("Usuario Respondeu");
        colRespondeu.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUser_respondeu()));

        tvConsulta6.getColumns().addAll(colComentou, colRespondeu);
        tvConsulta6.getItems().addAll(Consulta6.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
