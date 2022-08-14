package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.ListNode;

public class O24 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode hh=new ListNode();
        ListNode p=hh;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                p.next=l1;
                l1=l1.next;
                p=p.next;
                p.next=null;
            }else {
                p.next=l2;
                l2=l2.next;
                p=p.next;
                p.next=null;
            }
        }
        if(l1!=null){
            p.next=l1;
        }
        if(l2!=null){
            p.next=l2;
        }
        return hh.next;
    }
}
