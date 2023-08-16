package basic;

public class BreakContinueEX {
	public static void main(String[] args) {
	
	//Break statement	
		/*	int i=0;
		while (i<5) {
			if(i==2) {
				break;
			}
		System.out.println(i++);
		}
	}*/

		
		
	// continue statement
	int j=0;
	while (j<5) {
		if(j==2) {
			j++;
			continue;
		}
	System.out.println(j++);
	}
	
	
}
}
