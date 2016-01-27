package thenewboston;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GridPaneInputData extends Application {

	Stage window;
	Scene scene;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("GridPane Input Data");

		// form
		TextField nameInput = new TextField();
		nameInput.setPromptText("...");

		button = new Button("Click Me !");
		button.setOnAction(e -> {
			isInt(nameInput, nameInput.getText());
		});

		// Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(nameInput, button);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private boolean isInt(TextField nameInput, String message) {
		try {
			int age = Integer.parseInt(message);
			System.out.println("Idade: " + age);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Erro: " + message + " N�o � um numero");
			return false;
		}
	}

}
