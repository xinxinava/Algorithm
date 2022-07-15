package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM29 {
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if(root==null){
            return false;
        }
        return dfs(root, sum);
    }
    public boolean dfs(TreeNode root, int sum){
        if(root==null){
            return false;
        }
        sum-=root.val;
        if(root.left==null&&root.right==null&&sum==0){
            return true;
        }
        return dfs(root.left, sum)||dfs(root.right,sum);
    }

}
