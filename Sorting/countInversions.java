package Sorting;

public class countInversions {
    public static void main(String[] args) {
        int a[]={2,4,1,3,5};
        int n=a.length;

        int res=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i]>a[j]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
