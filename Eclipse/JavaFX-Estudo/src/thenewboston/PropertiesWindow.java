package thenewboston;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PropertiesWindow extends Application {

	private Scene scene;
	private Stage window;
	private Button b;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Properties");

		// Person
		Pessoa p = new Pessoa();
		p.nomeProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Nome mudou para: " + newValue);
			System.out.println("NomeProperty: " + p.nomeProperty());
			System.out.println("getNome: " + p.getNome());
		});

		// Button
		b = new Button("Enviar");
		b.setOnAction(e -> p.setNome("Silva"));

		// Layout
		StackPane layout = new StackPane();
		layout.getChildren().addAll(b);

		// Scene
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}
}