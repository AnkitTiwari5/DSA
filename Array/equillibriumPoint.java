package Array;

public class equillibriumPoint {
    public static void main(String[] args) {
        
        int arr[]={3,4,8,-9,9,7};
        int n=arr.length;

        
        for (int i = 0; i < n; i++) {
            int ls=0,rs=0;
            for (int j = 0; j < i; j++) 
                ls=ls+arr[j];

            for (int k = i+1; k < n; k++) 
                rs=rs+arr[k];
            
            
            if (ls==rs) 
                System.out.println(true);
        }
       
    }
}
