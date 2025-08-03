package String;

import java.util.Scanner;

public class reverseWordsInString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();

        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        
        String rev="";

        String [] words=str.split(" ");

        for (int i = words.length-1; i >=0; i--) {
            rev+=words[i]+ " ";
        }
        return rev.trim();

    }
}
