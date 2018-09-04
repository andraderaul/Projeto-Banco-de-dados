package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta10;
/*
@author Raul Andrade
*/
public class Consulta10Controller {


    @FXML
    private TableView<Consulta10> tvConsulta10;

    @FXML
    protected void initialize() {

        TableColumn<Consulta10, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Consulta10, String> colHoras = new TableColumn<>("Horas assistidas");
        colHoras.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getHoras_assistidas()));

        tvConsulta10.getColumns().addAll(colNome, colHoras);
        tvConsulta10.getItems().addAll(Consulta10.consulta());
    }



    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
