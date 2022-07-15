package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM34 {
    //二叉搜索树，中序遍历是一个严格递增的序列
    int pre=Integer.MIN_VALUE;
    public boolean isValidBST (TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(pre>=root.val){
            return false;
        }
        pre=root.val;
        return isValidBST(root.right);
    }
}
