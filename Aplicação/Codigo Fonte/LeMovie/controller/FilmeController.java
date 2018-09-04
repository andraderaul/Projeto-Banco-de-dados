package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Filme;
/*
@author Raul Andrade
*/
public class FilmeController {

    @FXML
    private TableView<Filme> tvFilmes;
    // Nome, Autor, Diretor, Sinopse, Ano, Idioma, Duracao
    //a tabela é desenhada aqui
    @FXML
    protected void initialize() {
        TableColumn<Filme, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Filme, String> colAutor = new TableColumn<>("Autor");
        colAutor.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAutor()));

        TableColumn<Filme, String> colDiretor = new TableColumn<>("Diretor");
        colDiretor.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDiretor()));

        TableColumn<Filme, String> colAno = new TableColumn<>("Ano");
        colAno.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAno()));

        TableColumn<Filme, String> colIdioma = new TableColumn<>("Idioma");
        colIdioma.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getIdioma()));

        TableColumn<Filme, String> colDuracao = new TableColumn<>("Duracao");
        colDuracao.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDuracao()));

        tvFilmes.getColumns().addAll(colNome, colAutor, colDiretor, colAno, colIdioma, colDuracao);
        tvFilmes.getItems().addAll(Filme.consulta());

    }


    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("query"); //quero ir pra tela de querys
    }

}
