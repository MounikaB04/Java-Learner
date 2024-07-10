//binary to octal
package in.assignment2;

public class assign10 {
	public static int toDec(long binary) {
		int decNum = 0, i = 0;
		while (binary > 0) {
			decNum += Math.pow(2, i++) * (binary % 10);
			binary /= 10;
		}
		return decNum;
	}

	public static int toOct(long binary) {
		int decNum = toDec(binary);
		String octStr = Integer.toOctalString(decNum);
		int octNum = Integer.parseInt(octStr);
		return octNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(toOct(100100));
	}

}
