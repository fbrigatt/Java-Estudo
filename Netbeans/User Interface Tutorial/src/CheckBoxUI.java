/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Raphael_
 */
public class CheckBoxUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("CheckBox");

        HBox hBox = new HBox(10);

        VBox vBox = new VBox(10);

        //A checkbox without a caption
        CheckBox cb1 = new CheckBox();
        //A checkbox with a string caption
        CheckBox cb2 = new CheckBox("Second");

        cb1.setText("First");
        cb1.setSelected(true);

        //Setting the Behavior for the Checkboxes
        //final String[] names = new String[]{"Security", "Project", "Chart"};
        //final Image[] images = new Image[names.length];
        //final ImageView[] icons = new ImageView[names.length];
        //final CheckBox[] cbs = new CheckBox[names.length];
        //
        //for (int i = 0; i < names.length; i++) {
        //    final Image image = images[i]
        //            = new Image(getClass().getResourceAsStream(names[i] + ".png"));
        //    final ImageView icon = icons[i] = new ImageView();
        //    final CheckBox cb = cbs[i] = new CheckBox(names[i]);
        //    cb.selectedProperty().addListener(
        //            (ObservableValue<? extends Boolean> ov,
        //                    Boolean old_val, Boolean new_val) -> {
        //                icon.setImage(new_val ? image : null);
        //            });
        //}
        vBox.getChildren().addAll(cb1, cb2);

        hBox.getChildren().addAll(vBox);
        hBox.setPadding(new Insets(10));

        Scene scene = new Scene(hBox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}