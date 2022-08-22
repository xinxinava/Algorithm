package com.littlebean.leetcode.swordoffer;

import java.util.Stack;

public class O31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int idx=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while (!stack.isEmpty()&&stack.peek()==popped[idx]){
                stack.pop();
                idx++;
            }
        }
        return stack.isEmpty();
    }
}
