package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM33 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null){
            return null;
        }
        TreeNode node=pRoot.left;
        pRoot.left=pRoot.right;
        pRoot.right=node;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
