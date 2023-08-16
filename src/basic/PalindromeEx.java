package basic;

public class PalindromeEx {

	public static void main(String[] args) {
		int n=121;
		int r,temp=n;
		int rev=0;
		while(n!=0) {
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}System.out.println("reverse number"+rev);
		if(temp==rev) {
			System.out.println("the no. is palindrome");
		}else {
			System.out.println("the no. is not palindrome");
			
		}
		
	}

}
