
package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class App extends Application {
    public String getGreeting() {
        return "Hello World!";
    }

    @Override
    public void start(Stage stage) throws Exception {

        URL fxml_url = getClass().getResource("/app.fxml");

        Parent root = FXMLLoader.load(fxml_url);

        stage.setScene(
                new Scene(root)
        );

        stage.setTitle("hello world");
        stage.show();
    }
}
