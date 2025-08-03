package Hashing;

import java.util.HashMap;

public class frequenciesOfArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 30, 10};

        for (int i = 0; i < arr.length; i++) {
            int count = 1; 
            boolean isDistinct = true;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i] == arr[k]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }

}


        // HashMap <Integer,Integer> hashMap=new HashMap<Integer,Integer>();

        // for (int i = 0; i < arr.length; i++) {
            
        //     hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
        // }
    
        //     System.out.println(hashMap.keySet() + ":"+hashMap.values( ));
        


    