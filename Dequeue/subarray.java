package Dequeue;
import java.util.*;

public class subarray {
    public static void maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        int n=nums.length;
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) {
                dq.removeLast();
    }
    dq.addLast(i);
}


for (int i = k; i < n; i++) {
    System.out.print(nums[dq.peek()] + " ");

    while (!dq.isEmpty() && dq.peek()<=i-k) {
        dq.removeFirst();
    }
while (!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) {
        dq.removeLast();
    }

    dq.addLast(i);

}
System.out.print(nums[dq.peek()] + " ");
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
       maxSlidingWindow(arr, k); 
    }
}
