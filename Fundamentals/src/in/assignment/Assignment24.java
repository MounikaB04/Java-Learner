//abundant number a number that is smaller than the sum of its proper divisors 12 =>divisors 1,2,3,4,6=16
//so 12 is smaller than 16 
package in.assignment;

public class Assignment24 {
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
