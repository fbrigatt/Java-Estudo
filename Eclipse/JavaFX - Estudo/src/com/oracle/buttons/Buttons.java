package com.oracle.buttons;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class Buttons extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER_LEFT);
		root.setPadding(new Insets(10));

		// creating Button
		Button btn1 = new Button();// vazio
		Button btn2 = new Button("Accept");// especificando o texto
		Image imageOK = new Image(getClass().getResourceAsStream("ok.png"));
		Button btn3 = new Button("Accept", new ImageView(imageOK));// texto e
																	// imagem

		// adding an Icon to a Button
		Image imageDecline = new Image(getClass().getResourceAsStream("not.png"));
		Button btn4 = new Button("Decline");
		btn4.setGraphic(new ImageView(imageDecline));
		btn4.setGraphicTextGap(30);

		// atribuindo uma ação
		Label label = new Label("label");
		btn2.setOnAction((ActionEvent e) -> {
			label.setText("Accept");
		});

		// aplicando efeitos
		DropShadow shadow = new DropShadow();
		// mouse is ON
		btn3.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
			btn3.setEffect(shadow);
		});

		// mouse is OFF
		btn3.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
			btn3.setEffect(null);
		});

		// CSS no Button
		btn4.getStyleClass().add("btn4");
		// btn4.setId("botao4");

		root.getChildren().addAll(btn1, btn2, btn3, btn4, label);
		Scene scene = new Scene(root);

		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);

		scene.getStylesheets().add(Buttons.class.getResource("button.css").toExternalForm());
		primaryStage.show();
	}

}