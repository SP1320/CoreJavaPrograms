package oops;

public class MethodOverloadingEx {

	public int MethodOverloadingEx(int a, int b) {

		return (a * b);
	}

	public int MethodOverloadingEx(int a, int b, int c) {
		return (a * b * c);

	}

	public static void main(String[] args) {
		MethodOverloadingEx s = new MethodOverloadingEx();

		System.out.println(s.MethodOverloadingEx(5, 5));
		System.out.println(s.MethodOverloadingEx(5, 5, 5));
	}
}



