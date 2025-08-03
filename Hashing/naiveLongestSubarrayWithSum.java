package Hashing;

public class naiveLongestSubarrayWithSum {
    public static void main(String[] args) {
        int arr[]={5,2,3,4};
        int sum=5;
        int res=0;

        for (int i = 0; i < arr.length; i++) {
            int curr_sum=0;
            for (int j = i; j < arr.length; j++) {
                curr_sum+=arr[j];
                if (curr_sum==sum) {
                    res=Math.max(j-i+1, res);
                }
            }
            
        }
        System.out.println(res);
    }
}
