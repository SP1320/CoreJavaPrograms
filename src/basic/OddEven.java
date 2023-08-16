package basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
         num=sc.nextInt();
        
        switch(num%2){
        case 0:
        	System.out.println("This is the Even Number");
        	break;
        	
        case  1:
            System.out.println("This is the Odd Number");
           
        }
	}

}
