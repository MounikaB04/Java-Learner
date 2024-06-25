//find the greatest of the three number in java
package in.assignment;

public class Assignment6 {
	public static void greatest(int x, int y, int z) {
		if (x > y && x > z) {
			System.out.println(x + " is the greatest among 3 numbers");
		} else if (y > z && y > x) {
			System.out.println(y + " is the greatest among 3 numbers");
		} else {
			System.out.println(z + " is the greatest among 3 numbers");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greatest(5, 6, 9);
	}

}
