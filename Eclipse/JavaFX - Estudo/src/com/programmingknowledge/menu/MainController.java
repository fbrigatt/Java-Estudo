package com.programmingknowledge.menu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class MainController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void closeApp(ActionEvent e) {
		Platform.exit();
		System.exit(0);
	}

}
