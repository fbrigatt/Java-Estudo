package com.thenewboston.zoutros;

import javafx.scene.control.Button;

public class Controller1 {

	public Button button1;

	public void handleButtonClick() {
		System.out.println("Codigo executado");
		button1.setText("Clicado!!!");
	}
}
