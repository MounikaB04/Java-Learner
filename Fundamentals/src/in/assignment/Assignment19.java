//factor of a number
package in.assignment;

public class Assignment19 {
	public static void factor(int n) {
		int i=1;
		while (i <= n) {
			if (n % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factor(40);
	}

}
