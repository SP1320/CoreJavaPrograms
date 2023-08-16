package basic;

class Operation {
	void addition(int a, int b, int c) {
		System.out.println("Addition Of 3 Numbers:" + (a + b + c));
	}

	int divide(int a, int b) {
		return a / b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int substract(int a, int b) {
		return a - b;
	}

	public class TypesOfMethod {

		public static void main(String[] args) {
			Operation o = new Operation();
			o.addition(1, 3, 50);
			o.divide(6, 3);
			o.multiply(5, 5);
			o.substract(60, 30);
			System.out.println("Multiplication of 2 numbers" + o.multiply(4, 9));
			System.out.println("Division of 2 numbers" + o.divide(100, 5));
			System.out.println("Substraction of 2 numbers" + o.substract(50, 60));

		}

	}
}
