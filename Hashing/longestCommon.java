package Hashing;

public class longestCommon {
    
    public static void main(String[] args) {
        int a[]={0,1,0,0,0,0};
        int b[]={1,0,1,0,0,1};
        int res=0;

        for (int i = 0; i < a.length; i++) {
            int sum1=0;
            int sum2=0;
            for (int j = i; j < a.length; j++) {
                sum1+=a[j];
                sum2+=b[j];
                if (sum1==sum2) {
                    res=Math.max(j-i+1, res);
                }
            }
            
        }
        System.out.println(res);
    }
}
