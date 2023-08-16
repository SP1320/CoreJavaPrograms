package basic;

public class Shape {

	
		static int area(int l, int b) {
			return l * b;
		}

		static double circle(double pie, double r) {
			return pie * (r * r);
		}

		public static void main(String[] args) {
			System.out.println("area of square :" + Shape.area(20, 18));
			System.out.println("Area of circle :" + Shape.circle(3.14, 6));
		}

	}
