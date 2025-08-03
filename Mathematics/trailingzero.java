package Mathematics;
import java.util.Scanner;

public class trailingzero {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();

        int r= recursion(num);

        System.out.println(r);

        int count=0;
        while  (r%10==0)
    {
            count++;
            r=r/10;
    
    }
        System.out.println(count);

    }

    private static int recursion(int num) {
        
        
        while (num>0) {
            return num * recursion(num -1);
        }
        return 1;
    }
}
