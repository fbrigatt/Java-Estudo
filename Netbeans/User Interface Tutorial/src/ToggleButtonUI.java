/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class ToggleButtonUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox root = new HBox();
        root.setAlignment(Pos.CENTER);

        //A toggle button without any caption or icon
        ToggleButton tb1 = new ToggleButton();
        //A toggle button with a text caption
        ToggleButton tb2 = new ToggleButton("Press me");
        //A toggle button with a text caption and an icon
        Image image = new Image(getClass().getResourceAsStream("lakers.png"));
        ToggleButton tb3 = new ToggleButton("Press me", new ImageView(image));
        //root.getChildren().addAll(tb1, tb2, tb3, new Separator(Orientation.HORIZONTAL));
        //
        //Combining Toggle Buttons in a Group
        final ToggleGroup gp1 = new ToggleGroup();

        ToggleButton tb4 = new ToggleButton("Minor");
        tb4.setToggleGroup(gp1);
        tb4.setSelected(true);

        ToggleButton tb5 = new ToggleButton("Major");
        tb5.setToggleGroup(gp1);

        ToggleButton tb6 = new ToggleButton("Critical");
        tb6.setToggleGroup(gp1);

        //Setting User Data for the Toggle Button
        tb4.setUserData(Color.LIGHTGREEN);
        tb5.setUserData(Color.LIGHTBLUE);
        tb6.setUserData(Color.SALMON);

        Rectangle rect = new Rectangle();
        rect.setHeight(50);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.DARKGRAY);
        rect.setStrokeWidth(2);
        rect.setArcHeight(10);
        rect.setArcWidth(10);

        final ToggleGroup gp2 = new ToggleGroup();

        //gp2.selectedToggleProperty().addListener(
        //        (ObservableValue<? extends Toggle> ov, Toggle old_toggle,
        //                Toggle new_toggle) -> {
//
        //        });
        gp2.selectedToggleProperty().addListener((ObservableValue<? extends Toggle> ov,
                Toggle toggle, Toggle new_toggle) -> {
                    if (new_toggle == null) {
                        rect.setFill(Color.WHITE);
                    } else {
                        rect.setFill((Color) gp2.getSelectedToggle().getUserData());
                    }
                });

        HBox hbox = new HBox();
        hbox.setMaxSize(30, 30);
        rect.setWidth(hbox.getWidth());

        root.getChildren().addAll(tb4, tb5, tb6);

        Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add("ui/toggle.css");

        tb4.getStyleClass().add("toggle-button1");
        tb5.getStyleClass().add("toggle-button2");
        tb6.getStyleClass().add("toggle-button3");

        primaryStage.setTitle("ToggleButton");
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
