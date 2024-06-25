//write a program to check if a given number is prime or not in java
package in.assignment;

public class Assignment8 {
	public static boolean prime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(prime(3));
	}

}
