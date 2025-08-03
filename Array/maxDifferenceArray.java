package Array;
public class maxDifferenceArray {
    public static void main(String[] args) {
        
        int arr[]={2,3,10,6,4,8,1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        int res=arr[1] - arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                    //res=Math.max(res,arr[j]-arr[i]);
        
                    if (arr[j]-arr[i]> res) {
                        res=arr[j]-arr[i];
                    }
            }
        }
        System.out.println(res);
    }
}
