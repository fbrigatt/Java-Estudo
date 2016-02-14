package com.oracle.collections;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class CollectionsDemo6_Collections_FXCollections {

	public static void main(String[] args) {

		// Use Java Collections to create the List
		List<String> list = new ArrayList<>();
		list.add("d");
		list.add("b");
		list.add("a");
		list.add("c");

		// Now add observability by wrapping it with ObservableList
		ObservableList<String> observableList = FXCollections.observableList(list);
		observableList.addListener(new ListChangeListener() {
			@Override
			public void onChanged(ListChangeListener.Change change) {
				System.out.println("Detected a change! ");
				while (change.next()) {
					System.out.println("Was added? " + change.wasAdded());
					System.out.println("Was removed? " + change.wasRemoved());
					System.out.println("Was replaced? " + change.wasReplaced());
					System.out.println("Was permutated? " + change.wasPermutated());
				}
			}
		});

		// Sort using FXCollections
		FXCollections.sort(observableList);
		observableList.add("aa");
		observableList.remove("aa");
		observableList.add("aa");

		for (String s : observableList) {
			System.out.println(s);
		}
	}
}
