package thenewboston;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewWindow extends Application {

	private Button button;
	private Scene scene;
	private Stage window;
	TreeView<String> tree;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("TreeView");

		// TreeItem
		TreeItem<String> root, bucky, megan;

		// Root
		root = new TreeItem<>();
		root.setExpanded(true);

		// Bucky
		bucky = makeBranch("Bucky", root);
		makeBranch("thenewboston", bucky);
		makeBranch("YouTube", bucky);
		makeBranch("Google", bucky);

		// Megan
		megan = makeBranch("Megan", root);
		makeBranch("Ferrari", megan);
		makeBranch("Lamborghini", megan);

		// create Tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);

		tree.getSelectionModel().selectedItemProperty()
				.addListener((v, oldValue, newValue) -> {
					if (newValue != null) {
						System.out.println(newValue.getValue());
					}
				});

		// Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);

		// Scene
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
	}

	// create branches
	public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {

		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
}