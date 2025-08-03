package Searching;

public class twoPointerApproach {
    public static void main(String[] args) {
        int arr[]={2,5,8,12,30};
        int x=21;

        int i=0,j=arr.length-1;
        boolean flag=false;

        while (i<j) {
            if (arr[i]+arr[j]==x) 
                {System.out.println(true);
                    flag=true;
                break;
                }
            else if (arr[i] + arr[j] <x) 
                i++;
            else 
                j--;
        }
        if(!flag)
        System.out.println("not present");
    }
}
