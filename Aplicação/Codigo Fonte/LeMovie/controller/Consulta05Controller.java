package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta5;
/*
@author Raul Andrade
*/
public class Consulta05Controller {


    @FXML
    private TableView<Consulta5> tvConsulta5;

    @FXML
    protected void initialize() {
        TableColumn<Consulta5, String> colLogin = new TableColumn<>("Login");
        colLogin.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getUsuario()));

        TableColumn<Consulta5, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Consulta5, String> colSobrenome = new TableColumn<>("Sobrenome");
        colSobrenome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSobrenome()));

        tvConsulta5.getColumns().addAll(colLogin, colNome, colSobrenome);
        tvConsulta5.getItems().addAll(Consulta5.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
