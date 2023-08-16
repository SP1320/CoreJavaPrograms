package java8;

interface EvenOdd {
	int evod(int x);
}

public class EvenOddEx {

	public static void main(String[] args) {
		EvenOdd eo = (int x) -> {
			if (x % 2 == 0)
				System.out.println("Even no. ");
			else
				System.out.println("Odd no. ");
			return x;
		};
		System.out.println(eo.evod(6));

	}

}
