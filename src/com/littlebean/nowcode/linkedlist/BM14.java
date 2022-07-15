package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM14 {
    public ListNode oddEvenList (ListNode head) {
        // write code here
        ListNode odd=new ListNode(-1); //奇数
        ListNode even=new ListNode(-1); //偶数
        ListNode p=head,p1=odd,p2=even;
        int count=1;
        while (p!=null){
            if(count%2!=0){
                p1.next=p;
                p=p.next;
                p1=p1.next;
                p1.next=null;
            }else {
                p2.next=p;
                p=p.next;
                p2=p2.next;
                p2.next=null;
            }
            count++;
        }
        p1.next=even.next;
        even.next=null;
        return odd.next;
    }
}
