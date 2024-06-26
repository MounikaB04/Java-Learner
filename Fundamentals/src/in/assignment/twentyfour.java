package in.assignment;

public class twentyfour {
	public static boolean isAbundantNumber(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;;
			}
		}
		if(sum>n) {
			return true;
		}else {
			return false;
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	System.out.println(isAbundantNumber(12));
		}

}
