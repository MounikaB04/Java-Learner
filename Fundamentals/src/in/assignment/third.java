package in.assignment;

public class third {
	public static int natural(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			sum+=i;
		}
		
		return sum;
	}
		public static void main(String[] args) {
			System.out.println(natural(3));

		}

}
