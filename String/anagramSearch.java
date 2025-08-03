package String;

import java.util.Scanner;

public class anagramSearch {
    public static void main(String[] args) {
        
   
     Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String pat=sc.nextLine();
        int n=str.length();
        int m=pat.length();

        for (int i = 0; i < n-m; i++) {
            if (areAnagram(pat,str,i)) {
                System.out.println(true);
            }
        }

        
}

    private static boolean areAnagram(String pat, String str, int i) {
        int count []=new int[256];
        for (int j = 0; j < pat.length(); j++) {
            count[pat.charAt(j)]++;
            count[str.charAt(i+j)]--;
        }

        for (int j = 0; j < count.length; j++) {
            if (count[j]!=0) {
                return  false;
            }
        }
        return true;
    }

}