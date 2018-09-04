package controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Usuario;
/*
@author Raul Andrade
*/
public class UsuariosController {

    @FXML
    private TableView<Usuario> tvUsuarios;

    //a tabela é desenhada aqui
    @FXML
    protected void initialize() {
        TableColumn<Usuario, String> colLogin = new TableColumn<>("Login");
        colLogin.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getLogin()));

        TableColumn<Usuario, String> colNome = new TableColumn<>("Nome");
        colNome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNome()));

        TableColumn<Usuario, String> colSobrenome = new TableColumn<>("Sobrenome");
        colSobrenome.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSobrenome()));

        TableColumn<Usuario, String> colGenero = new TableColumn<>("Genero");
        colGenero.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getGenero()));

        TableColumn<Usuario, String> colSenha = new TableColumn<>("Senha");
        colSenha.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSenha()));

        TableColumn<Usuario, String> colNivelAcesso = new TableColumn<>("NivelAcesso");
        colNivelAcesso.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNivelAcesso()));

        TableColumn<Usuario, String> colDataRegistro = new TableColumn<>("DataRegistro");
        colDataRegistro.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getDataRegistro()));

        tvUsuarios.getColumns().addAll(colLogin, colNome, colSobrenome, colGenero, colSenha, colNivelAcesso, colDataRegistro);
        tvUsuarios.getItems().addAll(Usuario.consulta());

    }

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando");
        Main.changeScreen("query"); //quero ir pra tela de querys
    }

}
