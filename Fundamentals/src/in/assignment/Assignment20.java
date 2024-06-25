//strong number(sum of factorial of digit is equal to number itself)
//n=145 = 1!+4!+5!=145
package in.assignment;

public class Assignment20 {
	static int f[] = new int[10];
public static void preCompute() {
	f[0]=f[1]=1;
	for(int i=2;i<10;i++)
		f[i] =f[i-1]*i;
}
public static boolean isStrong(int x) {
	int Sum =0;
	int temp=x;
	while(temp>0) {
		Sum+=f[temp%10];
		temp/=10;
	}
	return (Sum==x);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
preCompute();
int x=145;
if(isStrong(x)) {
	System.out.println("yes");
	
}
else {
	System.out.println("No");
}
	}

}
