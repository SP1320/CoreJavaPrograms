package collection;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap <>();
		hm.put(1, "ABC");
		hm.put(2, "ABC");
		hm.putIfAbsent(2, "PQR");
		hm.putIfAbsent(3, "za");
		System.out.println("Hash Map :" +hm);
		System.out.println("Contains value :" +hm.containsValue("za"));
		System.out.println("Contains Key :" +hm.containsKey(3));
		hm.replace(3, "za", "XYZ");
		System.out.println(hm);
	}

}
