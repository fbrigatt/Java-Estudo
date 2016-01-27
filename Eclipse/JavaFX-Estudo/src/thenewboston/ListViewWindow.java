package thenewboston;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewWindow extends Application {

	private Button button;
	private Scene scene;

	ListView<String> listView;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		window.setTitle("ListView");
		button = new Button("Submit");

		// ListView
		listView = new ListView<>();
		listView.getItems().addAll("Iron Man", "Avengers", "Hulk");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

		button.setOnAction(e -> buttonClick());

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(listView, button);

		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	private void buttonClick() {
		String message = "";
		ObservableList<String> movies;

		movies = listView.getSelectionModel().getSelectedItems();

		for (String filmes : movies) {
			message += filmes + "\n";
		}

		System.out.println(message);

	}
}