package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM15 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head==null||head.next==null)
            return head;
        ListNode p=head;
        ListNode cur=head.next;
        while(cur!=null){
            if(cur.val==p.val){
                cur=cur.next;
                p.next=cur;
            }else{
                cur=cur.next;
                p=p.next;
            }
        }
        return head;
    }
}
