package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM10 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1=getLength(pHead1);
        int len2=getLength(pHead2);
        ListNode p1=pHead1;
        ListNode p2=pHead2;
        if(len1<len2){
            int diff=len2-len1;
            while (diff!=0){
                p2=p2.next;
                diff--;
            }
        }else {
            int diff=len1-len2;
            while (diff!=0){
                p1=p1.next;
                diff--;
            }
        }
        while (p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }

    public int getLength(ListNode head){
        ListNode p=head;
        int count=0;
        while (p!=null){
            p=p.next;
            count++;
        }
        return count;
    }
}
