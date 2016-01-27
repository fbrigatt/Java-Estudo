/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class RadioUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        //A radio button with an empty string for its label
        RadioButton rb1 = new RadioButton();
        //Setting a text label
        rb1.setText("Home");
        //rb1.setSelected(true);
        //A radio button with the specified label
        RadioButton rb2 = new RadioButton("Calendar");

        //Creating a Graphical Radio Button
        Image image1 = new Image(getClass().getResourceAsStream("ok.png"));
        RadioButton rb3 = new RadioButton("Agree");
        rb3.setGraphic(new ImageView(image1));

        //Creating a Group of Radio Buttons
        final ToggleGroup group = new ToggleGroup();
        RadioButton rb4 = new RadioButton("Home");
        rb4.setToggleGroup(group);
        rb4.setSelected(true);

        RadioButton rb5 = new RadioButton("Calendar");
        rb5.setToggleGroup(group);

        RadioButton rb6 = new RadioButton("Contacts");
        rb6.setToggleGroup(group);

        //Processing Action for Radio Buttons
        final ToggleGroup group2 = new ToggleGroup();

        RadioButton rb7 = new RadioButton("Home");
        rb7.setToggleGroup(group2);
        RadioButton rb8 = new RadioButton("Icone");
        rb8.setToggleGroup(group2);
        RadioButton rb9 = new RadioButton("Lakers");
        rb9.setToggleGroup(group2);

        ImageView icon = new ImageView();

        rb7.setUserData("home");
        rb8.setUserData("icone");
        rb9.setUserData("lakers");

        group2.selectedToggleProperty().addListener(
                (ObservableValue<? extends Toggle> ov, Toggle old_toggle,
                        Toggle new_toggle) -> {
                    if (group2.getSelectedToggle() != null) {
                        final Image image3 = new Image(
                                getClass().getResourceAsStream(
                                        group2.getSelectedToggle().getUserData().toString()
                                        + ".png"));
                        icon.setImage(image3);
                    }
                });

        //Requesting Focus for a Radio Button
        rb7.setSelected(true);
        rb7.requestFocus();

        root.getChildren().addAll(rb1, rb2, rb3, new Separator(), rb4, rb5, rb6, new Separator(), rb7, rb8, rb9, icon);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("RadioButton");
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
