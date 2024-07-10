//maximum number of handshakes in java
package in.assignment2;

public class assign14 {
	public static int maxHandshake(int n)

	{

		return (n * (n - 1)) / 2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;

		System.out.println(maxHandshake(n));

	}

}
