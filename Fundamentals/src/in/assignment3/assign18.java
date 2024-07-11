// Find all Symmetric pairs in an array
package in.assignment3;

import java.util.HashSet;
import java.util.Set;

public class assign18 {
	    public static void main(String[] args) {
	        int[][] pairs = {
	            {1, 2},
	            {3, 4},
	            {5, 9},
	            {2, 1},
	            {4, 3},
	            {9, 5},
	            {7, 8}
	        };
	        Set<String> symmetricPairs = findSymmetricPairs(pairs);
	        for (String pair : symmetricPairs) {
	            System.out.println(pair);
	        }
	    }

	    public static Set<String> findSymmetricPairs(int[][] pairs) {
	        Set<String> pairSet = new HashSet<>();
	        Set<String> symmetricPairs = new HashSet<>();
	        for (int[] pair : pairs) {
	            int first = pair[0];
	            int second = pair[1];
	            String pairStr = first + "," + second;
	            String symmetricPairStr = second + "," + first;
	            if (pairSet.contains(symmetricPairStr)) {
	                symmetricPairs.add("(" + second + ", " + first + ")");
	            } else {
	                pairSet.add(pairStr);
	            }
	        }

	        return symmetricPairs;
	    }
	}

