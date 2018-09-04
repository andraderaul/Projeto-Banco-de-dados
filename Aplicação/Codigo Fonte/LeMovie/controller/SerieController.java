package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Serie;
/*
@author Raul Andrade
*/
public class SerieController {

    @FXML
    private TableView<Serie> tvSeries;
    // Nome, Autor, Diretor, Sinopse, Ano, Idioma, Temporadas
    //a tabela é desenhada aqui
    @FXML
    protected void initialize() {
        TableColumn<Serie, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Serie, String> colAutor = new TableColumn<>("Autor");
        colAutor.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAutor()));

        TableColumn<Serie, String> colDiretor = new TableColumn<>("Diretor");
        colDiretor.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDiretor()));

        TableColumn<Serie, String> colAno = new TableColumn<>("Ano");
        colAno.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAno()));

        TableColumn<Serie, String> colIdioma = new TableColumn<>("Idioma");
        colIdioma.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getIdioma()));

        TableColumn<Serie, String> colDuracao = new TableColumn<>("Temporadas");
        colDuracao.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getTemporadas()));

        tvSeries.getColumns().addAll(colNome, colAutor, colDiretor, colAno, colIdioma, colDuracao);
        tvSeries.getItems().addAll(Serie.consulta());

    }

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("query"); //quero ir pra tela de querys
    }


}
