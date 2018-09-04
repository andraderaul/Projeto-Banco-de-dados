package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
@author Raul Andrade
*/
public class Main extends Application {

    //todas as cenas
    private static Stage stage;
    private static Scene mainScene;
    private static Scene queryScene;
    private static Scene usuariosScene;
    private static Scene filmesScene;
    private static Scene seriesScene;
    private static Scene livrosScene;
    private static Scene indicacoesScene;
    private static Scene geralScene;

    //as dez consultas
    private static Scene consulta01Scene;
    private static Scene consulta02Scene;
    private static Scene consulta03Scene;
    private static Scene consulta04Scene;
    private static Scene consulta05Scene;
    private static Scene consulta06Scene;
    private static Scene consulta07Scene;
    private static Scene consulta08Scene;
    private static Scene consulta09Scene;
    private static Scene consulta10Scene;


    @Override
    public void start(Stage primaryStage) throws Exception{

        stage = primaryStage;
        primaryStage.setTitle("LeMovie");

        // tela de login ou inicial
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/view/main_screen.fxml"));
        mainScene = new Scene(fxmlMain, 640, 400);

        // tela das query
        Parent fxmlQuery = FXMLLoader.load(getClass().getResource("/view/query_screen.fxml"));
        queryScene = new Scene(fxmlQuery, 640, 400);

        // tela de listagem dos usuarios
        Parent fxmlUsuarios = FXMLLoader.load(getClass().getResource("/view/usuarios_screen.fxml"));
        usuariosScene = new Scene(fxmlUsuarios, 640, 400);

        // tela de listagem dos filmes
        Parent fxmlFilmes = FXMLLoader.load(getClass().getResource("/view/filmes_screen.fxml"));
        filmesScene = new Scene(fxmlFilmes, 640, 400);

        // tela de listagem das series
        Parent fxmlSeries = FXMLLoader.load(getClass().getResource("/view/series_screen.fxml"));
        seriesScene = new Scene(fxmlSeries, 640, 400);

        // tela de listagem das livros
        Parent fxmlLivros = FXMLLoader.load(getClass().getResource("/view/livros_screen.fxml"));
        livrosScene = new Scene(fxmlLivros, 640, 400);

        // tela de listagem das indicacoes
        Parent fxmlIndicacoes = FXMLLoader.load(getClass().getResource("/view/indicacoes_screen.fxml"));
        indicacoesScene = new Scene(fxmlIndicacoes, 640, 400);

        // tela de listagem das geral
        Parent fxmlGeral = FXMLLoader.load(getClass().getResource("/view/geral_screen.fxml"));
        geralScene = new Scene(fxmlGeral, 640, 400);


        //--------------------------------
        // as dez consultas

        //consulta 01
        Parent fxmlConsulta01 = FXMLLoader.load(getClass().getResource("/view/consulta01_screen.fxml"));
        consulta01Scene = new Scene(fxmlConsulta01, 640, 400);

        //consulta 02
        Parent fxmlConsulta02 = FXMLLoader.load(getClass().getResource("/view/consulta02_screen.fxml"));
        consulta02Scene = new Scene(fxmlConsulta02, 640, 400);

        //consulta 03
        Parent fxmlConsulta03 = FXMLLoader.load(getClass().getResource("/view/consulta03_screen.fxml"));
        consulta03Scene = new Scene(fxmlConsulta03, 640, 400);

        //consulta 04
        Parent fxmlConsulta04 = FXMLLoader.load(getClass().getResource("/view/consulta04_screen.fxml"));
        consulta04Scene = new Scene(fxmlConsulta04, 640, 400);

        //consulta 05
        Parent fxmlConsulta05 = FXMLLoader.load(getClass().getResource("/view/consulta05_screen.fxml"));
        consulta05Scene = new Scene(fxmlConsulta05, 640, 400);

        //consulta 06
        Parent fxmlConsulta06 = FXMLLoader.load(getClass().getResource("/view/consulta06_screen.fxml"));
        consulta06Scene = new Scene(fxmlConsulta06, 640, 400);

        //consulta 07
        Parent fxmlConsulta07 = FXMLLoader.load(getClass().getResource("/view/consulta07_screen.fxml"));
        consulta07Scene = new Scene(fxmlConsulta07, 640, 400);

        //consulta 08
        Parent fxmlConsulta08 = FXMLLoader.load(getClass().getResource("/view/consulta08_screen.fxml"));
        consulta08Scene = new Scene(fxmlConsulta08, 640, 400);

        //consulta 09
        Parent fxmlConsulta09 = FXMLLoader.load(getClass().getResource("/view/consulta09_screen.fxml"));
        consulta09Scene = new Scene(fxmlConsulta09, 640, 400);

        //consulta 10
        Parent fxmlConsulta10 = FXMLLoader.load(getClass().getResource("/view/consulta10_screen.fxml"));
        consulta10Scene = new Scene(fxmlConsulta10, 640, 400);

        primaryStage.setScene(mainScene);
        primaryStage.show();

    }

    // mudanca de tela
    public static void changeScreen(String opc) {
        switch (opc) {
            case "main":
               stage.setScene(mainScene);
                break;
            case "query":
                stage.setScene(queryScene);
            break;
            case "usuarios":
                stage.setScene(usuariosScene);
                break;
            case "filmes":
                stage.setScene(filmesScene);
                break;
            case "series":
                stage.setScene(seriesScene);
                break;
            case "livros":
                stage.setScene(livrosScene);
                break;
            case "indicacoes":
                stage.setScene(indicacoesScene);
                break;
            case "geral":
                stage.setScene(geralScene);
                break;

            case "consulta01": // as dez consultas
                stage.setScene(consulta01Scene);
                break;
            case "consulta02":
                stage.setScene(consulta02Scene);
                break;
            case "consulta03":
                stage.setScene(consulta03Scene);
                break;
            case "consulta04":
                stage.setScene(consulta04Scene);
                break;
            case "consulta05":
                stage.setScene(consulta05Scene);
                break;
            case "consulta06":
                stage.setScene(consulta06Scene);
                break;
            case "consulta07":
                stage.setScene(consulta07Scene);
                break;
            case "consulta08":
                stage.setScene(consulta08Scene);
                break;
            case "consulta09":
                stage.setScene(consulta09Scene);
                break;
            case "consulta10":
                stage.setScene(consulta10Scene);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
