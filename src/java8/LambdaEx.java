package java8;

interface Myinterface {
	int add(int a, int b);
}

public class LambdaEx {

	public static void main(String[] args) {
		Myinterface mf = (int a, int b) -> a + b;
		System.out.println("Addition is : " + mf.add(5, 5));
		Myinterface mf1 = (int a, int b) -> a - b;
		System.out.println("Substraction is : " + mf1.add(10, 5));
		Myinterface mf2 = (int a, int b) -> a * b;
		System.out.println("Multiplication is : " + mf2.add(5, 5));
		Myinterface mf3 = (int a, int b) -> a / b;
		System.out.println("division is : " + mf3.add(25, 5));

	}

}
