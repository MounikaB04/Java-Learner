//Sorting elements of an array by frequency 
package in.assignment3;

import java.util.*;

public class assign10 {
    public static void frequency(int arr[], int n) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {

                int freqCompare = e2.getValue().compareTo(e1.getValue()); 
                return (freqCompare == 0) ? e1.getKey().compareTo(e2.getKey()) : freqCompare;
            }
        });
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int key = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i <freq; i++) {
                System.out.print(key + " ");
            }
            System.out.println("[" + freq + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 20, 30, 40, 40 };
        int n = arr.length;
        frequency(arr, n);
    }
}
