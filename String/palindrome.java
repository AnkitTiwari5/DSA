package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        System.out.println(str);

        String rev="";

        for (int i = str.length()-1; i >=0 ; i--) {
            rev+=str.charAt(i);
        }
        System.out.println(rev.equals(str)?true:false);
    }
}
