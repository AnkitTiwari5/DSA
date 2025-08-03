package Array;
import java.util.Scanner;

public class leaderInArray {
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

        
        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            for (int k = i+1; k < arr.length; k++) {
            if (arr[i]<=arr[k]) {
                flag=false;
                break;
            }
            
        }
        if (flag==true) {
            System.out.println(arr[i]);
        }

    }

    }
}
