package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class generateNumbers {
    public static void main(String[] args) {
        

        Queue<String> q=new ArrayDeque<>();
        q.add("5");
        q.add("6");

        for (int i = 0; i < 10; i++) {
            String curr=q.remove();

            System.out.print(curr + " ");
            q.add(curr + "5");
            q.add(curr+ "6");

          
        }

    }
}
