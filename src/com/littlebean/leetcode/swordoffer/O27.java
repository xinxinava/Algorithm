package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.TreeNode;

public class O27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }

}
