package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BM28 {
    //层序遍历计算深度
    public int maxDepth (TreeNode root) {
        // write code here
        if(root==null){
            return 0;
        }
        int depth=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            depth++;
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return depth;
    }

    //深度遍历计算树的深度
    public int maxDepth2 (TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(depth(root.left),depth(root.right))+1;
    }

    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftDepth=depth(root.left)+1;
        int rightDepth=depth(root.right)+1;
        return Math.max(leftDepth,rightDepth);
    }
}
