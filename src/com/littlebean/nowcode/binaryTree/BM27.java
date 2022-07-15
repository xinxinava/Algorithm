package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BM27 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(pRoot==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        int level=0;
        while (!queue.isEmpty()){
            int len=queue.size();
            ArrayList<Integer> arr=new ArrayList<>();
            level++;
            for(int i=0;i<len;i++){
                TreeNode node=queue.poll();
                arr.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            if(level%2==0){
                ArrayList<Integer> temp=new ArrayList<>();
                for(int i=arr.size()-1;i>=0;i--){
                    temp.add(arr.get(i));
                }
                list.add(temp);
            }else {
                list.add(arr);
            }
        }
        return list;
    }
}
