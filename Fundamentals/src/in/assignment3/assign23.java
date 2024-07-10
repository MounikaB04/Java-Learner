//Finding Minimum sum of absolute difference of given array
package in.assignment3;

import java.util.Arrays;

public class assign23 {
	public static int minSumOfAbsoluteDifference(int[] nums) {
		Arrays.sort(nums); // Sort the array

		int n = nums.length;
		int[] result = new int[n];

		// Rearrange the array to minimize absolute differences
		int left = 0, right = n - 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				result[i] = nums[left++];
			} else {
				result[i] = nums[right--];
			}
		}

		// Calculate the minimum sum of absolute differences
		int minSum = 0;
		for (int i = 0; i < n - 1; i++) {
			minSum += Math.abs(result[i] - result[i + 1]);
		}

		return minSum;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 1, 8, 7 }; // Example array

		int minSum = minSumOfAbsoluteDifference(nums);
		System.out.println("Minimum sum of absolute differences: " + minSum);
	}
}
