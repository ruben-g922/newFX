package com.example.newfx.controllers;

import com.example.newfx.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class IndexController {

    @FXML
    private VBox window;

    /**
     * Changes the scene to the main one
     * Showcases one way of changing the scene
     */
    @FXML
    protected void startButton() throws IOException {
        Parent loader = FXMLLoader.load(Application.class.getResource("MenuPage.fxml"));
        Application.getStage().setTitle("JavaFX");
        Application.getStage().setScene(new Scene(loader, window.getWidth(), window.getHeight()));
    }

    @FXML
    protected void quit() {
        Application.getStage().close();
    }
}
