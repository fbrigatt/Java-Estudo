package com.thenewboston.confirmbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CloseWindow extends Application {

	Stage window;
	Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Close Window Properly");

		window.setOnCloseRequest(e -> {
			e.consume();
			closeProgram();
		});

		button = new Button("Close Window");
		button.setOnAction(e -> closeProgram());

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();

	}

	private void closeProgram() {

		// System.out.println("Arquivo salvo...");
		// window.close();

		boolean answer = ConfirmBox.display("Title of Window ...",
				"Gostaria mesmo de sair ?");

		if (answer) {
			window.close();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}