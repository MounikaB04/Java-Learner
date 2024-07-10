//Find the Smallest and largest element in an array
package in.assignment3;

public class assign3 {
	static int arr[] = { 10, 20, 30, 40 };

	public static int[] smallandlarge() {
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		int ans[] = new int[2];
		ans[0] = min;
		ans[1] = max;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans[] = smallandlarge();
		System.out.println("Maximum is:" + ans[1]);
		System.out.println("Minimum is:" + ans[0]);
	}

}
