package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
     public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();

        Stack<Integer>s=new Stack<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(5);

        for (Integer integer : q) {
            System.out.print (integer + " ");
        }

        System.out.println();
        
        while (!q.isEmpty()) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
           q.offer(s.pop());
        }

        for (Integer integer : q) {
            System.out.print(integer + " ");
        }

    }
}
