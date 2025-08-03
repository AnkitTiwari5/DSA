package Mathematics;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

       // System.out.print(x);

        System.out.print(isPalindrome(x));
    }

    private static boolean isPalindrome(int x) {
        int rev=x;

        int b=0;
        while (x>0) {
            int a=x%10;
             b=b*10+a ;
            x=x/10;

        }


        return rev==b;

    }
}
