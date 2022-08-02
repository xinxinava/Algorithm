package com.littlebean.leetcode.swordoffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class O09 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;
    public O09() {
        inStack=new ArrayDeque<>();
        outStack=new ArrayDeque<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if(outStack.isEmpty()){
            if(inStack.isEmpty()){
                return -1;
            }
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}
