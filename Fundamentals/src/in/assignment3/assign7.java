//Sort first half in ascending order and second half in descending
package in.assignment3;

import java.util.Arrays;

public class assign7 {
	public static void printOrder(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++)
			System.out.print(arr[i] + " ");
		for (int j = n - 1; j > n / 2; j--)
			System.out.print(arr[j] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 9, 8, 5, 7, 4, 3 };
		int n = arr.length;
		printOrder(arr, n);
	}

}
