/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class PieChartSample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setTitle("Imported Fruits");
        stage.setWidth(500);
        stage.setHeight(500);

        ObservableList<PieChart.Data> pieChartData
                = FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30)
                );
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Frutas Importadas");

        //Changing Position of the Labels and the Legend
        chart.setLabelLineLength(10);
        chart.setLegendSide(Side.LEFT);

        //Changing the Start Angle of the Pie Chart Slices
        chart.setClockwise(false);
        chart.setStartAngle(180);

        //Processing Mouse Events for a Pie Chart
        final Label caption = new Label("");
        caption.setTextFill(Color.DARKORANGE);
        caption.setStyle("-fx-font:24 arial; -fx-background-color:white;");

        for (final PieChart.Data data : chart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent e) {
                            caption.setTranslateX(e.getSceneX() + 30);
                            caption.setTranslateY(e.getSceneY());
                            caption.setText(String.valueOf(data.getPieValue()) + "%");
                        }
                    });
            data.getNode().addEventHandler(MouseEvent.MOUSE_EXITED,
                    new EventHandler<MouseEvent>() {
                        @Override
                        public void handle(MouseEvent e) {
                            caption.setTranslateX(e.getSceneX() + 50);
                            caption.setTranslateY(e.getSceneY());
                            caption.setText("");
                        }
                    });
        }

        ((Group) scene.getRoot()).getChildren().addAll(chart, caption);

        stage.setScene(scene);
        stage.show();
    }

}
