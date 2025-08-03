package Array;

public class maxAppearingElement {
    public static void main(String[] args) {
        int left[]={1,2,4};
        int right[]={4,5,7};
        int freq[]=new int[100];

        for (int i = 0; i < left.length; i++) {
            for (int j = left[i]; j <= right[i]; j++) {
                freq[j]+=1;
            }
        }
        int res=0;
        for (int i = 1; i < 100; i++) {
            if (freq[i]>freq[res]) {
                res=i;
            }
        }
        System.out.println(res);
    }
}
