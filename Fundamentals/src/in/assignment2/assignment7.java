//decimal to binary
package in.assignment2;

public class assignment7 {
	public static void dec(int n) {
		int[] binaryNum = new int[1000];
		int i = 0;
		while (n > 0) {
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binaryNum[j]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dec(8);
	}

}
