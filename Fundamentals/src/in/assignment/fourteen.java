package in.assignment;

public class fourteen {
	public static boolean armstrong(int n) {
		int digit=0;
		int result=0;
		int originalNumber= n;
		//no.of digits cal
		while(originalNumber!=0) {
			originalNumber/=10;
			++digit;
		}
		originalNumber= n;
		// sum of nth power of its digits
		while(originalNumber!=0) {
			int rem = originalNumber%10;
			result+= Math.pow(rem,digit);
			originalNumber/=10;
		}
		if(result==n) {
			return true;
		}
	return false;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int low=999, high=99999;
	for(int num=low+1;num<high;++num) {
		if(armstrong(num))
			System.out.println(num+"");
	}
		}

}
