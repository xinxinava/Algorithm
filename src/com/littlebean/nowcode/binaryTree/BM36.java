package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM36 {
    //设置一个全局变量，在计算高度的同时判断是否是平衡二叉树
    boolean isBalanced=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        treeDepth(root);
        return isBalanced;
    }
    public int treeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftH=treeDepth(root.left);
        int rightH=treeDepth(root.right);
        if(Math.abs(leftH-rightH)>1){
            isBalanced=false;
        }
        return Math.max(leftH, rightH)+1;
    }
}
