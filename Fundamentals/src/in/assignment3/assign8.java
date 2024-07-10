//Sort the elements of an array
package in.assignment3;

import java.util.Arrays;

public class assign8 {
	public static void sort(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n ; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 9, 8, 5, 7, 4, 3 };
		int n = arr.length;
		sort(arr, n);
	}

}
