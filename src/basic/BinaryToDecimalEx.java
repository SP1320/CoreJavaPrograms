package basic;

import java.util.Scanner;

public class BinaryToDecimalEx {

	public static void main(String[] args) {
		
		       Scanner sc = new Scanner( System.in );
		       System.out.print("Enter a binary number: ");
		       String binaryString =sc.nextLine();
		       System.out.println("Output: "+Integer.parseInt(binaryString,2));
		    }

	}


