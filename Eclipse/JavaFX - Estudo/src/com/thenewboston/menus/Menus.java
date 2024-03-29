package com.thenewboston.menus;

import javax.swing.MenuSelectionManager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Menus extends Application {

	private Scene scene;
	private Stage window;
	private BorderPane layout;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Menus");

		// File Menu - Menu
		Menu fileMenu = new Menu("File");

		// Itens de Menu - MenuItem - SeparatorMenuItem
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction(e -> System.out
				.println("Criando um novo arquivo..."));
		fileMenu.getItems().add(newFile);

		fileMenu.getItems().add(new MenuItem("Open..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Setings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit"));

		// Edit menu
		Menu editMenu = new Menu("_Edit");// underline, cria tecla de atalho
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));
		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Colando..."));
		paste.setDisable(true);
		editMenu.getItems().add(paste);

		// Help Menu - CheckMenuItem
		Menu helpMenu = new Menu("Help");
		CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
		showLines.setOnAction(e -> {
			if (showLines.isSelected()) {
				System.out.println("Program will now display line numbers");
			} else {
				System.out.println("Hiding line numbers");
			}
		});
		CheckMenuItem autoSave = new CheckMenuItem("Enable AutoSave");
		autoSave.setSelected(true);
		helpMenu.getItems().addAll(showLines, autoSave);

		// Difficulty - RadioMenuItem
		Menu difficultyMenu = new Menu("Difficulty");
		ToggleGroup difficultyToggle = new ToggleGroup();

		RadioMenuItem easy = new RadioMenuItem("Easy");
		RadioMenuItem medium = new RadioMenuItem("Medium");
		RadioMenuItem hard = new RadioMenuItem("Hard");

		easy.setToggleGroup(difficultyToggle);
		easy.setSelected(true);
		medium.setToggleGroup(difficultyToggle);
		hard.setToggleGroup(difficultyToggle);

		difficultyMenu.getItems().addAll(easy, medium, hard);

		// MenuBar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, difficultyMenu);

		// Layout
		layout = new BorderPane();
		layout.setTop(menuBar);
		layout.getChildren().addAll();

		// Scene
		scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
	}
}
