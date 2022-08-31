package com.littlebean.interview.actual.tuhu;

import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TuHu1 {
    //中序遍历，存储，计算里面有多少不同的值
    public int numColor (TreeNode root) {
        // write code here
        Set<Integer> set=new HashSet<>();
        inorder(root, set);
        return set.size();

    }
    public void inorder(TreeNode root, Set<Integer> set){
        if(root==null){
            return;
        }
        inorder(root.left, set);
        set.add(root.val);
        inorder(root.right, set);

    }
}
