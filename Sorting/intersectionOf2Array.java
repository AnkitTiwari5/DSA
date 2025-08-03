package Sorting;

public class intersectionOf2Array {
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
            if (a[i]>b[j]) 
               j++;

             else if (a[i]<b[j]) 
               i++;

            else
           { System.out.print(a[i] + " ");
           i++;
           j++;
        }


    }
    }
}
