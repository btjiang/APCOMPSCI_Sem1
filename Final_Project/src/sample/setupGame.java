package sample;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class setupGame {
    static GridPane grid = new GridPane();
    static HashMap stats;
    static Button buttonrow;
    static Button buttoncol;
    public static HashMap display(HashMap gameStats, Stage primaryStage, StackPane mainPane){
        stats = gameStats;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++)
            {
            Button buttonrow = createButton (Integer.toString(i+1));
            Button buttoncol = createButton(Integer.toString(j+1));
                grid.add(buttonrow, i % 3, i / 3);
                grid.add(buttoncol, j % 3, j / 3);
            return j
            }
        return ;
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++)
            {RowConstraints rc = new RowConstraints();
                rc.setFillHeight(true);
                rc.setVgrow(Priority.ALWAYS);
                grid.getRowConstraints().add(rc);
                ColumnConstraints cc = new ColumnConstraints();
                cc.setFillWidth(true);
                cc.setHgrow(Priority.ALWAYS);
                grid.getColumnConstraints().add(cc);}
    }

        grid.add(createButton("#"), 0, 3);
        grid.add(createButton("0"), 1, 3);
        grid.add(createButton("*"), 2, 3);

        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();}

    public static Button createButton(String text) {
        Button button = new Button(text);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setOnAction(e -> System.out.println(text));
        return button ;
    }

}
