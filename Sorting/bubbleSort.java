package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        
        //int arr[]={7,1,5,2,3,14,10};
        int arr[]={7,10,5,2,3,0,14,1};
        int size=arr.length;
        int temp;

        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                
                if (arr[j]>arr[j+1]) {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
  for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
