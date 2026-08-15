package Microsoft;
import java.util.Stack;

public class DecodeString {
//     Approach: Stack-Based Solution
// Key Idea: Use two stacks to handle nested patterns—one for numbers 
// and one for strings.

// How it works:

// When we see a digit: Build the complete multi-digit number 
// (e.g., "12[abc]" not "1" and "2")

// When we see '[': Push the current string and number onto their 
// respective stacks, reset for the next level

// When we see ']': Pop the number and previous string, multiply 
// the current string by that number, and concatenate

// When we see a letter: Simply append it to the current string

// Why this works: The stack allows us to handle nested brackets by
//  remembering the context at each level.

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String currentStr = "";
        int currentNum = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the full number (handles multi-digit numbers)
                currentNum = currentNum * 10 + (c - '0');
            } else if (c == '[') {
                // Push current string and number to stacks
                strStack.push(currentStr);
                numStack.push(currentNum);
                currentStr = "";
                currentNum = 0;
            } else if (c == ']') {
                // Pop and multiply string by the number
                int num = numStack.pop();
                String prevStr = strStack.pop();
                currentStr = prevStr + currentStr.repeat(num);
            } else {
                // Regular character, add to current string
                currentStr += c;
            }
        }
        
        return currentStr;
    }
    public static void main(String[] args) {
        System.out.println(DecodeString.decodeString("3[a2[c]]"));
    }
}
