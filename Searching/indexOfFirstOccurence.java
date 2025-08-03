package Searching;

public class indexOfFirstOccurence {
    public static void main(String[] args) {
        
        int arr[]={1,3,4,4,4,5,8};
        int tar=4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar) {
                System.out.println(i);
                break;
            }
        }
    }
}
