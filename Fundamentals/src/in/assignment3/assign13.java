//Finding Repeating elements in an Array
package in.assignment3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class assign13 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 3, 2, 1, 5, 6};
	        
	        Set<Integer> repeatingElements = findRepeatingElements(arr);
	        System.out.println("Repeating Elements: " + repeatingElements);
	    }
	    
	    public static Set<Integer> findRepeatingElements(int[] arr) {
	        Arrays.sort(arr);
	        Set<Integer> duplicates = new HashSet<>();
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == arr[i - 1]) {
	                duplicates.add(arr[i]);
	            }
	        }
	        
	        return duplicates;
	    }
	}

