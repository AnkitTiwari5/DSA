package Hashing;

import java.util.HashMap;

public class longestSubarrayWithSum {
    public static void main(String[] args) {
        int arr[]={5,2,3};
        int pre_sum=0;
        int res=0;
        int sum=5;

        HashMap <Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            pre_sum+=arr[i];
            if (pre_sum==sum) {
                res=i+1;
            }
            if (hashMap.containsKey(pre_sum)==false)
            {
                hashMap.put(pre_sum, i);
            }
            if (hashMap.containsKey(pre_sum-sum)) {
                res=Math.max(res, i-hashMap.get(pre_sum-sum));
            }
        }
        System.out.println(res);
    }
}
