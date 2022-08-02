package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.TreeNode;

public class O07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    public TreeNode build(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart>preEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        int idx=inStart;
        while (idx<=inEnd){
            if(inorder[idx]!=preorder[preStart])
                idx++;
            else
                break;
        }
        root.left=build(preorder, preStart+1, preStart+(idx-inStart), inorder, inStart, idx-1);
        root.right=build(preorder, preStart+1+idx-inStart, preEnd, inorder, idx+1, inEnd);
        return root;
    }
}
