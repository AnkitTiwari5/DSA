package Searching;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        int arr[]=new int[6];
        Scanner ck=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) 
                    arr[i]=ck.nextInt();
                    
        int tar=ck.nextInt();

        int flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==tar) 
             {   System.out.println(i);
                flag=1;
        }

       
    }
    if (flag==0) {
        System.out.println("-1");
    }
}
}
