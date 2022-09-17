package com.littlebean.leetcode.binarytree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L863 {
    Map<Integer, TreeNode> map=new HashMap<>();
    List<Integer> ans=new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        findParent(root);
        findAns(target, null,0, k);
        return ans;
    }

    public void findParent(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            map.put(root.left.val, root);
            findParent(root.left);
        }
        if(root.right!=null){
            map.put(root.right.val, root);
            findParent(root.right);
        }
    }

    public void findAns(TreeNode root, TreeNode from, int depth, int k){
        if(root==null){
            return;
        }
        if(depth==k){
            ans.add(root.val);
        }
        if(root.left!=from){
            findAns(root.left, root, depth+1, k);
        }
        if(root.right!=from) {
            findAns(root.right, root, depth + 1, k);
        }
        if(map.get(root.val)!=from){
            findAns(map.get(root.val), root, depth+1, k);
        }
    }
}
