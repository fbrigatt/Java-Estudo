package thenewboston;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBoxMessage extends Application {
	Stage window;
	Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ConfirmBox - Sim ou N�o ");

		button = new Button("Click Me");
		button.setOnAction(e -> {
			boolean result = ConfirmBox.display("Title of Window...",
					"Gostaria de ver as fotos ?");

			System.out.println(result);
		});

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

class ConfirmBox {

	static boolean answer;

	public static boolean display(String title, String message) {

		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinWidth(250);

		Label label = new Label();
		label.setText(message);

		// create two buttons
		Button yesButton = new Button("Sim");
		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});

		Button noButton = new Button("N�o");
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});

		// Layout
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label, yesButton, noButton);
		layout.setAlignment(Pos.CENTER);

		// Scene
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.showAndWait();

		return answer;
	}
}
