//Finding Arrays are disjoint or not
package in.assignment3;

import java.util.HashSet;

public class assign20 {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };

		
		boolean areDisjoint = areDisjoint(array1, array2);
		if (areDisjoint) {
			System.out.println("The arrays are disjoint.");
		} else {
			System.out.println("The arrays are not disjoint.");
		}
	}

	public static boolean areDisjoint(int[] array1, int[] array2) {
		HashSet<Integer> set = new HashSet<>();
		for (int element : array1) {
			set.add(element);
		}
		for (int element : array2) {
			if (set.contains(element)) {
				return false; 
			}
		}
		return true;
	}
}
