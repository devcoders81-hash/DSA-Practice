package Arrays;

public class minswaps {
    public int minSwaps(int[] arr) {

        // Step 1: Count total number of 1s
        int totalOnes = 0;

        for (int num : arr) {
            if (num == 1) {
                totalOnes++;
            }
        }

        // No 1s present
        if (totalOnes == 0) {
            return -1;
        }

        // Step 2: Find number of zeros in first window
        int zeroCount = 0;

        for (int i = 0; i < totalOnes; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        int minSwaps = zeroCount;

        // Step 3: Sliding window
        for (int right = totalOnes; right < arr.length; right++) {

            // Add new element entering the window
            if (arr[right] == 0) {
                zeroCount++;
            }

            // Remove element leaving the window
            int left = right - totalOnes;

            if (arr[left] == 0) {
                zeroCount--;
            }

            minSwaps = Math.min(minSwaps, zeroCount);
        }

        return minSwaps;
    }
}
