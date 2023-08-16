package basic;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// int a=3;

		// switch(a){

		// case 1: System.out.println("I am @ Home");
		// break;
		// case 2: System.out.println("I am @ Office");
		// break;
		// case 3: System.out.println("I am @ school");
		// break;
		// default:System.out.println("Not @ Home, Office, or school");

		
		
		//int ch = 'b';

		//switch (ch) {

		//case 'a':
			//System.out.println("I am @ Home");
			//break;
		//case 'b':
		//	System.out.println("I am @ Office");
		//	break;
		//case 'c':
		//	System.out.println("I am @ school");
		//	break;
		//default:
		//	System.out.println("Not @ Home, Office, or school");

			
			
		//String a = "Addition";
	//	int b=10,c=11;
	//	switch(a) {
	//	case "Subraction": System.out.println(b-c);
	//	break;
	//	case "Addition": System.out.println(b+c);
	//	break;
	//	case "Division": System.out.println(b/c);
	//	break;
	//	case "Remainder Operator": System.out.println(b%c);
	//	break;
	//	case "Multiplication": System.out.println(b*c);
	//	break;
		
	//	default:
	//		System.out.println("No Operation dne");
			
			
			
			/*char operator;
			   int a,b;
			   Scanner s = new Scanner(System.in)); 
				System.out.println("Choose an operator: +, -, *, or /");
			    operator = s.next().charAt(0);
			    System.out.println("Operator==>"+operator);
			*/

			    // ask users to enter numbers
		        int a, b;
	       Scanner s=new Scanner(System.in); 
	       System.out.println("Enter First Number: ");
	       a=Integer.parseInt(s.nextLine());
	       System.out.println("Enter Second Number: ");
	       b=Integer.parseInt(s.nextLine());
	       
	       while(true){
	          System.out.println("Select an Option...");
	          System.out.println("1. Add");
	          System.out.println("2. Subtract");
	          System.out.println("3. Multiply");
	          System.out.println("4. Divide");
	          System.out.println("5. Exit");
	          System.out.println("Type your selection here: ");
	   
	         // String choice=s.nextLine();
	         // int choice=s.nextInt();
	          char choice=s.next().charAt(0);
	          switch(choice){
	              case '1':
	                  System.out.println("Sum = "+(a+b));
	                  break;
	              case '2':
	                  System.out.println("Difference = "+(a-b));
	                  break;
	              case '3':
	                  System.out.println("Product = "+(a*b));
	                  break;
	              case '4':
	                  System.out.println("Division = "+(a/b));
	                  break;
	              case '5':
	                  System.exit(0);
	              default:
	                  System.out.println("Wrong Choice!!");
	                  break;
	                      
			
		
		
		}

	}
}
}
