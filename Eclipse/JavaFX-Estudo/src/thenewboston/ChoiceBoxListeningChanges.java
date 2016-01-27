package thenewboston;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChoiceBoxListeningChanges extends Application {

	private Button button;
	private Scene scene;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		window.setTitle("ChoiceBox");

		button = new Button("Click Me");

		ChoiceBox<String> choiceBox = new ChoiceBox<>();

		// getItems return the ObservableList
		choiceBox.getItems().add("Apples");
		choiceBox.getItems().add("Bananas");
		choiceBox.getItems().addAll("Bacon", "Ham", "MeatBall");
		choiceBox.setValue("Apples");

		// Listen for selection changes
		choiceBox.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> {
					System.out.println(newValue);
				});

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(choiceBox, button);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
}
