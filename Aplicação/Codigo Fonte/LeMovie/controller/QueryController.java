package controller;

import javafx.fxml.FXML;
/*
@author Raul Andrade
*/
public class QueryController {

    @FXML
    protected void btnVoltarAction() {
        System.out.println("voltando pra main");
        Main.changeScreen("main"); //quero ir pra tela de querys
    }

    @FXML
    protected void btnUsuariosAction() {
        System.out.println("query usuarios");
        Main.changeScreen("usuarios"); //quero ir pra tela de Usuarios
    }

    @FXML
    protected void btnFilmesAction() {
        System.out.println("query filmes");
        Main.changeScreen("filmes"); //quero ir pra tela de Filmes
    }

    @FXML
    protected void btnSeriesAction() {
        System.out.println("query series");
        Main.changeScreen("series"); //quero ir pra tela de Filmes
    }

    @FXML
    protected void btnLivrosAction() {
        System.out.println("query livros");
        Main.changeScreen("livros"); //quero ir pra tela de Filmes
    }

    @FXML
    protected void btnIndicacoessAction() {
        System.out.println("query indicacoes");
        Main.changeScreen("indicacoes"); //quero ir pra tela de Filmes
    }

    @FXML
    protected void btnGeralAction() {
        System.out.println("query geral");
        Main.changeScreen("geral"); //quero ir pra tela de Filmes
    }

}
