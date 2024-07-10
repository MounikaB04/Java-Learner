//Finding Non-Repeating elements in an Array
package in.assignment3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class assign14 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 3, 2, 1, 5, 6};
	        
	        Set<Integer> nonRepeatingElements = findNonRepeatingElements(arr);
	        System.out.println("Non-Repeating Elements: " + nonRepeatingElements);
	    }
	    
	    public static Set<Integer> findNonRepeatingElements(int[] arr) {
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        
	        // Count the frequency of each element
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }
	        
	        // Collect non-repeating elements
	        Set<Integer> nonRepeatingElements = new HashSet<>();
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                nonRepeatingElements.add(entry.getKey());
	            }
	        }
	        
	        return nonRepeatingElements;
	    }
	}

