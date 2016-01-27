/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class Label_UI extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER_LEFT);
        root.setPadding(new Insets(10));

        //label vazio
        Label label1 = new Label("ABC");
        //label com texto
        Label label2 = new Label("Search");
        //Label com texto e icone
        Image image = new Image(getClass().getResourceAsStream("icone.png"));
        Label label3 = new Label("Search", new ImageView(image));

        //add Icone e Text Fill
        Label label4 = new Label("Search");
        Image image1 = new Image(getClass().getResourceAsStream("lakers.png"));
        label4.setGraphic(new ImageView(image1));
        label4.setTextFill(Color.web("#0076a3"));
        label4
                .setGraphicTextGap(20);//define espaço

        //Fonte
        label2.setFont(new Font("Arial", 30));
        label3.setFont(new Font("Cambria", 32));

        //Wrapping Text
        Label label5 = new Label("A label that needs to be wrapped");
        label5.setWrapText(true);
        //label5.setTextOverrun(OverrunStyle.CLIP);

        //Applying Effects and Zoom Effect
        Label label6 = new Label("Values");
        label6.setFont(new Font("Cambria", 32));
        label6.setRotate(270);
        label6.setTranslateY(50);

        label3.setOnMouseEntered((MouseEvent e) -> {
            label3.setScaleX(1.5);
            label3.setScaleY(1.5);
        });

        label3.setOnMouseExited((MouseEvent e) -> {
            label3.setScaleX(1);
            label3.setScaleY(1);
        });

        root.getChildren().addAll(label1, label2, label3, label4, label5, label6);

        Scene scene = new Scene(root);

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
