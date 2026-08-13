import java.util.*;
class GroupAnagrams {
    // "I would solve this using a HashMap with character-frequency signatures as keys. 
    // Since the input contains lowercase English letters, for every string I create an integer array of size 
    // 26 and count the frequency of each character. I then convert this frequency array into a
    //  unique string key. All anagrams have exactly the same character frequencies, so they generate the same key
    //  and therefore go into the same HashMap bucket. Finally, I return all the values of the HashMap.
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            // Count frequency of each letter in the string
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num).append("#");
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }
            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());        
    }
    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupedAnagrams = solution.groupAnagrams(strs);
        System.out.println(groupedAnagrams);
    }
}