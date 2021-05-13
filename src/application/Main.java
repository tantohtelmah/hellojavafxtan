package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
      launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label();
        label.setText("hello world.");
        VBox myFirstPane = new VBox();
        myFirstPane.getChildren().add(label);

        Scene myFirstScene = new Scene(myFirstPane);

        
        primaryStage.setTitle("my first JFX project.");
        primaryStage.setHeight(400);
        primaryStage.setWidth(600);
        primaryStage.setScene(myFirstScene);
        primaryStage.show();
    }
}
