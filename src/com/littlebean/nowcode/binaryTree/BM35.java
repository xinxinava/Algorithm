package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BM35 {
    //层序遍历，所有节点都入队列，碰到null判断队列中之后的所有节点是否都为null
    public boolean isCompleteTree (TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                if(node==null){
                    int len1=queue.size();
                    for(int j=0;j<len1;j++){
                        TreeNode node1=queue.poll();
                        if(node1!=null){
                            return false;
                        }
                    }
                    //跳出循环说明遇到null之后后面都是空节点，已经是完全二叉树
                    return true;
                }
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return true;
    }
}
