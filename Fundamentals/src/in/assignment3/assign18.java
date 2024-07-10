// Find all Symmetric pairs in an array
package in.assignment3;

import java.util.HashSet;
import java.util.Set;

public class assign18 {
	    public static void main(String[] args) {
	        // Example array of pairs
	        int[][] pairs = {
	            {1, 2},
	            {3, 4},
	            {5, 9},
	            {2, 1},
	            {4, 3},
	            {9, 5},
	            {7, 8}
	        };

	        // Find and print all symmetric pairs
	        Set<String> symmetricPairs = findSymmetricPairs(pairs);
	        for (String pair : symmetricPairs) {
	            System.out.println(pair);
	        }
	    }

	    public static Set<String> findSymmetricPairs(int[][] pairs) {
	        // Set to store pairs
	        Set<String> pairSet = new HashSet<>();
	        // Set to store symmetric pairs
	        Set<String> symmetricPairs = new HashSet<>();

	        // Iterate through each pair
	        for (int[] pair : pairs) {
	            int first = pair[0];
	            int second = pair[1];

	            // Create string representations of pairs
	            String pairStr = first + "," + second;
	            String symmetricPairStr = second + "," + first;

	            // Check if the symmetric pair exists in the set
	            if (pairSet.contains(symmetricPairStr)) {
	                // Symmetric pair found
	                symmetricPairs.add("(" + second + ", " + first + ")");
	            } else {
	                // Add the current pair to the set
	                pairSet.add(pairStr);
	            }
	        }

	        return symmetricPairs;
	    }
	}

