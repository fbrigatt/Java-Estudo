package com.programmingknowledge.webview;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {
	@FXML
	private WebView webView;

	@FXML
	private TextField tfSite;

	private WebEngine engine;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		engine = webView.getEngine();// load engine for webview
		engine.load("http://www.google.com");
	}

	public void btn1(ActionEvent e) {
		engine.load("http://www.youtube.com");
		// engine.load("http://" + tfSite.getText());
	}

	public void btn2(ActionEvent e) {
		engine.executeScript("window.location = \"http://easyonlineconverter.com//\";");
	}

	public void btn3(ActionEvent e) {
		engine.loadContent("<html><body><h1>Ola Mundo</h1></body></html>");
	}

	public void btn4(ActionEvent e) {
		engine.reload();
		System.out.println(engine.getLocation());
	}

}
