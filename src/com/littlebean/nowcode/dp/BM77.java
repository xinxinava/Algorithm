package com.littlebean.nowcode.dp;

import java.util.Stack;

public class BM77 {
    public int longestValidParentheses (String s) {
        // write code here
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxn=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else {
                stack.pop();
                if(!stack.isEmpty()){
                    maxn=Math.max(maxn, i-stack.peek());
                }
                else {
                    stack.push(i);
                }
            }
        }
        return maxn;
    }
}
