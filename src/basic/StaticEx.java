package basic;

class Student {
	public static int fee;
	public static String name="Sneha";
}

public class StaticEx{
	public static void main(String[] args) {
		Student.fee=2000;
		System.out.println("Fee :"+Student.fee);
		Student.name="deepika";
		System.out.println("Name :"+Student.name);
		
		

	}

}
