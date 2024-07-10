//find GCD of HCF of two numbers
package in.assignment2;

public class assign1 {
	public static int gcd(int x, int y) {
		if (x == 0)
			return y;
		if (y == 0)
			return x;
		if (x == y)
			return x;
		if (x > y)
			return gcd(x - y, y);
		return gcd(x, y - x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(100,88));
	}

}
