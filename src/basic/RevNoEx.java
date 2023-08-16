package basic;

public class RevNoEx {

	public static void main(String[] args) {
		int  num=1234,rev=0;
		
	
		
		while(num!=0) {
			int num1 = 0;
			int r=num1%10;
			int rev1 = rev*10+r;
			num1=num1/10;
		}
		
		System.out.println("Reverse num:"+rev);
	}

}
