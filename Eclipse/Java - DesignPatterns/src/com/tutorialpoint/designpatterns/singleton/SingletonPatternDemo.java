package com.tutorialpoint.designpatterns.singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		// SingleObject object1 = new SingleObject();

		// Get the only object available
		SingleObject object2 = SingleObject.getInstance();

		// show the message
		object2.showMessage();
	}
}
