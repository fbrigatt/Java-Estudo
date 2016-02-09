package com.programmingknowledge.chart.pie;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {
	@FXML
	PieChart pieChart;

	@FXML
	Label lbStatus;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btn(null);
	}

	public void btn(ActionEvent e) {

		ObservableList<Data> list = FXCollections.observableArrayList(new PieChart.Data("Java", 50),
				new PieChart.Data("C++", 20), new PieChart.Data("Python", 30), new PieChart.Data("C#", 10),
				new PieChart.Data("C", 15));
		pieChart.setData(list);

		for (final PieChart.Data d : pieChart.getData()) {
			d.getNode().addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

				@Override
				public void handle(MouseEvent event) {
					lbStatus.setText(String.valueOf(d.getPieValue()) + "%");

					// porcentagem no total
					// lbStatus.setText(String.valueOf(d.getPieValue() / (125.00
					// / 100)) + "%");
				}
			});
		}

	}
}
