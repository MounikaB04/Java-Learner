//octal to decimal
package in.assignment2;

public class assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 167;
		int res = 0;
		int copy_a = a;
		for (int i = 0; copy_a > 0; i++) {
			int temp = copy_a % 10;
			double p = Math.pow(8, i);
			res += (temp * p);
			copy_a = copy_a / 10;

		}
		System.out.println(res);
	}

}
