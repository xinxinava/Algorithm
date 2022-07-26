package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

public class BM6 {
    public boolean hasCycle(ListNode head) {
        //快慢指针
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
