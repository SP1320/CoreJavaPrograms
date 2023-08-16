package basic;

import java.util.Scanner;

public class CarDistanceCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int interval1 = scanner.nextInt();
		int interval2 = scanner.nextInt();
		double initialVelocity = 36 * 1000 / 3600; 
		double acceleration = 5;
		double distance1 = calculateDistance(initialVelocity, acceleration, interval1);
		double distance2 = calculateDistance(initialVelocity, acceleration, interval2);
		System.out.println(distance1);
		System.out.println(distance2);
		scanner.close();
	}

	public static double calculateDistance(double initialVelocity, double acceleration, int time) {
		double distance = initialVelocity * time + (0.5 * acceleration * time * time);
		return distance;
	}
}