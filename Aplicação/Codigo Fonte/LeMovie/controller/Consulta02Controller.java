package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta2;
/*
@author Raul Andrade
*/
public class Consulta02Controller {


    @FXML
    private TableView<Consulta2> tvConsulta2;

    @FXML
    protected void initialize() {
        TableColumn<Consulta2, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Consulta2, String> colAno = new TableColumn<>("Ano");
        colAno.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAno()));

        tvConsulta2.getColumns().addAll(colNome, colAno);
        tvConsulta2.getItems().addAll(Consulta2.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
