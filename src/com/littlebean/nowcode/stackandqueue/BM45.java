package com.littlebean.nowcode.stackandqueue;

import java.util.*;

public class BM45 {
    //双端队列，维护一个不严格递减的队列
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        Deque<Integer> dq=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<size;i++){
            while (!dq.isEmpty()&&dq.peekLast()<num[i]){
                dq.pollLast();
            }
            dq.add(num[i]);
        }
        res.add(dq.peekFirst());
        for(int i=size;i<num.length;i++){
            if (!dq.isEmpty()&&dq.peekFirst()==num[i-size]){
                dq.pollFirst();
            }
            while (!dq.isEmpty()&&dq.peekLast()<num[i]) {
                dq.pollLast();
            }
            dq.add(num[i]);
            res.add(dq.peekFirst());
        }
        return res;
    }
}
