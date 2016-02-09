package com.programmingknowledge.filechooser;

import java.io.File;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainController {

	@FXML
	private Button btn1;

	@FXML
	private Button btn2;

	@FXML
	private ListView listView;

	public void button1Action(ActionEvent e) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("E:\\"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("Arquivos em PDF", "*.pdf"));

		File selectedFile = fc.showOpenDialog(null);

		if (selectedFile != null) {
			listView.getItems().add(selectedFile.getName());
			// listView.getItems().add(selectedFile.getAbsolutePath());
			// listView.getItems().add(selectedFile.getParentFile());

		} else {
			System.out.println("File is not valid");
		}
	}

	public void button2Action(ActionEvent e) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("E:\\"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("Arquivos em PDF", "*.pdf"));

		List<File> selectedFiles = fc.showOpenMultipleDialog(null);

		if (selectedFiles != null) {
			for (int i = 0; i < selectedFiles.size(); i++) {
				listView.getItems().add(selectedFiles.get(i).getAbsolutePath());
			}

		} else {
			System.out.println("File is not valid");
		}
	}

}
