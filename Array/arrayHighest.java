package Array;
public class arrayHighest {
    public static void main(String[] args) {
        
        int arr[]={4,8,9,2,10};

        int high=0;
        for (int i = 1; i < arr.length; i++) {
                
                if (arr[i]>high) {
                    high=i;
                }
        }
        
        System.out.println("highest : " +  arr[high]);
        
    }
}
