package basic;

public class StringRevEx {

	public static void main(String[] args) {
		String str= "welcome";
		String rev=" ";
		for(int i=str.length()-1;i>0;i--)
			rev=rev+str.charAt(i);
		{
			System.out.println("Reverse String Loop:"+rev);
		}
	}

}
