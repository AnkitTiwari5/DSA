package Hashing;

import java.util.Arrays;

public class longestConsecutiveSubsequence {
    public static void main(String[] args) {
        
        int arr[]={2,9,4,3,10};

        Arrays.sort(arr);
        int res=1,curr=1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]+1) {
                curr++;
            }
            else if (arr[i]!=arr[i-1])
            {
                res=Math.max(curr, res);
                curr=1;
            }
        }
        System.out.println(res);
    }
}
