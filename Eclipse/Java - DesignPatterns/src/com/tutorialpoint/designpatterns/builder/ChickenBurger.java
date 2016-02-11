package com.tutorialpoint.designpatterns.builder;

public class ChickenBurger extends Burguer {

	@Override
	public float price() {
		return 50.5f;
	}

	@Override
	public String name() {
		return "Chicken Burger";
	}
}
