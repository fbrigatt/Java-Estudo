package com.tutorialpoint.designpatterns.builder;

public abstract class Burguer implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
