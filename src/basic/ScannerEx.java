package basic;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String name=scanner.nextLine();
		System.out.println("Name:"+name);
		System.out.println("Enter ur age:");
		int age=scanner.nextInt();
		System.out.println("Age:"+age);
		System.out.println("Enter ur Percentage:");
		float percentage=scanner.nextFloat();
		System.out.println("Percentage:"+percentage);

		
		System.out.println("Enterfirst number:");
		int n1=scanner.nextInt();
		System.out.println("no.1:"+n1);
		System.out.println("Enter second number:");
		int n2=scanner.nextInt();
		System.out.println("no.2:"+n2);
		int sum = n1+n2;
		System.out.println("Addition of:"+n1+"and"+n2+"="+sum);
	}
	

}
