//Removing Duplicate elements from an array 
package in.assignment3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class assign15 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 3, 2, 1, 5, 6};
	        
	        int[] uniqueArr = removeDuplicates(arr);
	        
	        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArr));
	    }
	    
	    public static int[] removeDuplicates(int[] arr) {
	        // Use a HashSet to store unique elements
	        Set<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }
	        
	        // Convert HashSet back to array
	        int[] uniqueArr = new int[set.size()];
	        int index = 0;
	        for (int num : set) {
	            uniqueArr[index++] = num;
	        }
	        
	        return uniqueArr;
	    }
	}

