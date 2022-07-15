package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM1 {
    public ListNode ReverseList(ListNode head) {
        ListNode p=head;
        ListNode hh=new ListNode(0);
        while(p!=null){
            ListNode cur=p.next;
            p.next=hh.next;
            hh.next=p;
            p=cur;
        }
        return hh.next;
    }
}
