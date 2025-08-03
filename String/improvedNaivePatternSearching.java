package String;

import java.util.Scanner;

public class improvedNaivePatternSearching {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String pat=sc.nextLine();

        patternSearching(str,pat);
    }

private static void patternSearching(String str, String pat) {
    int m=str.length();
    int n=pat.length();


    for (int i = 0; i <= m-n; ) {
        int j;
        for (j = 0; j < n; j++) {
           if (pat.charAt(j)!=str.charAt(i+j)) 
            break;
        }
        if (j==n) 
            System.out.println(i);
            if (j==0) 
            i++;

            else
            i=i+j;
    } 
}
}
