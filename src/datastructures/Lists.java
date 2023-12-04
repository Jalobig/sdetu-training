package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Montreal");
		cities.add("Toronto");
		cities.add("Ottawa");
		cities.add("Calgary");
		cities.add("Vancouver");
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		int size = cities.size();
		if (size == 1) {
			System.out.println("There is 1 city in the list.");
			
		} else {
			System.out.println("There are " + size + " cities in the list.");
		}
		
		System.out.println(cities.get(0));
		
		
		
		
	}

}
