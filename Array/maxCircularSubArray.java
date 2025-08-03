package Array;

public class maxCircularSubArray {
    public static void main(String[] args) {
        
    int arr[]={5,-2,3,4};

    int n=arr.length;
    int res=arr[0];

    for (int i = 0; i < n; i++) {
        int curr_sum=arr[i];
    int curr_max=arr[i];
        for (int j = 1; j < n; j++) {
            int index =(i+j) %n;
            curr_sum+=arr[index];
            curr_max=Math.max(curr_sum, curr_max);
        }
        res=Math.max(curr_max, res);
    }
    System.out.println(res);
    }
}
