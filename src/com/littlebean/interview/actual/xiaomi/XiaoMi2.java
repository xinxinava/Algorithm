package com.littlebean.interview.actual.xiaomi;


import java.util.*;

public class XiaoMi2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Node res = null;
        List<Node> list = new ArrayList<>();
        Collections.sort(list, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.data-o2.data;
            }
        });

        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int item = in.nextInt();
            if (item == -1) {
                list.add(null);
            } else {
                list.add(new Node(item));
            }
        }

    }
}


class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    Node pre, head;
    /* Write Code Here */
    public Node  Convert(Node pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        dfs(pRootOfTree);
        head.left=pre;
        pre.right=head;

        return head;
    }

    public void dfs(Node cur){
        if(cur==null){
            return;
        }
        dfs(cur.left);
        if(pre!=null)
            pre.right=cur;
        else head=cur;
        cur.left=pre;
        pre=cur;
        dfs(cur.right);
    }
}
