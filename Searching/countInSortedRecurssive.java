package Searching;

public class countInSortedRecurssive {
    public static void main(String[] args) {

    int arr[]={1,3,4,4,4,5,8};
    int tar=4;
    int low=0,high=arr.length-1;
    int n=arr.length;
    int first= recursiveSearch(arr,low,high,tar);

    if (first==-1) 
        System.out.println(" element not present");
    
        else
        System.out.println(lastOccur(arr,low,high,tar,n) -first +1);
    
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

private static int lastOccur(int[] arr, int low, int high, int tar,int n) {
        
    while (low<=high) {
        int mid=(low+high)/2;                
             
    if (arr[mid]>tar) 
    return lastOccur(arr, low, mid-1, tar,n);
     
     else if (arr[mid] < tar)
       return  lastOccur(arr, mid+1, high, tar,n);

       else
       {
       if (mid==n-1 || arr[mid+1]!=arr[mid]) {
        return mid;
       }
       else
       return lastOccur(arr, mid+1, high, tar,n);

    }
     }
     return -1;
}
}
