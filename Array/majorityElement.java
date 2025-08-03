package Array;

public class majorityElement {
    public static void main(String[] args) {
        
        int arr[]={8,7,6,8,6,6,6,6};

        int i=0;
        int n=arr.length;
        for ( i = 0; i < n; i++) {
           int count=1;
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]) {
                    count++;
                }
            }  
        
        if (count>n/2) {
            System.out.println(arr[i]);

        }
    }
    }
}
