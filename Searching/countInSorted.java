package Searching;

public class countInSorted {
    public static void main(String[] args) {
        
        int arr[]={1,3,4,4,4,5,8};
        int tar=4;

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar) {
                count++;
            }
        }
        System.out.println(count);

    }
}
