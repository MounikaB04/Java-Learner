//Finding Minimum sum of absolute difference of given array
package in.assignment3;

import java.util.Arrays;

public class assign23 {
	public static int minSumOfAbsoluteDifference(int[] nums) {
		Arrays.sort(nums); 

		int n = nums.length;
		int[] result = new int[n];
		int left = 0, right = n - 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				result[i] = nums[left++];
			} else {
				result[i] = nums[right--];
			}
		}
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
