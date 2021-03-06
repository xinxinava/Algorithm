package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM4 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode dummyNode=new ListNode(-1);
        ListNode p=dummyNode;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                p.next=list1;
                list1=list1.next;
            }else {
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
            p.next=null;
        }
        if(list1!=null){
            p.next=list1;
        }
        if(list2!=null){
            p.next=list2;
        }
        return dummyNode.next;
    }
}
