package com.thenewboston.alertbox;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBoxMessage extends Application {

	Stage window;
	Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("AlertBox - Modal Window");

		button = new Button("Click Me");
		button.setOnAction(e -> AlertBox.display("Title of Window...",
				"AlertBox Message..."));

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

class AlertBox {

	public static void display(String title, String message) {

		// Stage
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);

		Label label = new Label();
		label.setText(message);

		Button closeButton = new Button("Close the window");
		closeButton.setOnAction(e -> window.close());

		// Layout
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, closeButton);
		layout.setAlignment(Pos.CENTER);

		// Scene
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();
	}

}