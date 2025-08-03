package Hashing;

import java.util.HashSet;

public class unionOf2Array {
    public static void main(String[] args) {
        
        int a[]={10,10,20,20,20,30,60};
        int b[]={10,60};

        HashSet<Integer> hash =new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) 
            hash.add(a[i]);

          for (int i = 0; i < b.length; i++) 
            hash.add(b[i]);

        System.out.println(hash.size());
    }
}
