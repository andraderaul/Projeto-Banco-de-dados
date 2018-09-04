package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Consulta3;
/*
@author Raul Andrade
*/
public class Consulta03Controller {


    @FXML
    private TableView<Consulta3> tvConsulta3;

    @FXML
    protected void initialize() {
        TableColumn<Consulta3, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome_user()));

        TableColumn<Consulta3, String> colComentario = new TableColumn<>("Comentario");
        colComentario.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getComentario()));

        TableColumn<Consulta3, String> colVisto = new TableColumn<>("Visto");
        colVisto.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getVisto()));

        TableColumn<Consulta3, String> colMidia = new TableColumn<>("Midia");
        colMidia.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome_midia()));



        tvConsulta3.getColumns().addAll(colNome, colComentario, colVisto, colMidia);
        tvConsulta3.getItems().addAll(Consulta3.consulta());
    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("geral"); //quero ir pra tela de geral
    }

}
