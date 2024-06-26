package in.assignment;

public class twentytwo {
	public static boolean isPerfectSquare(int n) {
		for (int i = 1; i * i <= n; i++) {
			if ((n % i == 0) && (n / i == i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 36;
		if (n == 0 || isPerfectSquare(n))
			System.out.println("yes");
		else {
			System.out.println("no");
		}
	}

}
