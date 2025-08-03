package Hashing;

import java.util.HashMap;
import java.util.Map;

public class nkOccurence {
    public static void main(String[] args) {
        int arr[]={10,20,30,10,10,20};
        int n=arr.length;
        int k=2;

        HashMap <Integer,Integer> hashMap=new HashMap<>();

        for(int i:arr)
        hashMap.put(i, hashMap.getOrDefault(i, 0) +1);



        for (Map.Entry<Integer,Integer> e:hashMap.entrySet() )
        {
            if (e.getValue() >=n/k) {
                System.out.println(e.getKey() + " ");
            }
        }
    }
}
