package Hashing;

import java.util.HashSet;

public class subarrayWith0sum {
      public static void main(String[] args) {
        
        int arr[]={-3,4,-3,-1,1};
        

        HashSet <Integer> hash = new HashSet<Integer>();

        
        int sum =0;
        Boolean flag=false;
        for(int i:arr)
        {
            sum+=i;
            if (hash.contains(sum) || sum==0) 
             {
                   System.out.println(true);
                  return;
             }   
             
           
        
        hash.add(sum);      
      }
      if (!false) 
      System.out.println("not found");

    }
}
