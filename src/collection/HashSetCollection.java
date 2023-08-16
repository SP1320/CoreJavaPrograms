package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		cities.add("Sangli");
		cities.add("Mumbai");
		cities.add("Satara");
		cities.add("Kolhapur");

		cities.remove("Mumbai");
		Iterator iterator = cities.iterator();
		while (iterator.hasNext()) {
			String nameOfCity = (String) iterator.next();
			System.out.println(nameOfCity);
		}
	}
}