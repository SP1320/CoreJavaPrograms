package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx3 {

	public static void main(String[] args) {
		List<String> bikeBrands = Arrays.asList("Giant", "Scott", "Trek", "GT");	
		bikeBrands.forEach(x -> System.out.println(x));	
		System.out.println("****************");
		 bikeBrands.forEach(System.out::println);
	}
	}


