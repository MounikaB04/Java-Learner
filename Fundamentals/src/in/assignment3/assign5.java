//Calculate the sum of elements in an array 
package in.assignment3;

public class assign5 {
	static int arr[] = { 10, 20, 30, 40 };

	public static int getSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum());
	}

}
