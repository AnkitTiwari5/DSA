package Hashing;

public class longestSubarraywithEqual01 {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,0};
        int sum=0;
        int res=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) 
                arr[i]=-1;
        }

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
