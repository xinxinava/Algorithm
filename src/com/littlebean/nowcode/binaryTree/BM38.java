package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM38 {
    //递归方法
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        return helper(root, o1, o2).val;
    }

    public TreeNode helper(TreeNode root, int o1, int o2){
        if(root==null||root.val==o1||root.val==o2){
            return root;
        }
        TreeNode leftN=helper(root.left, o1, o2);
        TreeNode rightN=helper(root.right, o1, o2);
        if(leftN==null){
            return rightN;
        }
        if(rightN==null){
            return leftN;
        }
        return root;
    }
}
