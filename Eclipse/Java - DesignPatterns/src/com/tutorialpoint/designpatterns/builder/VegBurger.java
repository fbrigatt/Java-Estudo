package com.tutorialpoint.designpatterns.builder;

public class VegBurger extends Burguer {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}

}
