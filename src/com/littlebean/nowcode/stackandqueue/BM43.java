package com.littlebean.nowcode.stackandqueue;

import java.util.Stack;

public class BM43 {

    Stack<Integer> stk=new Stack<>();
    Stack<Integer> stk_min=new Stack<>();

    public void push(int node) {
        stk.push(node);
        if(stk_min.isEmpty()||stk_min.peek()>node){
            stk_min.push(node);
        }else {
            stk_min.push(stk_min.peek());
        }
    }

    public void pop() {
        stk.pop();
        stk_min.pop();
    }

    public int top() {
        return stk.peek();
    }

    public int min() {
        return stk_min.peek();
    }
}
