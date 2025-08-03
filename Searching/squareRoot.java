package Searching;

public class squareRoot {
    public static void main(String[] args) {
        int x=10;
        int low=1,high=x,ans=-1;

        while (low<=high) {
            int mid=(low+high)/2;
            int msq=mid*mid;

            if (msq==x) {
                System.out.println(mid);
                break;
            }
            if (msq>x) 
            high=mid-1;

            else
            {
                low=mid+1;
                ans=mid;
            }
        }
        System.out.println(ans);
    }
}
