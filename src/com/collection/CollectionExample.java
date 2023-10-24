package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.Map;

public class CollectionExample {
	public static void main(String[] args) {
		// Create an ArrayList to store a list of integers
		// Implementation of LinkedList
		System.out.println("Implementation of LinkedList : ");
		LinkedList<Integer> num= new LinkedList<>();
		num.add(3);
		num.add(4);
		num.add(1);
		System.out.println(num);
		
		// Implementation of Vector
		System.out.println("Implementation of Vector : ");
		Vector<Integer> element = new Vector<>();
		element.add(300);
		element.add(340);
		element.add(120);
		System.out.println(element);

		List<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		System.out.println("ArrayList of Integers: " + integerList);

		// Create a HashSet to store a set of strings (no duplicates allowed)
		Set<String> stringSet = new HashSet<>();
		stringSet.add("apple");
		stringSet.add("banana");
		stringSet.add("apple"); // Duplicate, won't be added

		System.out.println("HashSet of Strings: " + stringSet);

		// Implementation of HashMap 
		Map<String, Integer> studentScores = new HashMap<>();
		studentScores.put("Rakesh", 90);
		studentScores.put("Dinesh", 85);
		studentScores.put("Champa", 78);

		// Access values using keys
		int dscore = studentScores.get("Dinesh");
		System.out.println("Binod's score: " + dscore);

		// Iterate over the keys and values
		for (String name : studentScores.keySet()) {
			int score = studentScores.get(name);
			System.out.println(name + "'s score: " + score);
		}
	}
}
