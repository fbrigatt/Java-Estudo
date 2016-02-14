package com.programmingknowledge.listview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable {

	@FXML
	public ComboBox<String> combobox;
	@FXML
	public ListView<String> listView;

	@FXML
	public Label myLabel;

	ObservableList<String> list = FXCollections.observableArrayList("Mark", "Tom", "John", "Jack");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// combobox.setItems(list);
		listView.setItems(list);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}

	public void comboChanged(ActionEvent e) {
		// myLabel.setText(combobox.getValue());

		combobox.getItems().addAll("Raphael", "Silva", "Oliveira");
	}

	public void buttonAction(ActionEvent e) {
		// myLabel.setText(combobox.getValue());

		// combobox.getItems().addAll("Raphael", "Silva", "Oliveira");

		// listView.getItems().addAll("Raphael", "Silva", "Oliveira");

		ObservableList<String> names;
		names = listView.getSelectionModel().getSelectedItems();

		for (String n : names) {
			System.out.println(n);
		}

		combobox.setItems(names);

	}
}
