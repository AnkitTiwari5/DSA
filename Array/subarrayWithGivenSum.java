package Array;

public class subarrayWithGivenSum {
    public static void main(String[] args) {
        
        int arr[]={4,8,12,5};
        int sum=17;
        int curr=0,s=0;

        for (int e = 0; e < arr.length; e++) {
            curr+=arr[e];

            while (sum<curr) {
                curr-=arr[s];
                s++;
                
            }
            if (curr==sum) {
                System.out.println(true);
            }
        }


    }
}
