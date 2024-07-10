//binary to decimal conversion
package in.assignment2;

public class assign3 {
	public static int binaryToDecimal(int n) {
		int num = n;
		int dec_value = 0;
		int base = 1;
		int temp = num;
		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec_value += last_digit * base;
			base = base * 2;
		}
		return dec_value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1001;
		System.out.println(binaryToDecimal(num));
	}

}
