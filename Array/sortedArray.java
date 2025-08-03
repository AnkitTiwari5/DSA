package Array;
public class sortedArray {
    public static void main(String[] args) {
        
        int arr[]={1,2,14,9,10};

        boolean flag=true;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]) {
                flag=false;
                break;
            }
        }
        System.out.println(flag?true:false);
    }
    
}
