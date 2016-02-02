/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.scroll;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class ScrollBarUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox();

        ScrollBar sc = new ScrollBar();
        sc.setMin(0);
        sc.setMax(500);
        sc.setValue(50);

        root.getChildren().addAll(sc);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
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
