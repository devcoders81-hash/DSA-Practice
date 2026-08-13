package Arrays;

import java.util.HashSet;
import java.util.Set;

public class distinctelement {    public static void main(String[] args) {
        int[] nums = {1, 2,2,2,2, 3,3,3,3, 4, 4,4,4,5,5,5,5, 6, 7, 8, 9,};
         Set<Integer> distinctElements = new HashSet<>();
        // for (int num : nums) {
        //     distinctElements.add(num);
        // }
        // System.out.println("Distinct elements: " + distinctElements);
        
        for (int n:nums){
            if(distinctElements.contains(n)){
                System.out.println("Duplicate element found: " + n);
            }else{
            distinctElements.add(n);
            }
        }
         System.out.println("Distinct elements: " + distinctElements);
        
        

    }
    
}
