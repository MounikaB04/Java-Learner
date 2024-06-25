//find the sum of the numbers in a given interval 
package in.assignment;

public class Assignment5 {
	public static int interval(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(interval(5, 9));
	}

}
