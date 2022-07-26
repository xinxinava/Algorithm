package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.ListNode;
import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BM24 {
    //递归
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list=new ArrayList<>();
        traveral(root, list);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void traveral(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        traveral(root.left,list);
        list.add(root.val);
        traveral(root.right,list);
    }
    //非递归
    public int[] inorderTraversal2 (TreeNode root) {
        if(root==null){
            return new int[0];
        }
        Stack<TreeNode> stk=new Stack<>();
        List<Integer> list=new ArrayList<>();
        while (root!=null||!stk.isEmpty()){
            while (root!=null){
                stk.push(root);
                root=root.left;
            }
            TreeNode node=stk.pop();
            list.add(node.val);
            root=node.right;
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
