package java8;

   interface Sayable {
	void say();
}

public class MethodReferenceEx2 {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable s = MethodReferenceEx2::saySomething;
		// Calling interface method
		s.say();
	}
}
