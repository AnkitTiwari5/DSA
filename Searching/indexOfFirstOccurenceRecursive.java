package Searching;

public class indexOfFirstOccurenceRecursive {
    public static void main(String[] args) {
        
        int arr[]={1,3,4,4,4,5,8};
        int tar=4;
        int low=0,high=arr.length-1;
        System.out.println(recursiveSearch(arr,low,high,tar));
        
    }

    private static int recursiveSearch(int[] arr, int low, int high, int tar) {
        
        while (low<=high) {
            int mid=(low+high)/2;                
                 
        if (arr[mid]>tar) 
        return recursiveSearch(arr, low, mid-1, tar);
         
         else if (arr[mid] < tar)
           return  recursiveSearch(arr, mid+1, high, tar);

           else
           {
           if (mid==0 || arr[mid-1]!=arr[mid]) {
            return mid;
           }
           else
           return recursiveSearch(arr, low, mid-1, tar);
 
        }
         }
         return -1;
    }
}
