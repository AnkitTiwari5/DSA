package Searching;

public class searchInRotated {
    public static void main(String[] args) {
        int arr[]={10,20,40,60,5,8};

        int x=5;
        int n=arr.length;
        int low=0,high=n-1;

        while (low<=high) {
            
            int mid=(low+high)/2;
            if (arr[mid]==x)
            {System.out.println(mid);
            break;
        }
        if (arr[low]<=arr[mid]) {
            if (x>=arr[low] && x<arr[mid]) 
                high=mid-1;

            else
            low=mid+1; 
        }

        else
        {
            if (x>arr[mid] && x<=arr[high]) 
                low=mid+1;
                else
                high=mid-1;
            
        }
        }
    }
}
