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
 * A similar method is constructor. constructor runs before any @FXML, initialize runs after
 */
public class MenuPageController implements Initializable {


    /**
     * Initialization work
     * @param url
     * @param resourceBundle
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

    @FXML
    protected void onEnter(ActionEvent enter) {
        addToList(fieldForList.getText());
    }
    @FXML
    protected void menuButtonBack() throws IOException {
        Stage stage = (Stage) window.getScene().getWindow();
        Parent loader = FXMLLoader.load(Application.class.getResource("index.fxml"));
        stage.setTitle("Home");
        stage.setScene(new Scene(loader, window.getWidth(), window.getHeight()));
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
