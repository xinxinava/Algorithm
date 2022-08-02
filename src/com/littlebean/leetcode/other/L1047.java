package com.littlebean.leetcode.other;

import java.util.Stack;

public class L1047 {
    public String removeDuplicates(String s) {
        //栈
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==stack.peek()){
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
