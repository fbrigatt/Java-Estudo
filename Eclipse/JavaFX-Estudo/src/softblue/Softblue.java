package softblue;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Softblue extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Label label = new Label("Meu Texto legal");
		Pane root = FXMLLoader.load(getClass().getResource("Layout.fxml"));

		Scene scene = new Scene(root, 850, 400);
		stage.setScene(scene);

		stage.setTitle("BlueKeeper");
		stage.show();

	}
}

// TIPOS DE LAYOUTS
// Hbox - Organiza os n�s horizontalmente
// Vbox - Organiza os n�s verticalmente
// BorderPane - Top/Bottom/Left/Right/Center
// AnchorPane - Permite ancorar os n�s nos cantos
// StackPane - Empilha os n�s
// GridPane - organiza em linhas e colunas
// FlowPane - organiza em linhas ou colunas e faz quebra se n�o houver
// espa�o
// TilePane - organiza os n�s como o FlowPane, mas em celulas com o
// mesmo tamanho
