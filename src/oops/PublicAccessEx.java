package oops;

public class PublicAccessEx {

	public static void main(String[] args) {
		PublicEx s1=new PublicEx();
		//s1.s="Asmita";
		System.out.println(s1.s);
		s1.display();
	}

}
