package com.littlebean.interview.actual.qizhi;

import com.littlebean.util.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QiZhi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int hval=scanner.nextInt();

        int len=(n-1)*2;

        Map<Integer, ListNode> map=new HashMap<>();
        int a=0;
        int b=0;
        ListNode p;
        for(int i=1;i<=len;i++){
            if(i%2!=0){ //奇数
                a=scanner.nextInt();
            }else {
                b=scanner.nextInt();
                if(map.containsKey(b)){
                    ListNode newNode=new ListNode(a);
                    newNode.next=map.get(b);
                    map.put(b,newNode);
                }else {
                    map.put(b, new ListNode(a));
                }
            }
        }

        int nextH=hval;
        p=null;
        while (map.containsKey(nextH)){
            if(p!=null) {
                p.next = map.get(nextH);
            }else {
                p=map.get(nextH);
            }
            while (p.next != null) {
                p = p.next;
            }
            nextH=p.val;
        }
        ListNode hh=new ListNode();
        ListNode head=new ListNode(hval);
        hh.next=head;
        head.next=map.get(hval);
        p=hh;
//        while (p.next!=null){
//            System.out.print(p.next.val+" ");
//            p=p.next;
//        }
//        System.out.println();

        int del=scanner.nextInt();
        ListNode cur=hh;
        while (cur.next!=null){
            if(cur.next.val==del){
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }

        cur=hh;
        while (cur.next!=null){
            System.out.print(cur.next.val+" ");
            cur=cur.next;
        }

    }
}

