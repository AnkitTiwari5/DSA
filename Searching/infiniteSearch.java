package Searching;

public class infiniteSearch {
    
    public static void main(String[] args) {
        int arr[]={1,10,15,20,40,60,80,100,200,500,1000};

        int x=100;
        if (arr[0]==x) 
        System.out.println(0);

        int i=1;
        while (arr[i]<x) {
            i=i*2;
            if (arr[i]==x) {
                System.out.println(i);
                break;
            }
        }

        int low=i/2+1,high=i-1;

        while (low<=high) {
            int mid=(low+high)/2;

            if (arr[mid]==x) 
           { System.out.println(mid);
            break;
           }

            else if (arr[mid]>x)
            high=mid-1;

            else
            low=mid+1;
        }
    }
}
