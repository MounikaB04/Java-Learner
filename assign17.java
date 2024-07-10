//can a number be expressed as a sum of two prime numbers
package in.assignment2;

import java.util.Scanner;

public class assign17 {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	// Function to find if a number can be expressed as the sum of two prime numbers
	public static boolean canExpressAsSumOfTwoPrimes(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (isPrime(i) && isPrime(n - i)) {
				System.out.println(n + " = " + i + " + " + (n - i));
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an even number greater than 2: ");
		int number = scanner.nextInt();

		if (number <= 2 || number % 2 != 0) {
			System.out.println("Invalid input. Please enter an even number greater than 2.");
		} else {
			boolean found = canExpressAsSumOfTwoPrimes(number);
			if (!found) {
				System.out.println("Cannot express " + number + " as the sum of two prime numbers.");
			}
		}
		scanner.close();
	}
}
