package com.fxml;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXMLExample extends Application {
	Stage stage;

	@Override
	public void start(Stage stage) throws Exception {
		// BorderPane root = new BorderPane();
		// Scene scene = new Scene(root, 300, 300);
		// stage.setScene(scene);
		// stage.show();

		Parent root = FXMLLoader.load(getClass().getResource("FXMLExample.fxml"));
		Scene scene = new Scene(root, 300, 275);
		stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
