package com.example.newfx.controllers;

import com.example.newfx.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the MenuPage view
 * Note that this controller implements Initializable
 * This allows us to override the initialize method and run setup code, like populate the listview
 * A similar method is constructor. difference is constructor runs before any @FXML are initialized
 */
public class MenuPageController implements Initializable {


    /**
     * Initialization work
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] starterStack = {"1","2","3"} ;
        listView.getItems().addAll(starterStack);
    }

    @FXML
    private AnchorPane window;

    @FXML
    private ListView<String> listView;

    @FXML
    private TextField fieldForList;

    /**
     * Adds an item to the listview
     */
    @FXML
    protected void addItemToList() {
        addToList(fieldForList.getText());
    }

    /**
     * Clears the items from the listview
     */
    @FXML
    protected void clearList() {
        listView.getItems().clear();
    }

    /**
     * Allows hitting enter key to enter
     */
    @FXML
    protected void onEnter(ActionEvent enter) {
        addToList(fieldForList.getText());
    }

    /**
     * Returns to the index page
     * Showcases another way to change the scene
     * Personally prefer the other way, fewer lines and cleaner, but just to show it
     */
    @FXML
    protected void menuButtonBack() throws IOException {
        Stage stage = (Stage) window.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(Application.class.getResource("index.fxml"));
        Scene scene = new Scene(loader.load(), window.getWidth(), window.getHeight());
        stage.setTitle("Home");
        stage.setScene(scene);
    }

    /**
     * Handles adding an item to the list, and clearing the text field
     * @param s Text to add
     */
    private void addToList(String s) {
        if (s.length() < 1) return;
        listView.getItems().add(s);
        fieldForList.clear();
    }


}
