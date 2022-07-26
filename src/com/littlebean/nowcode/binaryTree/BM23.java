package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BM23 {
    //递归版
    public int[] preorderTraversal (TreeNode root) {
        // write code here
        List<Integer> res=new ArrayList<>();
        traversal(root,res);
        int[] arr=new int[res.size()];
        for(int i=0;i<res.size();i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
    public void traversal(TreeNode root,List<Integer> res){
        if(root==null)
            return;
        res.add(root.val);
        traversal(root.left, res);
        traversal(root.right,res);
    }

    //非递归版
    public int[] preorderTraversal2 (TreeNode root) {
        if(root==null) {
            return new int[0];
        }
        Stack<TreeNode> stk=new Stack<>();
        stk.push(root);
        List<Integer> list=new ArrayList<>();
        while (!stk.isEmpty()){
            TreeNode node=stk.pop();
            list.add(node.val);
            if(node.right!=null){
                stk.push(node.right);
            }
            if(node.left!=null){
                stk.push(node.left);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
