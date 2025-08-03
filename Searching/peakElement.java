package Searching;

public class peakElement {
    public static void main(String[] args) {
                int arr[]={1,12,13,15,19,8,7};
              // int arr[]={5,10,200,40,30,20,0};
                int size=arr.length;
                int low=0;
                int high=size-1;
                int mid=0;
        
                while(low<high)
                {
                    mid=(low+high)/2;
        
                    if(arr[mid]>arr[mid+1])
                        high=mid;

                    else
                        low=mid+1;
                            
                }
                System.out.println(low);
        
               
        
        
            }
            
        }
        
