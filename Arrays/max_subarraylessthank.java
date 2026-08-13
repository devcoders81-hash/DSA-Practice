package Arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class max_subarraylessthank {
    public static void main(String[] args) {
        int[] arr={1,5,2};
        int n = arr.length;

        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();

        long count = 0;
        int left = 0;
        int k=6;
        for (int right = 0; right < n; right++) {

            // Maintain increasing deque for minimum
            while (!minDeque.isEmpty()
                    && arr[minDeque.peekLast()] >= arr[right]) {

                minDeque.pollLast();
            }

            minDeque.addLast(right);

            // Maintain decreasing deque for maximum
            while (!maxDeque.isEmpty()
                    && arr[maxDeque.peekLast()] <= arr[right]) {

                maxDeque.pollLast();
            }

            maxDeque.addLast(right);

            // Shrink window while invalid
            while (true) {

                long min = arr[minDeque.peekFirst()];
                long max = arr[maxDeque.peekFirst()];
                long length = right - left + 1;

                long cost = (max - min) * length;

                if (cost <= k) {
                    break;
                }

                // Remove left element from min deque
                if (minDeque.peekFirst() == left) {
                    minDeque.pollFirst();
                }

                // Remove left element from max deque
                if (maxDeque.peekFirst() == left) {
                    maxDeque.pollFirst();
                }

                left++;
            }

            // Every subarray ending at right
            // and starting from left to right is valid.
            count += right - left + 1;
        }

        System.out.println(count);
    }
}
