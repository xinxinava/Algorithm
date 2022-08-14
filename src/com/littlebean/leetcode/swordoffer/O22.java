package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.ListNode;

public class O22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre=head, p=head;
        int count=0;
        while (p!=null){
            if(count>=k){
                break;
            }
            p=p.next;
            count++;
        }
        if(p==null&&count<k){
            return null;
        }
        while (p!=null){
            pre=pre.next;
            p=p.next;
        }
        return pre;
    }
}
