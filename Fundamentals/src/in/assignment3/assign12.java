//Counting Distinct Elements in an Array
package in.assignment3;

import java.util.Arrays;

public class assign12 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 3, 2, 1, 5, 6};
	        
	        int distinctCount = countDistinctElements(arr);
	        System.out.println("Number of Distinct Elements: " + distinctCount);
	    }
	    
	    public static int countDistinctElements(int[] arr) {
	        if (arr.length == 0) {
	            return 0;
	        }
	        
	        Arrays.sort(arr);
	        int distinctCount = 1; // Start with 1 because the first element is always unique
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[i - 1]) {
	                distinctCount++;
	            }
	        }
	        
	        return distinctCount;
	    }
	}

