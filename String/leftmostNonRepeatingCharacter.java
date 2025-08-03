package String;

public class leftmostNonRepeatingCharacter {
    public static void main(String[] args) {
    
        String str="geekkssg";

        int count []=new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) -'a']++;
        }

        boolean found=false;
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)-'a']==1) 
              {  System.out.println(i);
                found=true;
                break;
              }
            }
            if (!found) 
                System.out.println("no non repeating character found");
    }
}
