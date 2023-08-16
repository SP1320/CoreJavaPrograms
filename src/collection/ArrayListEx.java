package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList();
		al.add("Sneha");
		al.add("Asmita");
		al.add(0, "Vaishanvi");
		al.add("Priya");
		al.add(" ");
		System.out.println("Elements in My ArrayList :"+al);
		System.out.println("Size Of My ArrayList :"+al.size());
		System.out.println("GetElements in My ArrayList :"+al.get(1));
		al.remove(3);
		System.out.println("Elements in My ArrayList"+al);
		al.remove("Vaishanvi");
		System.out.println("Elements in My ArrayList"+al);
		al.set(2,"Pranali");
		System.out.println("Set in My ArrayList :"+al);
		ArrayList<String>a2=new ArrayList();
		a2.addAll(al);
		System.out.println("AllElements in My ArrayList :"+a2);
		
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Elan", "Raghu"));
		System.out.println("AllElements in My ArrayList :"+arrayList);
		
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1, 2, 3, 4, 5);
		System.out.println("AllElements in My ArrayList :"+list);
		
		Collections.sort(list);
		System.out.println("AllElements in My ArrayList :"+list);
		
	}

}
