package Sorting;

public class unionOf2Array {
   public static void main(String[] args) {
        int a[]={1,10,10,15,15,15,40,70};
        int b[]={10,10,15,40,40};

        int m=a.length;
        int n=b.length;

        int i=0,j=0;

        while (i<m && j<n) {
            
            if (i>0 && a[i-1]==a[i]) 
               { i++;
                continue;
               }
            if (j>0 && b[j-1]==b[j]) 
               { j++;
                continue;
               }

            if (a[i]<b[j]) 
             {  System.out.print(a[i] + " ");
                i++;
             } 

             else if (a[i]>b[j]) 
              {  System.out.print(b[j] + " ");
                 j++;
              }

            else
           { System.out.print(a[i] + " ");
           i++;
           j++;

        }


    }

    while (i<m) {
        if (i==0 || a[i]!=a[i-1]) {
           System.out.print(a[i] + " ");
           i++; 
        }
    }

    while (j<n) {
        if (j==0 || b[j]!=b[j-1]) {
           System.out.print(b[j] + " ");
           j++; 
        }
    }
}
}