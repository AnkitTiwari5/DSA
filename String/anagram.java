package String;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="silent";
        String str2="listen";

        char ar1[]=str1.toCharArray();
        Arrays.sort(ar1);
        String s1=new String(ar1);

        char ar2[]=str2.toCharArray();
        Arrays.sort(ar2);
        String s2=new String(ar2);

        System.out.println(s1.equals(s2)?true:false);



    }
}
