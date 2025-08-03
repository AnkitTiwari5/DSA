package String;

public class subsequence {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="AD";


        int j=0;
        for (int i = 0; i < str1.length() && j<str2.length(); i++) {
            if (str1.charAt(i)==str2.charAt(j)) {
                j++;
            }
        }
        if (j==str2.length()) 
            System.out.println(true);

            else
            System.out.println(false);
    }
}
