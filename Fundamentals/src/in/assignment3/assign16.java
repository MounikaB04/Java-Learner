//Finding Minimum scalar product of two vectors 
package in.assignment3;

import java.util.Arrays;
import java.util.Collections;

public class assign16 {
	    public static void main(String[] args) {
	        Integer[] vector1 = {1, 3, 5, 7};
	        Integer[] vector2 = {2, 4, 6, 8};

	        System.out.println("Minimum Scalar Product: " + minScalarProduct(vector1, vector2));
	    }

	    public static int minScalarProduct(Integer[] vector1, Integer[] vector2) {
	        Arrays.sort(vector1);
	        Arrays.sort(vector2, Collections.reverseOrder());

	        int scalarProduct = 0;
	        for (int i = 0; i < vector1.length; i++) {
	            scalarProduct += vector1[i] * vector2[i];
	        }

	        return scalarProduct;
	    }
	
}
