package com.rss.leetPractice.start;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println("(){} is valid "+isValid("(){}"));
        System.out.println("()} is valid "+isValid("()}"));
        System.out.println("({){)()}][ is valid "+isValid("({){)()}]["));
        System.out.println("()[]{}{([])} is valid "+isValid("()[]{}{([])}"));
    }

    public static boolean isValid(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (char ss : s.toCharArray()){
            if (ss == '(' || ss == '{' || ss == '['){
                st.push(ss);
            } else if ( ss == ')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            } else if (ss == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            } else if (ss == ']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
