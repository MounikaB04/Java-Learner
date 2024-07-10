//Find maximum product sub-array in a given array
package in.assignment3;

public class assign19 {
	    public static int maxProductSubarray(int[] num) {
	        if (num == null || num.length == 0) {
	            return 0;
	        }

	        int maxProduct = num[0];
	        int minProduct = num[0];
	        int result = num[0];

	        for (int i = 1; i < num.length; i++) {
	            int tempMax = maxProduct;

	            maxProduct = Math.max(Math.max(maxProduct * num[i], minProduct * num[i]), num[i]);
	            minProduct = Math.min(Math.min(tempMax * num[i], minProduct * num[i]), num[i]);

	            result = Math.max(result, maxProduct);
	        }

	        return result;
	    }
	    public static void main(String[] args) {
	        int[] array = {2, 3, -2, 4, -1};
	        int maxProduct = maxProductSubarray(array);
	        System.out.println("Maximum Product Sub-array: " + maxProduct);
	    }
	}
