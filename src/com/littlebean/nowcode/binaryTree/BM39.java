package com.littlebean.nowcode.binaryTree;

import com.littlebean.util.TreeNode;

public class BM39 {
    //前序实现序列化
    int idx=-1;
    String Serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        StringBuffer sb=new StringBuffer();
        serializeHelper(root, sb);
        return sb.toString();
    }
    public void serializeHelper(TreeNode root, StringBuffer sb){
        if(root==null){
            sb.append("#!");
            return;
        }
        sb.append(root.val).append("!");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }
    TreeNode Deserialize(String str) {
        if(str==null||str==""){
            return null;
        }
        String[] strs=str.split("!");
        return deserializeHelper(strs);
    }
    TreeNode deserializeHelper(String[] strs){
        idx++;
        if(!strs[idx].equals("#")){
            TreeNode node=new TreeNode(Integer.parseInt(strs[idx]));
            node.left=deserializeHelper(strs);
            node.right=deserializeHelper(strs);
            return node;
        }
        return null;
    }
}
