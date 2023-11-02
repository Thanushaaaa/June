package com.xworkz.ant;

public class Likes {

	public static String likes(String[] names) {
		int count = names.length;

		if (count == 0) {
			return "no one liked this";
		} else if (count == 1) {
			return names[0] + " liked this";
		} else if (count == 2) {
			return names[0] + " and " + names[1] + " liked this";
		} else if (count == 3) {
			return names[0] + ", " + names[1] + " and " + names[2] + " liked this";
		} else {
			return names[0] + ", " + names[1] + " and " + (count - 2) + " others liked this";
		}
	}

	public static void main(String[] args) {

		System.out.println(likes(new String[] {})); // Output: "no one likes this"
		System.out.println(likes(new String[] { "Peter" })); // Output: "Peter likes this"
		System.out.println(likes(new String[] { "Jacob", "Alex" })); // Output: "Jacob and Alex like this"
		System.out.println(likes(new String[] { "Max", "John", "Mark" })); // Output: "Max, John and Mark like this"
		System.out.println(likes(new String[] { "Alex", "Jacob", "Mark", "Max" })); // Output: "Alex, Jacob and 2 others
																					// like this"

	}

}
