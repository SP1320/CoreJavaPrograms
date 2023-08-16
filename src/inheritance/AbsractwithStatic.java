package inheritance;

abstract class Z {

	abstract static void func();
}

class X extends Z {

	static void func() {
		System.out.println("Static abstract method implemented.");
	}
}

public class AbsractwithStatic {
	public static void main(String args[]) {
		X.func();
	}
}
