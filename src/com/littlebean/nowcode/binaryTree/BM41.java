package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BM41 {
    //1. 根据先序遍历和中序遍历建立二叉树，
    //2. 层序遍历新建的二叉树，输出每层的最后一个节点
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        if(xianxu.length==0){
            return new int[0];
        }
        TreeNode root=build(xianxu, 0, xianxu.length-1, zhongxu, 0, zhongxu.length-1);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<Integer> list=new ArrayList<>();
        while (!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                if(i==len-1){
                    list.add(node.val);
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }


    public TreeNode build(int[] pre, int preStart, int preEnd, int[] vin, int vinStart, int vinEnd){
        if(preStart>preEnd){
            return null;
        }

        TreeNode root=new TreeNode(pre[preStart]);
        int mid=vinStart;
        for(int i=vinStart; i<=vinEnd; i++){
            if(vin[i]==pre[preStart]){
                mid=i;
                break;
            }
        }
        root.left=build(pre, preStart+1, preStart+(mid-vinStart), vin, vinStart, mid-1);
        root.right=build(pre, preStart+(mid-vinStart)+1, preEnd, vin, mid+1, vinEnd);
        return root;
    }
}
