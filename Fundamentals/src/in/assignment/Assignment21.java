//perfect number example 6 the divisor of 6 is 1,2,3 -> the sum of the divisor is 6 so 
//it a perfrct number
package in.assignment;

public class Assignment21 {
public static boolean isPerfect(int n) {
	int sum=1;
	for(int i=2;i*i<=n;i++) {
		if(n%i==0) {
			if(i*i!=n) {
				sum=sum+i+n/i;
				
			}else {
				sum=sum+i;
			}
		}
	}
	if(sum==n&&n!=1) {
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPerfect(6));
	}

}
