//factoril of a number
package in.assignment;

public class Assignment17 {
public static int fact(int n) {
	if(n==1) {
		return 1;
	}
	else {
		return (n*fact(n-1));
	}
}
	public static void main(String[] args) {
		System.out.println(fact(4));
	}

}
