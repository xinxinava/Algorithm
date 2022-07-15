package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BM26 {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int len=queue.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                arr.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(arr);
        }
        return list;
    }
}
