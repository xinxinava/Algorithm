package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM37 {
    /**
     * 一次遍历，寻找最近公共祖先
     * 如果节点值大于p，并且大于q,那p,q在该节点左子树
     * 如果节点值小于p,并且节点值小于q,那么p,q在该节点的右子树
     * 如果一大一小，则该节点可能是公共祖先
     * @param root
     * @param p
     * @param q
     * @return
     */
    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        // write code here
        TreeNode ancestor=root;
        while (true){
            if(ancestor.val>p&&ancestor.val>q){
                ancestor=ancestor.left;
            }else if(ancestor.val<p&&ancestor.val<q){
                ancestor=ancestor.right;
            }else {
                break;
            }
        }
        return ancestor.val;
    }
}
