package Searching;

public class count1s {
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,1,1,1,1,1};

        int low=0,high=arr.length-1;
        int n=arr.length;
        int res=0;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==0) 
                low=mid+1;

        else
        {
            if (mid==0 || arr[mid-1]==0) 
              {  res=n-mid;
                break;
              }
                else
                high=mid-1;
        }
            
        }
        System.out.println(res);
    }
}
