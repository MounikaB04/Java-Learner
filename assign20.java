//calculate the number of digits in a integer
package in.assignment2;

public class assign20 {
public static int countDigit(long n)
{
    int count = 0;
    while (n != 0) {
        n = n / 10;
        ++count;
    }
    return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 345289467;
        System.out.print("Number of digits : "
                         + countDigit(n));

	}

}
