package Searching;

public class triplet {
    public static void main(String[] args) {
        int arr[] = {2, 5, 10, 15, 18};
        int x = 33;

        for (int i = 0; i < arr.length - 2; i++) {
            if (isPair(arr, x - arr[i], i + 1)) {
                System.out.println(true);
                return; 
            }
        }
        System.out.println(false);
    }

    private static boolean isPair(int[] arr, int target, int si) {
        int i = si, j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}