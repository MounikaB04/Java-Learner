//find largest element in an array
package in.assignment3;

public class assign1 {
	static int arr[] = { 10, 324, 45, 90, 78 };

	public static int largest() {
		int i;
		int max = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(largest());
	}

}
