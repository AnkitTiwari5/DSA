package Hashing;

import java.util.HashSet;

public class intersectionOf2Array {
    public static void main(String[] args) {
        int a[]={10,10,20,30,40,50};
        int b[]={40,40,20};

        HashSet <Integer> hash=new HashSet<>();

        for (int i = 0; i < b.length; i++) 
            hash.add(b[i]);
        
        for (int i = 0; i < a.length; i++) {
            if (hash.contains(a[i])) 
            System.out.print(a[i] + " ");
        }
    }
}
