package Array;
public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        int low=0, high=arr.length-1;

        while (low<high) {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

      

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



          // int arr2[]=new int [arr.length];
        
        // int j= arr.length-1;
        // for (int i = 0; i <arr.length; i++) {
        //      arr2[i]=arr[j];
        //      j--;
        // }


    }
}
