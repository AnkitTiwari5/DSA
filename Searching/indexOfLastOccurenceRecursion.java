package Searching;

public class indexOfLastOccurenceRecursion {
    public static void main(String[] args) {
        
        int arr[]={1,3,4,4,4,5,8};
        int tar=4;
        int low=0,high=arr.length-1;
        int n=arr.length;
        
        System.out.println(recursiveSearch(arr,low,high,tar,n));
        
    }

    private static int recursiveSearch(int[] arr, int low, int high, int tar,int n) {
        
        while (low<=high) {
            int mid=(low+high)/2;                
                 
        if (arr[mid]>tar) 
        return recursiveSearch(arr, low, mid-1, tar,n);
         
         else if (arr[mid] < tar)
           return  recursiveSearch(arr, mid+1, high, tar,n);

           else
           {
           if (mid==n-1 || arr[mid+1]!=arr[mid]) {
            return mid;
           }
           else
           return recursiveSearch(arr, mid+1, high, tar,n);
 
        }
         }
         return -1;
    }
}
