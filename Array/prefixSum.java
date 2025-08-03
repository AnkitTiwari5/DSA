package Array;

public class prefixSum {
    static int ps[];
    public static void main(String[] args) {
        int arr[]={2,8,3,9,6,5,4};

        int n=arr.length;
        ps=new int[n];

        ps[0]=arr[0];

        for (int i = 1; i < n; i++) {
            ps[i]=ps[i-1]+arr[i];
        }
        
        System.out.println(getSum(1,3));
        
    }

    private static int getSum( int l, int r) {
        if (l==0) 
            return ps[r];


            return ps[r] -ps[l-1];
    }
}



// System.out.println(getSum(arr,1,3));
//     }

//     private static int getSum(int arr[],int i, int j) {
        
//         int sum=0;
//         for(int a=i;a<=j;a++){
//             sum+=arr[a];
//         }
//         return sum; 