//Rotation of elements of array- left and right 
package in.assignment3;

import java.util.Arrays;

public class assign24 {
	public static void leftRotate(int[] arr, int d) {
		int n = arr.length;
		reverse(arr, 0, d - 1); 
		reverse(arr, d, n - 1); 
		reverse(arr, 0, n - 1);
	}

	public static void rightRotate(int[] arr, int d) {
		int n = arr.length;
		leftRotate(arr, n - d);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 2; 

		System.out.println("Original array: " + Arrays.toString(arr));

		leftRotate(arr, d);
		System.out.println("Left rotated array by " + d + " positions: " + Arrays.toString(arr));

		rightRotate(arr, d);
		System.out.println("Right rotated array by " + d + " positions: " + Arrays.toString(arr));
	}
}
