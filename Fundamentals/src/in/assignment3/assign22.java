// Determine can all numbers of an array be made equal
package in.assignment3;

import java.util.Arrays;
import java.util.HashSet;

public class assign22 {
	public static boolean isSubset(int[] arr1, int[] arr2) {
		// Convert arr2 to a HashSet for O(1) average time complexity lookups
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr2) {
			set.add(num);
		}

		// Check if all elements of arr1 are present in set
		for (int num : arr1) {
			if (!set.contains(num)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		if (isSubset(arr1, arr2)) {
			System.out.println("arr1 is a subset of arr2");
		} else {
			System.out.println("arr1 is not a subset of arr2");
		}
	}
}
