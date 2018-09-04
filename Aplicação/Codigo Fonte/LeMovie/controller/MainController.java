package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import model.Administradores;

/*
@author Raul Andrade
*/
public class MainController {

    @FXML
    private PasswordField idSenha;

    @FXML
    protected void initialize() {

    }

    @FXML
    protected void btnEntrarAction() {
        String senha = idSenha.getText();

        if(Administradores.consulta().contains(senha)) {

            System.out.println("clicado pra query");
            Main.changeScreen("query"); //quero ir pra tela de querys

        }
        else {
           idSenha.promptTextProperty().setValue("senha invalida");
        }
    }

}
