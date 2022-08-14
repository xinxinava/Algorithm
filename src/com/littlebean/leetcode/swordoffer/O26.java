package com.littlebean.leetcode.swordoffer;

import com.littlebean.Test;
import com.littlebean.util.TreeNode;

public class O26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null){
            return false;
        }
        if((A.val==B.val) && dfs(A.left, B.left) && dfs(A.right, B.right)){
            return true;
        }
        return isSubStructure(A.left, B)||isSubStructure(A.right, B);
    }
    public boolean dfs(TreeNode A, TreeNode B){
        if(B==null){
            return true;
        }
        if(A==null||A.val!=B.val){
            return false;
        }
        return A.val==B.val&&dfs(A.left, B.left)&&dfs(A.right, B.right);
    }
}
