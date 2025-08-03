package Array;
import java.util.Scanner;

public class arrayDeletion {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];


        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int num =1;
        int pos=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num) {
                pos=i;
                break;
            }
        }
        System.out.println(pos);

        for (int i = pos; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }

        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
