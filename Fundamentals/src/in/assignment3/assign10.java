//Sorting elements of an array by frequency 
package in.assignment3;

import java.util.*;

public class assign10 {

    // Method to get frequencies of elements and print sorted elements by frequency
    public static void frequency(int arr[], int n) {
        // Step 1: Create a HashMap to store frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
        }

        // Step 2: Convert HashMap to a List of Map entries
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(freqMap.entrySet());

        // Step 3: Sort the list based on custom comparator (by frequency descending)
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                // Compare by frequency, if frequencies are equal, compare by key
                int freqCompare = e2.getValue().compareTo(e1.getValue()); // descending order
                return (freqCompare == 0) ? e1.getKey().compareTo(e2.getKey()) : freqCompare;
            }
        });

        // Step 4: Print elements based on sorted frequency and their frequencies
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int key = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i <freq; i++) {
                System.out.print(key + " ");
            }
            System.out.println("[" + freq + "] "); // Print frequency value after elements
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 20, 30, 40, 40 };
        int n = arr.length;
        frequency(arr, n);
    }
}
