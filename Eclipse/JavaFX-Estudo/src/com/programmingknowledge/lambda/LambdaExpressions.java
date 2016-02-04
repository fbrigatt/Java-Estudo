package com.programmingknowledge.lambda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LambdaExpressions extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		Button btn = new Button("Clique aqui");
		Button exit = new Button("Sair");

		btn.setOnAction(e -> System.out.println("Ola Mundo!!!"));

		exit.setOnAction(e -> {
			System.out.println("Saindo do aplicativo...");
			System.exit(0);
		});

		VBox root = new VBox();
		root.getChildren().addAll(btn, exit);

		Scene scene = new Scene(root, 100, 100);

		stage.setTitle("Lambda Expressions");
		stage.setScene(scene);
		stage.show();

	}// start

	public static void main(String[] args) {
		launch(args);
	}

}