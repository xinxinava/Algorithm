package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM30 {
    TreeNode pre;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        inorder(pRootOfTree);

        //找头节点，左子树的最左边，返回头节点
        TreeNode p=pRootOfTree;
        while (p.left!=null){
            p=p.left;
        }
        return p;
    }

    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        root.left=pre;
        if(pre!=null){
            pre.right=root;
        }
        pre=root;
        inorder(root.right);
    }

}
