//Determine Array is a subset of another array or not
package in.assignment3;

import java.util.Arrays;
import java.util.HashSet;

public class assign21 {

	    public static boolean isSubset(int[] arr1, int[] arr2) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr2) {
	            set.add(num);
	        }
	        for (int num : arr1) {
	            if (!set.contains(num)) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3};
	        int[] arr2 = {1, 2, 3, 4, 5};

	        if (isSubset(arr1, arr2)) {
	            System.out.println("arr1 is a subset of arr2");
	        } else {
	            System.out.println("arr1 is not a subset of arr2");
	        }
	    }
	}

