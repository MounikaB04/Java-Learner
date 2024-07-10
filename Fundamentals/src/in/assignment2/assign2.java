//lcm of 2 numbers =>lcm(u,v)=(u*v)/gcd(u,v)
package in.assignment2;

public class assign2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15, b = 25;
		int ans = (a > b) ? a : b;
		while (true) {
			if (ans % a == 0 && ans % b == 0)
				break;
			ans++;
		}
		System.out.print("LCM of" + a + "and" + b + ":" + ans);
	}

}
