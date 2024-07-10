//Finding Circular rotation of an array by K positions
package in.assignment3;

import java.util.Arrays; 
public class assign25 {
	
	    public static void circularRotate(int[] arr, int k) {
	        int n = arr.length;
	        if (n == 0) {
	            return; 
	        }
	        k = k % n;
	        
	        reverse(arr, 0, n - 1); 
	        reverse(arr, 0, k - 1); 
	        reverse(arr, k, n - 1); 
	    }
	    
	    private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int k = 2;
	        System.out.println("Original array: " + Arrays.toString(arr));
	        circularRotate(arr, k);
	        System.out.println("Circular rotated array by " + k + " positions to the right: " + Arrays.toString(arr));
	    }
	}
