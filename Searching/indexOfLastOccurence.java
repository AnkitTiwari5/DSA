package Searching;

public class indexOfLastOccurence {
    public static void main(String[] args) {
        int arr[]={1,3,4,4,4,5,8};
        int tar=4;

        for (int i = arr.length-1; i >0; i--) {
            if (arr[i]==tar) {
                System.out.println(i);
                break;
            }
        }
    }
}
