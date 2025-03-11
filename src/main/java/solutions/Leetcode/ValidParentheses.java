// LeetCode 20. Valid Parentheses

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        // use stack to help in comparing
        Stack<Character> stack = new Stack<>();

        // iterate each characters in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                // empty means it does not start with a proper open bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char pop = stack.pop();
                if ((s.charAt(i) == ')' && pop != '(') ||
                        (s.charAt(i) == '}' && pop != '{') ||
                        (s.charAt(i) == ']' && pop != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
