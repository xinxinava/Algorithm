package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM9 {
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode p=dummyNode.next;
        int count=0;
        for(;count<n&&p!=null;count++,p=p.next);
        if(p==null&&count<n){
            return null;
        }
        ListNode pre=dummyNode;
        ListNode cur=dummyNode.next;
        while (p!=null){
            p=p.next;
            pre=pre.next;
            cur=cur.next;
        }
        pre.next=cur.next;
        cur.next=null;
        return dummyNode.next;
    }
}
