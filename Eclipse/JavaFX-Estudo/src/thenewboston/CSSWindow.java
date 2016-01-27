package thenewboston;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CSSWindow extends Application {

	Stage window;
	private Button signUp;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("GridPane");

		// Layout
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(10);
		grid.setHgap(10);

		// Name label
		Label nameLabel = new Label("Username: ");
		nameLabel.setId("bold-label");
		GridPane.setConstraints(nameLabel, 0, 0);

		// Name input
		TextField nameInput = new TextField("Raphael ...");
		GridPane.setConstraints(nameInput, 1, 0);

		// Password label
		Label passLabel = new Label("Password: ");
		GridPane.setConstraints(passLabel, 0, 1);

		// Password input
		TextField passInput = new TextField();
		passInput.setPromptText("digite a senha ...");
		GridPane.setConstraints(passInput, 1, 1);

		// Login Button
		Button loginButton = new Button("Login");
		GridPane.setConstraints(loginButton, 1, 2);
		loginButton.setOnAction(e -> {
			// setUserAgentStylesheet(STYLESHEET_CASPIAN);
		});

		// Sign-up
		signUp = new Button("Sign Up");
		signUp.getStyleClass().add("button-blue");
		GridPane.setConstraints(signUp, 1, 3);

		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUp);

		Scene scene = new Scene(grid, 300, 200);
		scene.getStylesheets().add(getClass().getResource("CSSWindow.css").toExternalForm());
		window.setScene(scene);
		window.show();
	}

}