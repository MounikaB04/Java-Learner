//octal to binary
package in.assignment2;

public class assign11 {
	public static String converter(String octalValue) {
		int i = 0;
		String binaryValue = "";
		while (i < octalValue.length()) {
			char c = octalValue.charAt((int) i);
			switch (c) {
			case '0':
				binaryValue += "000";
				break;
			case '1':
				binaryValue += "001";
				break;
			case '2':
				binaryValue += "010";
				break;
			case '3':
				binaryValue += "011";
				break;
			case '4':
				binaryValue += "100";
				break;
			case '5':
				binaryValue += "101";
				break;
			case '6':
				binaryValue += "110";
				break;
			case '7':
				binaryValue += "111";
				break;
			default:
				System.out.print(octalValue.charAt((int)i));
				break;
			}
			i++;
		}
		return binaryValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String octalNumber = "4";
		String result = converter(octalNumber);
		System.out.println(result);
	}

}
