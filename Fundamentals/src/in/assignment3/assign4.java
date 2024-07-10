//4.	Find Second Smallest Element in an Array
package in.assignment3;

public class assign4 {
	static int arr[] = { 10, 20, 30, 40 };

	public static void secondSmall() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <min) {
				min = arr[i];
			}
		}
		System.out.println("smallest value"+ min);
		int min1=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min1&&arr[i]>min) {
				min1=arr[i];
			}
		}
		System.out.println("second smallest:"+ min1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondSmall();
	}

}
