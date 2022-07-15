package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM2 {
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        ListNode dummyNode =new ListNode(-1);
        dummyNode.next=head;
        ListNode p=dummyNode;
        for(int i=0;i<m-1;i++){
            p=p.next;
        }
        ListNode cur=p.next;
        ListNode cur_next;
        for(int i=0;i<n-m;i++){
            cur_next=cur.next;
            cur.next=cur_next.next;
            cur_next.next=p.next;
            p.next=cur_next;
        }
        return dummyNode.next;
    }
}
