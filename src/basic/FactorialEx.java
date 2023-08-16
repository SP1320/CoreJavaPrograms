package basic;

public class FactorialEx {

	public static void main(String[] args) {
	/*	int number=5;
		int factorial = 1;
		
		for(int i = 1;i<=number;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial of "+number+"="+factorial );
	}
*/
		
		
	//while loop
	int num=10;
	int fact1=1;
	int i = 1;
	while(i<=num)
	{
		fact1=fact1*1;
		i++;
	}
	System.out.println(fact1);
	
	
	
	//do while loop
	int num2=5;
	int fact2=1;
	int j = 1;
	do {
		fact2=fact2*j;
		j++;
	}
	while(j<=num2);
	{
		fact2=fact2*1;
		i++;
	}
	System.out.println(fact2);
	}
}
