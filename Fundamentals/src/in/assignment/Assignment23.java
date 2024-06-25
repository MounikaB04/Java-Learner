//Harshad(niven) number(number which is divisible by the sum of its digits 12=> 1+2 = 3=>12/3=4
package in.assignment;

public class Assignment23 {
	public static boolean checkHarshed(int n) {
		int sum = 0;
		for (int temp = n; temp > 0; temp /= 10) {
			int rem = temp % 10;
			sum += rem;
		}
		return (n % sum == 0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkHarshed(12));
	}

}
