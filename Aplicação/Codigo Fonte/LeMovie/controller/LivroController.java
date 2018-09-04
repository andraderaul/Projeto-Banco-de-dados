package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Livro;
/*
@author Raul Andrade
*/
public class LivroController {

    @FXML
    private TableView<Livro> tvLivros;
    // isbn, nome, autor, ano, idioma, paginas

    //a tabela é desenhada aqui
    @FXML
    protected void initialize() {

        TableColumn<Livro, String> colIsbn = new TableColumn<>("ISBN");
        colIsbn.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getIsbn()));

        TableColumn<Livro, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Livro, String> colAutor = new TableColumn<>("Autor");
        colAutor.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAutor()));


        TableColumn<Livro, String> colAno = new TableColumn<>("Ano");
        colAno.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getAno()));

        TableColumn<Livro, String> colIdioma = new TableColumn<>("Idioma");
        colIdioma.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getIdioma()));

        TableColumn<Livro, String> colPagina = new TableColumn<>("Duracao");
        colPagina.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getPaginas()));

        tvLivros.getColumns().addAll(colIsbn, colNome, colAutor, colAno, colIdioma, colPagina);
        tvLivros.getItems().addAll(Livro.consulta());

    }

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("query"); //quero ir pra tela de querys
    }
}
