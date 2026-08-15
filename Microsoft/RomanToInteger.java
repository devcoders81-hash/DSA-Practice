package Microsoft;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int res=0;
        HashMap<Character,Integer> my_dict=new HashMap<>();
        my_dict.put('I', 1);
        my_dict.put('V', 5);
        my_dict.put('X', 10);
        my_dict.put('L', 50);
        my_dict.put('C', 100);
        my_dict.put('D', 500);
        my_dict.put('M', 1000);
        for (int i = 0; i < s.length() - 1; i++) {
            if (my_dict.get(s.charAt(i)) < my_dict.get(s.charAt(i + 1))) {
                res -= my_dict.get(s.charAt(i));
            } else {
                res += my_dict.get(s.charAt(i));
            }
        }

        return res + my_dict.get(s.charAt(s.length() - 1)); 
    }
    
}
