package Mathematics;
public class primeNo {
    public static void main(String[] args) {
        

        int num=7;
        int flag=0;

        for (int i = 2; i < num; i++) {
            if (num%i==0) {
               flag++;
            }           
        }

        if (flag>1) 
        System.out.println("not prime");
        else 
        System.out.println("prime");
    }
}
