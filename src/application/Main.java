package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {
    public static void main(String[] args) {
      launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        /*Label label = new Label();
        label.setText("hello world.");
        VBox myFirstPane = new VBox();
        myFirstPane.getChildren().add(label);

        Scene myFirstScene = new Scene(myFirstPane);

        
        primaryStage.setTitle("my first JFX project.");
        primaryStage.setHeight(450);
        primaryStage.setWidth(600);
        primaryStage.setScene(myFirstScene);
        primaryStage.show();  */

        calculatorScreen(primaryStage);
    }

    public void calculatorScreen(Stage stage) {
        final int SCREEN_WIDTH = 250;

        TextField expressionField = new TextField();
        TextField answerField = new TextField();

        Button sevenBtn = new Button("7"); sevenBtn.setPrefWidth((double) SCREEN_WIDTH/4);
        Button eightBtn = new Button("8"); eightBtn.setPrefWidth((double) SCREEN_WIDTH/4);
        Button nineBtn = new Button("9"); nineBtn.setPrefWidth((double) SCREEN_WIDTH/4);
        Button multiplyBtn = new Button("*"); multiplyBtn.setPrefWidth((double) SCREEN_WIDTH/4);
        
        Button[] buttons = new Button[]{sevenBtn,eightBtn,nineBtn,multiplyBtn};
        for(Button eachButton: buttons) {
            eachButton.setPrefWidth((double) SCREEN_WIDTH/5);
        }
            
            
        VBox textFieldLine = new VBox(); textFieldLine.getChildren().addAll(expressionField, answerField);
        HBox line1 = new HBox();
        line1.getChildren().addAll(sevenBtn, eightBtn, nineBtn, multiplyBtn);

        VBox mainPane = new VBox();
        mainPane.getChildren().addAll(textFieldLine, line1);


        /***** event handlers *****/
        Button[] allButtons = new Button[] {sevenBtn, eightBtn, nineBtn, multiplyBtn};

        for(Button eachButton : allButtons) {
            eachButton.setOnAction(actionEvent -> {
                String gottenFromExpression = expressionField.getText();
                expressionField.setText(gottenFromExpression + eachButton.getText());
            });
        }

        /*********/


        Scene scene = new Scene(mainPane);


        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.setWidth(250);
        stage.setHeight(500);
        stage.show();
    }
}
