package com.littlebean.interview.actual.tencent;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Tencent1 {
    public ListNode xorList (ListNode a, ListNode b) {
        // write code here

        List<ListNode> list=new ArrayList<>();
        ListNode p=a;
        while(p!=null){
            ListNode temp=p.next;
            list.add(p);
            p.next=null;
            p=temp;
        }
        p=b;
        ListNode head=new ListNode(0);
        ListNode node;
        for(int i=list.size()-1;i>=0;i--){
            if(p==null){
                if(list.get(i).val==0){
                    node=new ListNode(0);
                }else {
                    node=new ListNode(1);
                }
            }else {
                if(p.val==list.get(i).val){
                    node=new ListNode(0);
                }else {
                    node=new ListNode(1);
                }
                p=p.next;
            }
            node.next=head.next;
            head.next=node;
        }
        while (p!=null){
            if(p.val==0){
                node=new ListNode(0);
            }else {
                node=new ListNode(1);
            }
            node.next=head.next;
            head.next=node;
            p=p.next;
        }
        p=head;
        while (p!=null){
            if(p.val!=0){
                return p;
            }
            p=p.next;
        }
        return null;
    }

}
