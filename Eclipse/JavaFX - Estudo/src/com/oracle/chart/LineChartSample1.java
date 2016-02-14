package com.oracle.chart;

/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class LineChartSample1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Line Chart Sample");

		// definindo os eixos
		final NumberAxis xAxis = new NumberAxis();
		final NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Numero do Mês");

		// criando o grafico
		final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
		lineChart.setTitle("Monitoramento de 2010");

		// definindo a serie
		XYChart.Series series = new XYChart.Series();
		series.setName("Meu Portifolio");

		// populando a serie com dados
		series.getData().add(new XYChart.Data(1, 23));
		series.getData().add(new XYChart.Data(2, 14));
		series.getData().add(new XYChart.Data(3, 15));
		series.getData().add(new XYChart.Data(4, 24));
		series.getData().add(new XYChart.Data(5, 34));
		series.getData().add(new XYChart.Data(6, 36));
		series.getData().add(new XYChart.Data(7, 22));
		series.getData().add(new XYChart.Data(8, 45));
		series.getData().add(new XYChart.Data(9, 43));
		series.getData().add(new XYChart.Data(10, 17));
		series.getData().add(new XYChart.Data(11, 29));
		series.getData().add(new XYChart.Data(12, 25));

		Scene scene = new Scene(lineChart, 800, 600);

		// Specifying the Axis Side
		xAxis.setSide(Side.TOP);

		// Disabling Symbols for a Line Chart
		lineChart.setCreateSymbols(false);

		lineChart.getData().addAll(series);

		stage.setScene(scene);
		stage.show();

	}

}
