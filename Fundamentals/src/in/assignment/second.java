package in.assignment;

public class second {
	public static boolean isEven(int n) {
		boolean flag = false;
		if (n % 2 == 0 && n > 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isEven(-4);
	}

}
