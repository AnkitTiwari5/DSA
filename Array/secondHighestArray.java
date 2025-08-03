package Array;
public class secondHighestArray {
    public static void main(String[] args) {
        

        int arr[]={1,4,3,6,9,2};
        int secondhigh=-1;
        int largest=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>arr[largest]) {
                secondhigh=largest;
                largest=i;
            } else if (arr[i]!=arr[largest]) {
                   
                    if (secondhigh==-1 || arr[i]>arr[secondhigh]) {
                        secondhigh=i;
                    
                }
            }
        }
        
        System.out.println(arr[secondhigh]);
    }
}
