package basic;

public class StarPatternEx {

	public static void main(String[] args) {
	/*	for(int i=0; i<=3; i++) {	
			for(int j=1; j<=3-i; j++) { 
		System.out.print(" ");
		}
			for(int k=0;k<=i;k++) {
			}
        System.out.println("*");
	}
		System.out.println(" ");
	}*/

    int row=3;
    for (int i = 0; i <row; i++) {

	for (int j = row - i; j > 1; j--) { 

	System.out.print(" "); 
	}

	for (int j = 0; j <= i; j++) { 
	System.out.print("* "); 
	}
	System.out.println(); //Newline
	}
}
}