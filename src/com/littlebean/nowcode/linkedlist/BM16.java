package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM16 {
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head==null||head.next==null)
            return head;
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode pre=dummyNode, p=head, cur=head.next;
        int flag=1;
        while (cur!=null){
            if(cur.val==p.val){
                cur=cur.next;
                p.next=cur;
                flag=1;
            }else {
                if(flag==1){
                    pre.next=cur;
                    cur=cur.next;
                    p=p.next;
                }else {
                    pre=pre.next;
                    p=p.next;
                    cur=cur.next;
                }
                flag=0;
            }
        }
        return dummyNode.next;
    }
}
