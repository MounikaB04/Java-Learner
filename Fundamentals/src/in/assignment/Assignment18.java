//power of a number
package in.assignment;

public class Assignment18 {
public static int power(int n,int p) {
	if(p==0) {
		return 1;
	}
	else
		return n* power(n,p-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(2,3));
	}

}
