package in.assignment;

public class twelve {
	public static int palindrome(int n, int rev) {
		if (n < 10) {
			return rev * 10 + n;
		} else {
			int rem = n % 10;
			rev = rev * 10+ rem;
			return palindrome(n/10, rev);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int rev = palindrome(n, 0);
		System.out.println("Reverse of n "+ rev);
		if (n == rev) {
			System.out.println(n + " is palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}
	}


}
