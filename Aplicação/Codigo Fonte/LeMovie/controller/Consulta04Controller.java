package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta4;
/*
@author Raul Andrade
*/
public class Consulta04Controller {


    @FXML
    private TableView<Consulta4> tvConsulta4;

    @FXML
    protected void initialize() {
        TableColumn<Consulta4, String> colQtd = new TableColumn<>("Qtd Notas");
        colQtd.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getQtd_nota()));

        TableColumn<Consulta4, String> colNota = new TableColumn<>("Nota");
        colNota.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNota()));

        tvConsulta4.getColumns().addAll(colQtd, colNota);
        tvConsulta4.getItems().addAll(Consulta4.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
