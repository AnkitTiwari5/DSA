package Mathematics;
public class factorial {
    public static void main(String[] args) {
        

        System.out.println(fact(5));
    }

    private static int fact(int i) {
       


        if (i>0) 
            return i * fact(i-1);
        
            return 1;
        
        // int x=1;
        // for (int j = i; j >0; j--) {
        //     x=x*j;
        // }
    }
}
