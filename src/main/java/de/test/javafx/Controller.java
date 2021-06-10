package de.test.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Controller extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WebView myWebView = new WebView();
        WebEngine engine = myWebView.getEngine();
        engine.load("http://localhost:8080");

        engine.setUserAgent("Mozilla/5.0 (Linux; U; Android 2.2.1; en-us; Nexus One Build/FRG83) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");


        VBox root = new VBox();
        root.getChildren().add(myWebView);

        Scene scene = new Scene(root, 800, 500);//800 500

        stage.setScene(scene);

        stage.show();
    }

}