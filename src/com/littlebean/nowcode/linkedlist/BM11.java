package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class BM11 {
    public ListNode addInList (ListNode head1, ListNode head2) {
        // write code here
        List<Integer> h1=new ArrayList<>();
        List<Integer> h2=new ArrayList<>();
        ListNode p1=head1;
        ListNode p2=head2;
        while (p1!=null){
            h1.add(p1.val);
            p1=p1.next;
        }
        while (p2!=null){
            h2.add(p2.val);
            p2=p2.next;
        }
        ListNode dummyNode =new ListNode(-1);
        int sum=0;
        int len1=h1.size();
        int len2=h2.size();
        System.out.println(len1+" "+len2);

        while (len1>0||len2>0){
            //注意这地方判断是长度大于0，注意get(int index)里面index<0
            int val1=(len1>0?h1.get(len1-1):0);
            int val2=(len2>0?h2.get(len2-1):0);
            sum=sum+val1+val2;
            System.out.println(sum);
            ListNode temp=new ListNode(sum%10);
            temp.next=dummyNode.next;
            dummyNode.next=temp;
            sum=sum/10;
            len1--;
            len2--;
        }
        if(sum!=0){
            ListNode temp=new ListNode(sum);
            temp.next=dummyNode.next;
            dummyNode.next=temp;
        }
        return dummyNode.next;
    }
}
