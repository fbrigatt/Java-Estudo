package com.bracode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// StackPane pane = new StackPane();//centraliza
		AnchorPane pane = new AnchorPane();// canto

		Scene scene = new Scene(pane);

		pane.setPrefSize(400, 300);

		Label label = new Label();
		label.setText("Hello, World");

		pane.getChildren().add(label);

		stage.setScene(scene);
		stage.setTitle("Hello, World");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
