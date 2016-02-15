package com.programmingknowledge.datepicker;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController implements Initializable {

	@FXML
	private DatePicker dp;

	@FXML
	private Label showDate;

	public void mostrarData(ActionEvent e) {
		LocalDate date = dp.getValue();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		showDate.setText(date.format(formatador));

		// showDate.setText(date.toString());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		showDate.setText(date.format(formatador));
	}
}
