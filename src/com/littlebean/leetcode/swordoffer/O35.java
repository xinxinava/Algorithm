package com.littlebean.leetcode.swordoffer;


import com.littlebean.util.Node;

import java.util.HashMap;
import java.util.Map;

public class O35 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node p=head;
        while (p!=null){
            map.put(p, new Node(p.val));
            p=p.next;
        }
        p=head;
        while (p!=null){
            map.get(p).next=map.get(p.next);
            map.get(p).random=map.get(p.random);
            p=p.next;
        }
        return map.get(head);
    }

    public Node copyRandomList1(Node head) {
        if(head==null)
            return null;
        for(Node cur=head;cur!=null;cur=cur.next.next){
            Node newNode=new Node(cur.val);
            newNode.next=cur.next;
            cur.next=newNode;
        }
        for(Node cur=head; cur!=null;cur=cur.next.next){
            Node newNode=cur.next;
            newNode.random=(cur.random==null?null:cur.random.next);
        }
        Node newHead=head.next;
        for(Node cur=head; cur!=null; cur=cur.next){
            Node newNode=cur.next;
            cur.next=cur.next.next;
            newNode.next=(cur.next==null?null:cur.next.next);
        }
        return newHead;
    }
}
