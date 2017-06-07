package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {

    Button button;
    Button button2;
    Button button3;
    Scene mainScene;
    HashMap gameStats;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage window = primaryStage;
        StackPane mainPane = new StackPane();

        primaryStage.setTitle("Battleship");

        gameStats.clear();
        gameStats.put("playerHP", 5);
        gameStats.put("enemyHP", 5);
        gameStats.put("timeCounter", 0);


        button = new Button("Click1");
        button.setOnAction(e -> setupGame.display(gameStats, window, mainPane));
        button2 = new Button("Click2");
        button2.setOnAction(e -> System.out.println("Hello World2"));
        button3 = new Button("Click3");
        button3.setOnAction(e -> System.out.println("Hit"));
        GridPane gridPane = new GridPane();
        gridPane.setConstraints(button, 0, 0);
        gridPane.setConstraints(button2, 0, 1);
        gridPane.setConstraints(button3, 0, 2);
        gridPane.getChildren().addAll(button,button2,button3);

        mainPane.getChildren().addAll(gridPane);
        mainScene = new Scene(mainPane, 854, 1000);
        window.setScene(mainScene);
        window.setResizable(false);
        window.show();




    }


    public static void main(String[] args) {
        launch(args);
    }
}
