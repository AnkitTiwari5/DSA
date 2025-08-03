package Array;

import java.util.Scanner;

public class leftRotateArray {
    public static void main(String[] args) {
        Scanner ck=new Scanner(System.in);
        int arr[]=new int [5];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=ck.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();


        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}
