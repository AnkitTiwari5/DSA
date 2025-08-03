package Hashing;

import java.util.HashSet;

public class pairWithGivenSum {
    public static void main(String[] args) {
        
        int arr[]={4,5,9,15,6};
        int sum=20;

        HashSet <Integer> hash = new HashSet<Integer>();

        Boolean flag=false;
        for(int i:arr)
        {
            if (hash.contains(sum-i)) 
             {
                   System.out.println(true);
                   flag=true;
                   break;
             }         
        else
        hash.add(i);      
      }
      if (!flag) 
      System.out.println("not found");

    }
}
