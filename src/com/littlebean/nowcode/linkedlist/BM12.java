package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class BM12 {
    //分治
    public ListNode sortInList (ListNode head) {
        // write code here
        List<ListNode> list=new ArrayList<>();
        ListNode p=head;
        while (p!=null){
            ListNode temp=p;
            p=p.next;
            temp.next=null;
            list.add(temp);
        }
        return diviMerge(list, 0, list.size()-1);
    }
    public ListNode diviMerge(List<ListNode> list, int left, int right){
        if(left>right){
            return null;
        }
        if(left==right){
            return list.get(left);
        }
        int mid=(left+right)/2;
        return merge(diviMerge(list,left,mid), diviMerge(list,mid+1,right));
    }
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummyNode=new ListNode(-1);
        ListNode p=dummyNode;
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                p.next=head1;
                head1=head1.next;
            }else {
                p.next=head2;
                head2=head2.next;
            }
            p=p.next;
            p.next=null;
        }
        if(head1!=null){
            p.next=head1;
        }
        if(head2!=null){
            p.next=head2;
        }
        return dummyNode.next;
    }

}
