package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta1;
/*
@author Raul Andrade
*/
public class Consulta01Controller {

    @FXML
    private TableView<Consulta1> tvConsulta1;

    @FXML
    protected void initialize() {
        TableColumn<Consulta1, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Consulta1, String> colSobrenome = new TableColumn<>("Sobrenome");
        colSobrenome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSobrenome()));

        tvConsulta1.getColumns().addAll(colNome, colSobrenome);
        tvConsulta1.getItems().addAll(Consulta1.consulta());
    }

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }



}
