package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BM25 {
    public int[] postorderTraversal (TreeNode root) {
        // write code here

        List<Integer> list=new ArrayList<>();
        traversal(root,list);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        traversal(root.left,list);
        traversal(root.right,list);
        list.add(root.val);
    }
}
