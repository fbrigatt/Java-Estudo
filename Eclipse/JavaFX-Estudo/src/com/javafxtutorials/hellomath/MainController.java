package com.javafxtutorials.hellomath;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController implements Initializable {

	@FXML
	private Button btnadd;

	@FXML
	private Button btnsub;

	@FXML
	private Button btnmul;

	@FXML
	private Button btndiv;

	@FXML
	private Button btnclear;

	@FXML
	private Label lblanswer;

	@FXML
	private TextField txtnum1;

	@FXML
	private TextField txtnum2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	private void handleButtonClicked(ActionEvent e) {
		double num1, num2, answer = 0;
		char symbol = 0;

		// e tells us which button was clicked
		if (e.getSource() == btnclear) {
			txtnum1.setText("");
			txtnum2.setText("");
			lblanswer.setText("?");
			txtnum1.requestFocus();
			return;
		}

		try {
			// read numbers in from textfields
			num1 = Double.parseDouble(txtnum1.getText());
			num2 = Double.parseDouble(txtnum2.getText());

			if (e.getSource() == btnadd) {
				symbol = '+';
				answer = num1 + num2;
			}
			if (e.getSource() == btnsub) {
				symbol = '-';
				answer = num1 - num2;
			}
			if (e.getSource() == btnmul) {
				symbol = '*';
				answer = num1 * num2;
			}
			if (e.getSource() == btndiv) {
				symbol = '/';
				answer = num1 / num2;
			}

			// display answer
			lblanswer.setText("" + num1 + symbol + num2 + "=" + answer);

		} catch (Exception ee) {
			lblanswer.setText("Calculo invalido");
		}

	}

}
