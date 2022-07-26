package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM31 {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null){
            return true;
        }
        return traversal(pRoot.left, pRoot.right);
    }
    boolean traversal(TreeNode root1, TreeNode root2){
        if(root1==null&&root2==null){
            return true;
        }
        if(root1!=null&&root2==null){
            return false;
        }
        if(root1==null&&root2!=null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return traversal(root1.left, root2.right)&&traversal(root1.right,root2.left);
    }
}
