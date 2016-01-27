package softblue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BlueKeeper extends Application {
	@Override
	public void start(Stage stage) throws Exception {

		Pane root = FXMLLoader.load(getClass().getResource("Layout2.fxml"));

		Scene scene = new Scene(root, 850, 400);
		stage.setScene(scene);

		stage.setTitle("BlueKeeper");
		stage.setMinHeight(400);
		stage.setMinWidth(450);

		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
