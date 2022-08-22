package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.TreeNode;

import java.util.*;

public class O32 {
    public int[] levelOrder1(TreeNode root) {
        if(root==null){
            return new int[0];
        }
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            list.add(temp.val);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode temp = queue.poll();
                ans.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int level=1;
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode temp = queue.poll();
                ans.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            if(level%2==0){
                Collections.reverse(ans);
            }
            list.add(ans);
            level++;
        }
        return list;
    }
}
