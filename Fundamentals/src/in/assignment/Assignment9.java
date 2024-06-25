//find all the prime numbers in a given interval 
package in.assignment;

public class Assignment9 {
	

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
		int x=1;
		int y=10;
		for(int i=x;i<=y;i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}
	}

}
