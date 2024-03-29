package com.thenewboston.switchscenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchScene extends Application {

	Stage window;
	Scene scene1, scene2;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		Label label1 = new Label("Welcome to the first scene...");
		Button btn1 = new Button("-> Scene 2");
		btn1.setOnAction(e -> window.setScene(scene2));

		// Layout 1
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, btn1, new Button("Espaçamento dos botoes"));
		scene1 = new Scene(layout1, 200, 200);

		Button btn2 = new Button("Scene 1 <-");
		btn2.setOnAction(e -> window.setScene(scene1));

		// Layout 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(btn2);
		scene2 = new Scene(layout2, 600, 300);

		window.setScene(scene1);
		window.setTitle("Title here...");
		window.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
