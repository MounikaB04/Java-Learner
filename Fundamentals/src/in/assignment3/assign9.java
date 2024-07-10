//Finding the frequency of elements in an array 
package in.assignment3;

import java.util.HashMap;
import java.util.Map;

public class assign9 {
	public static void frequency(int arr[], int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 10, 20, 30, 40, 40 };
		int n = arr.length;
		frequency(arr, n);
	}

}
