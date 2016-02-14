package com.programmingknowledge.combobox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class MainController implements Initializable {

	@FXML
	public ComboBox<String> combobox;

	@FXML
	public Label myLabel;

	ObservableList<String> list = FXCollections.observableArrayList("Mark", "Tom", "John", "Jack");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combobox.setItems(list);
	}

	public void comboChanged(ActionEvent e) {
		// myLabel.setText(combobox.getValue());

		combobox.getItems().addAll("Raphael", "Silva", "Oliveira");
	}

	public void buttonAction(ActionEvent e) {
		// myLabel.setText(combobox.getValue());

		combobox.getItems().addAll("Raphael", "Silva", "Oliveira");
	}
}