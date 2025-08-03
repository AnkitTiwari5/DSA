package Searching;

import java.util.Scanner;

public class binarySearch {
     public static void main(String[] args) {

        int arr[]=new int[6];
        Scanner ck=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) 
                    arr[i]=ck.nextInt();
                    
        int tar=ck.nextInt();

        int flag=0;
        int low=0,high=arr.length-1, mid=0;

        while (low<=high) {
            mid=(low+high)/2;

            if (arr[mid]==tar) 
                {System.out.println(mid);
                    flag=1;
                    break;
                }


                else if (arr[mid]>tar) 
                    high=mid -1;
        
            else
            low= mid+1;
            
        }



    if (flag==0) {
        System.out.println("-1");
    }
}
}
