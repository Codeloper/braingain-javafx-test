package de.test.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        primaryStage.setTitle("Braingain");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setHeight(1300);
        primaryStage.setWidth(1500);

        primaryStage.show();
        Controller controller = new Controller();
        controller.start(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}