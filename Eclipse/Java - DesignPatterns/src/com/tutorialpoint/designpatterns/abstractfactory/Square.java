package com.tutorialpoint.designpatterns.abstractfactory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}