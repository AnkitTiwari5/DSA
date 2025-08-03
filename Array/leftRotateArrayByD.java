package Array;
import java.util.Scanner;

public class leftRotateArrayByD {
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

        int d=2;
        int n=arr.length;

        int temp[] =new int[d];

        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }
        
        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[n-d+i]=temp[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
      
    }
}
