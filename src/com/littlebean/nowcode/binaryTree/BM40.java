package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM40 {
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        return build(pre, 0, pre.length-1, vin, 0, vin.length-1);
    }
    public TreeNode build(int[] pre, int preStart, int preEnd, int[] vin, int vinStart, int vinEnd){
        if(preStart>preEnd){
            return null;
        }

        TreeNode root=new TreeNode(pre[preStart]);
        int mid=vinStart;
        for(int i=vinStart; i<=vinEnd; i++){
            if(vin[i]==pre[preStart]){
                mid=i;
                break;
            }
        }
        root.left=build(pre, preStart+1, preStart+(mid-vinStart), vin, vinStart, mid-1);
        root.right=build(pre, preStart+(mid-vinStart)+1, preEnd, vin, mid+1, vinEnd);
        return root;
    }
}
