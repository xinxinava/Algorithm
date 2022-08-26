package com.littlebean.other;

import com.littlebean.util.ListNode;
import com.littlebean.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Huan {
    public int ysf (int n, int m) {
        // write code here
        if(n==1)
            return n;
        ListNode head=new ListNode(1);
        ListNode p=head;
        for(int i=2;i<=n;i++){
            ListNode temp=new ListNode(i);
            p.next=temp;
            p=temp;
        }
        ListNode pre=p;
        p.next=head;
        p=head;
        int count=0;
        while (p.next!=p){
            count++;
            if(count%m==0){
                pre.next=p.next;
                p=pre.next;
            }else {
                p=p.next;
                pre=pre.next;
            }
        }
        return p.val;
    }
    public int LastRemaining_Solution(int n, int m) {
        // write code here
        if(n==0)
            return n;
        ListNode head=new ListNode(0);
        ListNode p=head;
        for(int i=1;i<n;i++){
            ListNode temp=new ListNode(i);
            p.next=temp;
            p=temp;
        }
        ListNode pre=p;
        p.next=head;
        p=head;
        int count=0;
        while (p.next!=p){
            count++;
            if(count%m==0){
                pre.next=p.next;
                p=pre.next;
            }else {
                p=p.next;
                pre=pre.next;
            }
        }
        return p.val;
    }

    int solve(String a) {
        // write code here
        int maxn=0;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                String temp=a.substring(i, j+1);
                if(check(temp)&&maxn>temp.length()){
                    maxn=temp.length();
                }
            }

        }
        return maxn;
    }

    public boolean check(String s){
        for(int i=0, j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(pRoot==null)
            return list;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()){
            int len = queue.size();
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < len; i++){
                TreeNode temp = queue.poll();
                ans.add(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            list.add(ans);
        }
        return list;

    }

    public int maxProfit (int[] prices) {
        // write code here
        int n=prices.length;
        int[][] dp=new int[5][n];
        //dp[0]为没有操作手里的资金
        //dp[1]为第一次买入
        //dp[2]为第一次卖出后
        //dp[3]为第二次买入后
        //dp[4]为第二次卖出后
        dp[1][0]=-prices[0];
        dp[3][0]=-prices[0];
        for(int i=1;i<n;i++){
            dp[1][i]=Math.max(dp[1][i-1],-prices[i]);
            dp[2][i]=Math.max(dp[2][i-1], dp[1][i-1]+prices[i]);
            dp[3][i]=Math.max(dp[3][i-1],dp[2][i-1]-prices[i]);
            dp[4][i]=Math.max(dp[4][i-1],dp[3][i-1]+prices[i]);
        }
        return dp[4][n-1];
    }

}
