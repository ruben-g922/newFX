package com.example.newfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    public static void main(String[] args) {
        launch();
    }


    /** This static variable holds the main stage
    The stage is the window, so it makes sense to only have a single main one
    Having it be a static variable makes it easy to retrieve in other classes
    Useful for when needing to change the stage's scene */
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
     * Gets the main stage
     * @return Stage created at app startup
     */
    public static Stage getStage() {
        return window;
    }


    /**
     * Handles changing the scenes
     * @param resource name of view to show
     * @param title new title for the stage
     */
    public static void changeScene(String resource, String title) {
        try {
            Parent loader = FXMLLoader.load(Application.class.getResource(resource));
            Application.getStage().setTitle(title);
            Application.getStage().setScene(new Scene(loader, window.getWidth(), window.getHeight()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}