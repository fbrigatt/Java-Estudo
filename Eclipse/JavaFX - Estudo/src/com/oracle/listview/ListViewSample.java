package com.oracle.listview;

/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raphael_
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ListViewSample extends Application {

	public static final ObservableList names = FXCollections.observableArrayList();
	public static final ObservableList data = FXCollections.observableArrayList();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("List View Sample");

		final ListView listView = new ListView(data);
		listView.setPrefSize(200, 250);
		listView.setEditable(true);

		names.addAll("Adam", "Alex", "Alfred", "Albert", "Brenda", "Connie", "Derek", "Donny", "Lynne", "Myrtle",
				"Rose", "Rudolph", "Tony", "Trudy", "Williams", "Zach");

		for (int i = 0; i < 5; i++) {
			data.add("anonym");
		}

		listView.setItems(data);
		listView.setCellFactory(ComboBoxListCell.forListView(names));

		StackPane root = new StackPane();
		root.getChildren().add(listView);
		primaryStage.setScene(new Scene(root, 200, 250));
		primaryStage.show();
	}
}
