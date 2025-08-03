package Array;
import java.util.Scanner;

public class arrayOperation1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];


        for (int i = 0; i < 4; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
   
        
        int x=3;
        int pos =2;


        for (int i = arr.length-1; i >pos; i--) {
            arr[i]=arr[i-1];
        }

        arr[pos]=x;


        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
