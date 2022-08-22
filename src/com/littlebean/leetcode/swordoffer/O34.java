package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class O34 {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(root, target, ans, path);
        return ans;
    }
    public void dfs(TreeNode root, int target, List<List<Integer>> ans, List<Integer> path
    ){
        if(root==null)
            return;
        path.add(root.val);
        target-=root.val;
        if(root.left==null && root.right==null && target==0){
            ans.add(new ArrayList<>(path));
        }
        dfs(root.left, target, ans, path);
        dfs(root.right, target, ans, path);
        path.remove(path.size()-1);
    }
}
