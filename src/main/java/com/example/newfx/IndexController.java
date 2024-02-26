package com.example.newfx;

import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class IndexController {

    @FXML
    private VBox window;

    @FXML
    protected void startButton() throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("MenuPage.fxml"));
        HelloApplication.getStage().setTitle("JavaFX");
        HelloApplication.getStage().setScene(new Scene(loader, window.getWidth(), window.getHeight()));
    }
}
