package Sorting;

public class selectionSort {
    public static void main(String[] args) {
           int arr[]={7,1,5,2,3,14,10};
        int size=arr.length;
        int temp;

        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex=j;
                }
               
            }
                    temp=arr[minIndex];
                    arr[minIndex]=arr[i];
                    arr[i]=temp;
        }
  for (int i:arr) {
            System.out.print(i + " ");
        }
    }
    }

