//find the sum of the digit of a number
package in.assignment;

public class Assignment10 {
	public static int getCount(int a) {
		int sum = 0;
		while (a > 0) {
			int rem = a % 10;
			sum=sum+rem;
			a = a / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCount(2345));
	}

}
