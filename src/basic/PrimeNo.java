package basic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int factCount = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factCount +=1;
				if(factCount>2) {
					System.out.println("The given number is not prime");
					break;
				}
			}
		}
		if(factCount==2) {
			System.out.println("The given number is prime");
		}
	}
}
			