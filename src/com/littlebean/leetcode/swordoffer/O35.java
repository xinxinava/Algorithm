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
}
