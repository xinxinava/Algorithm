package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM8 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        ListNode p=pHead;
        int count=0;
        for(;count<k&&p!=null;count++,p=p.next);
        if(p==null&&count<k){
            return null;
        }
        ListNode pre=pHead;
        while (p!=null){
            p=p.next;
            pre=pre.next;
        }
        return pre;
    }
}
