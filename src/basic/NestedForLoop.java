package basic;

public class NestedForLoop {

	public static void main(String[] args) {
		/*for(int i=1; i<=3; i++) {
			System.out.println("Value of i "+i); 
			for(int j=1; j<=i; j++) { 
			System.out.println("value of j is " +j);

				
			}*/
	
		
//Printing Stars	
	/*	for(int i=1; i<=3; i++) {	
			for(int j=1; j<=i; j++) { 
		System.out.print("* ");
		}
        System.out.println();
	}
   */
		
//Printing 1 to 3
		/*for(int i=1; i<=3; i++) {	
			for(int j=1; j<=i; j++) { 
		System.out.print(j );
		}
        System.out.println( );
}
		
		for(int i=1; i<=3; i++) {	
			for(int j=1; j<=i; j++) { 
		System.out.print(i );
		}
        System.out.println( );
}*/
		
		
	/*	int row = 3;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
}
        
        
        for(int i=3; i>=1; i--) {	
			for(int j=1; j<=i; j++) { 
		System.out.print("* " );
		}
        System.out.println( );
}*/
        
 //Joining two triangle   
        int row1 = 3;

		for (int i = 1; i <= row1; i++) {
			for (int j = row1; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int rows = 2;
		for (int i = 1; i <= rows; ++i) {

			// inner loop to print the numbers
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println("");
}
}
}