package Arrays;

import java.util.HashSet;

public class LongestSubstribg {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet<Character> my_set=new HashSet<>();
        int max_length=0;int left=0;
        for (int right = 0; right < n-1; right++) {
            while(my_set.contains(s.charAt(right))){
                    my_set.remove(s.charAt(left));
                    left++;
            }
            my_set.add(s.charAt(right));
            max_length=Math.max(max_length, right-left+1);
        }
        return max_length;
    }
}
