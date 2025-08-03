package Hashing;
    
import java.util.HashMap;
import java.util.Arrays;

public class frequencyInEveryWindow {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        countDistinctInWindows(array, k);
    }

    public static void countDistinctInWindows(int[] arr, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Process the first window
        for (int i = 0; i < k; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Distinct count in first window: " + frequencyMap.size());

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove the outgoing element
            int outgoing = arr[i - k];
            if (frequencyMap.get(outgoing) == 1) {
                frequencyMap.remove(outgoing);
            } else {
                frequencyMap.put(outgoing, frequencyMap.get(outgoing) - 1);
            }

            // Add the incoming element
            int incoming = arr[i];
            frequencyMap.put(incoming, frequencyMap.getOrDefault(incoming, 0) + 1);

            System.out.println("Distinct count in window ending at index " + i + ": " + frequencyMap.size());
        }
    }
}
