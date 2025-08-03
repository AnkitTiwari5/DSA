package Searching;

public class repeatingElements {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,2,3,4,5};

        int n=arr.length-1;

        int isVisited[]=new int[n];

        for (int i = 0; i < n; i++) {
            if (isVisited[arr[i]]==1) 
              {  System.out.println(arr[i]);
                break;
              }

                else
                isVisited[arr[i]]=1;
            
        }
    }
}
