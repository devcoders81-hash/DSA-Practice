package Arrays;

import java.util.HashMap;

public class SubArraySumEqualsK {
   public static int subarraySum(int[] nums, int k) {
//     Using Hashing : 



// Use a prefix sum to track cumulative sums and a hash map to count 
// how many times a sum has occurred. 
// Check if pre_sum - k exists to identify valid subarrays efficiently.



// 1. Initialize Variables:

// Get the size of the array.
// Create a hash map to store prefix sum frequencies, initialized with { 0: 1 }.
// Set pre_sum to 0 and ans to 0 to store the number of valid subarrays.
// 2. Iterate Through Array & Maintained Prefix Sum:

// Iterate the array and add nums[i] to pre_sum to maintain the running prefix sum.
// 3. Check for Target Subarray:

// Check if pre_sum - k exists in the map.
// If found, add the frequency of pre_sum - k to ans as it indicates valid subarrays.
// 4. Update Hash Map:

// Increment the frequency of pre_sum in the hash map.
// 5. Return Result:

// Return the total count of valid subarrays. 
       int n = nums.length;


       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1); // Initial prefix sum = 0 with 1 occurrence


       int preSum = 0, ans = 0;


       for (int i = 0; i < n; i++) {
           preSum += nums[i];


           // Check if (preSum - k) exists in the map
           if (map.containsKey(preSum - k)) {
               ans += map.get(preSum - k);
           }


           // Store prefix sum frequency
           map.put(preSum, map.getOrDefault(preSum, 0) + 1);
       }
       return ans;
   }
    public static void main(String[] args) {
        System.out.println(SubArraySumEqualsK.subarraySum(new int[]{1,2,3}, 3));
    }

}
