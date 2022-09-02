package com.littlebean.interview.actual.oppo;

import com.littlebean.util.ListNode;

public class Oppo2 {
    public ListNode combineTwoDisorderNodeToOrder (ListNode node1, ListNode node2) {
        // write code here
        ListNode hh=new ListNode(0);
        ListNode p1=new ListNode(0);
        ListNode p2=new ListNode(0);
        p1.next=node1;
        p2.next=node2;
        while (p1.next!=null&&p2.next!=null){
            ListNode pre=p1, p=p1.next;
            ListNode maxpre1=p1, maxp1=p1.next;
            int maxn1=p.val;
            while (p!=null){
                if(p.val>maxn1){
                    maxp1=p;
                    maxpre1=pre;
                    maxn1=p.val;
                }
                p=p.next;
                pre=pre.next;
            }
            pre=p2;
            p=p2.next;
            ListNode maxpre2=p2, maxp2=p2.next;
            int maxn2=p2.val;
            while (p!=null){
                if(p.val>maxn2){
                    maxp2=p;
                    maxpre2=pre;
                    maxn2=p.val;
                }
                p=p.next;
                pre=pre.next;
            }
            if(maxn1>maxn2){
                maxpre1.next=maxp1.next;
                maxp1.next=hh.next;
                hh.next=maxp1;
            }else {
                maxpre2.next=maxp2.next;
                maxp2.next=hh.next;
                hh.next=maxp2;
            }
        }
        while (p1.next!=null){
            ListNode pre=p1, p=p1.next;
            ListNode maxpre1=p1, maxp1=p1.next;
            int maxn1=p.val;
            while (p!=null){
                if(p.val>maxn1){
                    maxp1=p;
                    maxpre1=pre;
                    maxn1=p.val;
                }
                p=p.next;
                pre=pre.next;
            }
            maxpre1.next=maxp1.next;
            maxp1.next=hh.next;
            hh.next=maxp1;
        }

        while (p2.next!=null){
            ListNode pre=p2;
            ListNode p=p2.next;
            ListNode maxpre2=p2, maxp2=p2.next;
            int maxn2=p2.val;
            while (p!=null){
                if(p.val>maxn2){
                    maxp2=p;
                    maxpre2=pre;
                    maxn2=p.val;
                }
                p=p.next;
                pre=pre.next;
            }
            maxpre2.next=maxp2.next;
            maxp2.next=hh.next;
            hh.next=maxp2;
        }
        return hh.next;
    }
}
