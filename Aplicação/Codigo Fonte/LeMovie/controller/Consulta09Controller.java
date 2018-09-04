package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta9;
/*
@author Raul Andrade
*/
public class Consulta09Controller {

    @FXML
    private TableView<Consulta9> tvConsulta9;

    @FXML
    protected void initialize() {

        TableColumn<Consulta9, String> colAno = new TableColumn<>("Ano");
        colAno.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAno()));

        TableColumn<Consulta9, String> colViram = new TableColumn<>("Quantos Viram");
        colViram.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMidia()));

        TableColumn<Consulta9, String> colMidia = new TableColumn<>("Midia");
        colMidia.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getMidia()));

        tvConsulta9.getColumns().addAll(colAno, colViram, colMidia);
        tvConsulta9.getItems().addAll(Consulta9.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
