package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.ListNode;

public class O18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode hh=new ListNode();
        hh.next=head;
        ListNode pre=hh, p=head;
        while (p!=null){
            if(p.val==val) {
                pre.next = p.next;
                break;
            }
            p=p.next;
            pre=pre.next;
        }
        return hh.next;
    }
}
