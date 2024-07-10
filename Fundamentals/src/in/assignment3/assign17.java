// Counting the number of even and odd elements in an array
package in.assignment3;

public class assign17 {

	public static int[] countEvenOdd(int[] array) {
		int countEven = 0;
		int countOdd = 0;

		for (int num : array) {
			if (num % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		return new int[] { countEven, countOdd };
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] result = countEvenOdd(array);
		System.out.println("Number of even elements: " + result[0]);
		System.out.println("Number of odd elements: " + result[1]);
	}

}
