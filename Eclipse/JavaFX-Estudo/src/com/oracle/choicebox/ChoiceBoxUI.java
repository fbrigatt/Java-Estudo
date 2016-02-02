/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.choicebox;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class ChoiceBoxUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox root = new HBox();

        //Creating a Choice Box
        ChoiceBox cb1 = new ChoiceBox(FXCollections.observableArrayList(
                "First", "Second", "Third")
        );

        //Choice Box with Text Elements and a Separator
        ChoiceBox cb2 = new ChoiceBox();
        cb2.setItems(FXCollections.observableArrayList(
                "New Document", "Open ",
                new Separator(), "Save", "Save as")
        );

        //Setting the Behavior for a Choice Box
        Label label = new Label("label");
        final String[] greetings = new String[]{"Hello", "Ola", "Bem Vindo"};
        final ChoiceBox cb3 = new ChoiceBox(FXCollections.observableArrayList("English", "Espanhol", "Portugues"));
        cb3.getSelectionModel().selectedIndexProperty().addListener((ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
            label.setText(greetings[new_val.intValue()]);
        });

        //Adding a Tooltip to a Choice Box
        cb3.setTooltip(new Tooltip("Selecione o Idioma"));

        root.getChildren().addAll(cb3, label);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("ChoiceBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
