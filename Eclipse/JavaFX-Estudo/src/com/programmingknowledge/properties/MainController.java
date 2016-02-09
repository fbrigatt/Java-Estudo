package com.programmingknowledge.properties;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class MainController implements Initializable {

	final MyNumber myNumber = new MyNumber();

	@FXML
	private Label lblStatus;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		myNumber.setNumber(0);
		myNumber.numberProperty().addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
				lblStatus.setText(new Double(myNumber.getNumber()).toString());
			}
		});
	}

	public void btnClick(ActionEvent e) {
		myNumber.setNumber(myNumber.getNumber() + 1);
	}

}
