//Friendly pair 28= divisors are 1,2,4,7,14 sum of divisors=28
package in.assignment;

public class Assignment25 {
public static int sumOfFactors(int n ) {
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0)
			sum+=i;
	}
	return sum;
}

	public static void main(String[] args) {
		int n1=6;
		int n2=28;
		int sum1=sumOfFactors(n1);
		int sum2=sumOfFactors(n2);
		if(sum1/n1==sum2/n2) {
			System.out.println(n1+" and "+n2 +" are the friendly pair");
		}else {
			System.out.println(n1+" and "+n2 +" are not the friendly pair");
		}
	}

}
