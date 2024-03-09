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
     * Changes the scene to the content one
     */
    @FXML
    protected void startButton(){
        Application.changeScene("MenuPage.fxml", "JavaFX");
    }

    @FXML
    protected void quit() {
        Application.getStage().close();
    }
}
