package com.littlebean.leetcode.dp;

import com.littlebean.util.TreeNode;

public class L337 {
    public int rob(TreeNode root) {
        int[] dp=robTree(root);
        return Math.max(dp[0],dp[1]);
    }
    public int[] robTree(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] left=robTree(root.left);
        int[] right=robTree(root.right);
        int val1=root.val+left[0]+right[0];
        int val2=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        return new int[]{val2, val1};
    }
}
