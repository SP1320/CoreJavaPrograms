package basic;

public class MethodOverloading {

	public int MethodOverloading(int a, int b) {
		return (a + b);
	}

	public int MethodOverloading(int a, int b, int c) {
		return (a + b + c);
	}

	public static void main(String args[]) {
		MethodOverloading s = new MethodOverloading();
		System.out.println(s.MethodOverloading(10, 20));
		System.out.println(s.MethodOverloading(10, 20, 30));

	}

}
