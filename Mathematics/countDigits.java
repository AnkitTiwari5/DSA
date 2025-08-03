package Mathematics;
import java.util.Scanner;

public class countDigits {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

       int x= sc.nextInt();
        System.out.println(x);

        System.out.println(count(x));
    }

    private static int count(int x) {
        int res=0;
        while(x>0)
        {
            x=x/10;
            res++;
        }
        
        
        return res;

    }
}