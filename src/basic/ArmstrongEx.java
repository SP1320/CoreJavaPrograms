package basic;

public class ArmstrongEx {

	public static void main(String[] args) {
		int num=153, originalnum, rem, result=0;
		originalnum=num;
		while(originalnum!=0)
		{
			rem=originalnum%10;
			result+=Math.pow(rem, 3);
			originalnum/=10;
		}
		if(result==num)
			System.out.println("number is armstrong" +num);
		else
			System.out.println("number is not armstrong" +num);
		
	}

}
