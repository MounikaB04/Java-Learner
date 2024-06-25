//check whether or not the year is a leap year in java
package in.assignment;

public class Assignment7 {
	public static void isLeap(int year) {
		if (year % 4 == 0 || year % 400 == 0) {
			System.out.println(year + "is a leap year");
		} else{
			System.out.println(year + "is not a leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isLeap(2024);
	}

}
