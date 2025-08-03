package String;

import java.util.Scanner;

public class rotations {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String pat=sc.nextLine();

        rotations(str,pat);
    }

    private static void rotations(String str, String pat) {

        String S=str+str;

        System.out.println(S.indexOf(pat));
       

    }
}
