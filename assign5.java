//hexadecimal to decimsl
package in.assignment2;

public class assign5 {
	public static int hexa(String hexVal) {
		int len = hexVal.length();
		int base = 1;
		int dec_value = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') {
				dec_value += (hexVal.charAt(i) - 48) * base;
				base = base * 16;
			} else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') {
				dec_value += (hexVal.charAt(i) - 55) * base;
				base = base * 16;
			}
		}
		return dec_value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hexNum = "1A";
		System.out.print(hexa(hexNum));

	}

}
