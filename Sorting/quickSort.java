package Sorting;

public class quickSort {
    public static void main(String[] args) {

        int num[] = { 2, 1, 5, 3, 10 };

        System.out.println("before sorting");
        for (int a : num)
            System.out.print(a + " ");
        System.out.println();

        quick(num, 0, num.length - 1);

        System.out.println("after sorting");
        for (int a : num)
            System.out.print(a + " ");

    }

    private static void quick(int[] num, int low, int high) {

        if (low < high) {
            int pi = partition(num, low, high);
            quick(num, low, pi - 1);
            quick(num, pi + 1, high);
        }
    }

    private static int partition(int[] num, int low, int high) {
        int pivot = num[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (num[j] < pivot) {
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;

            }
        }

        int temp = num[i + 1];
        num[i + 1] = num[high];
        num[high] = temp;
        return i + 1;

    }
}
