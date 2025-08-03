package Hashing;


import java.util.HashSet;

public class countDistinctElements {
    public static void main(String[] args) {
        int arr[]={10, 20, 20, 10, 30, 10};

        HashSet<Integer> hash=new HashSet<Integer>();

        for (int i: arr) {
            hash.add(i);
        }

        System.out.println(hash.size());
    }
}
