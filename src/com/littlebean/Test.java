package com.littlebean;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public ListNode ReverseList(ListNode head){
        ListNode hh=new ListNode(0);
        hh.next=head;
        ListNode p=head;
        while (p!=null){
            ListNode cur=p.next;
            p.next=hh.next;
            hh.next=p;
            p=cur;
        }
        return hh.next;
    }
}

