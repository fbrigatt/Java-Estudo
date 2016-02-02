package com.thenewboston.checkbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxWindow extends Application {

	private Button button;
	private Scene scene;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		window.setTitle("CheckBox Window");

		// CheckBox
		CheckBox box1 = new CheckBox("Bacon");
		CheckBox box2 = new CheckBox("Tuna");
		box2.setSelected(true);

		// Button
		button = new Button("Order now");
		button.setOnAction(e -> handleOptions(box1, box2));

		// Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(box1, box2, button);

		scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}

	private void handleOptions(CheckBox box1, CheckBox box2) {
		String message = "Pedido: ";

		if (box1.isSelected()) {
			message += "Bacon ";
		}
		if (box2.isSelected()) {
			message += "Tuna ";
		}

		System.out.println(message);
	}
}
