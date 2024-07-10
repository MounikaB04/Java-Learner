//add two fractions using java
package in.assignment2;

public class assign15 {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void addFractions(int num1, int denom1, int num2, int denom2) {
		int lcm = (denom1 * denom2) / gcd(denom1, denom2);
		int sumNum = (num1 * (lcm / denom1)) + (num2 * (lcm / denom2));
		int sumDenom = lcm;
		int gcdResult = gcd(sumNum, sumDenom);
		sumNum /= gcdResult;
		sumDenom /= gcdResult;
		System.out.println("Sum of fractions: " + sumNum + "/" + sumDenom);
	}

	public static void main(String[] args) {
		int num1 = 1, denom1 = 2;
		int num2 = 1, denom2 = 3;

		addFractions(num1, denom1, num2, denom2);
	}
}
