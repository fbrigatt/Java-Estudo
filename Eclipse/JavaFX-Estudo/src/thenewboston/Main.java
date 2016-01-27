package thenewboston;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//public class Main extends Application implements EventHandler<ActionEvent> {
public class Main extends Application {
	Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of Window");
		button = new Button();
		button.setText("Click me");

		// button.setOnAction(this);
		button.setOnAction(e -> {
			System.out.println("Fui clicado...");
			System.out.println("texto 2");
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	// @Override
	// public void handle(ActionEvent event) {
	// if (event.getSource() == button) {
	// System.out.println("Fui clicado ...");
	// }
	// }

}