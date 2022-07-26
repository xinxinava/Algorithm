package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM3 {
    public ListNode reverseKGroup (ListNode head, int k) {
        // write code here
        if(k==1||head==null)
            return head;
        ListNode dummyNode=new ListNode(-1);
        dummyNode.next=head;
        ListNode p=dummyNode;
        ListNode rear=dummyNode.next;
        ListNode p2;
        int count=1;
        while (rear!=null){
            if(count%k==0){
                //       System.out.println(count+" "+rear.val);
                ListNode p1=p.next;
                p2=rear.next;
                rear.next=null;
                p.next=reverse(p1);
                p1.next=p2;
                p=p1;
                rear=p1;
            }
            rear=rear.next;
            count++;
        }
        return dummyNode.next;
    }
    public ListNode reverse(ListNode head) {
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
