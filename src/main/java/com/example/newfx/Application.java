package com.example.newfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {


    private static Stage window;

    /**
     * Starts the application
     */
    @Override
    public void start(Stage stage) throws IOException {
        window = stage;
        FXMLLoader loader = new FXMLLoader(Application.class.getResource("index.fxml"));
        Scene scene = new Scene(loader.load(), 320, 500);
        window.setTitle("Home");
        window.setMinHeight(500);
        window.setMinWidth(300);
        window.setScene(scene);
        window.show();
    }

    /**
     * Reduces hassle of finding where the current stage is
     * @return Stage created at app startup
     */
    public static Stage getStage() {
        return window;
    }
    public static void main(String[] args) {
        launch();
    }
}