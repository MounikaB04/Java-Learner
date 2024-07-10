//Find Smallest Element in an Array
package in.assignment3;

public class assign2 {
static int arr[]= {10,20,30,40};
public static int smallest() {
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(smallest());
	}

}
