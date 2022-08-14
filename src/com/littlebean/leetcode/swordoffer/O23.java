package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.ListNode;

public class O23 {
    public ListNode reverseList(ListNode head) {
        ListNode hh=new ListNode();
        ListNode p=hh, cur=head;
        while (cur!=null){
            ListNode temp=cur.next;
            cur.next=p.next;
            p.next=cur;
        }
        return hh.next;
    }
}
