package Searching;

import java.util.Scanner;

public class recursiveBinary {
    
     public static void main(String[] args) {

        int arr[]=new int[6];
        Scanner ck=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) 
                    arr[i]=ck.nextInt();
                    
        int tar=ck.nextInt();

        int low=0,high=arr.length-1;
        
       System.out.println(recursiveBinary(arr,low,high,tar));
}

     private static int recursiveBinary(int[] arr, int low, int high, int tar) {
        

        while (low<=high) {
           int mid=(low+high)/2;

            if (arr[mid]==tar) 
                return mid;
                
                
                else if (arr[mid]>tar) 
                   return recursiveBinary(arr, low, mid-1, tar);
        
            else
          return  recursiveBinary(arr, mid+1, high, tar);

        }
        return -1;
     }
}
