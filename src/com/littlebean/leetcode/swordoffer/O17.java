package com.littlebean.leetcode.swordoffer;

public class O17 {
    public int[] printNumbers(int n) {
        int num=1;
        for(int i=1;i<=n;i++){
            num=num*10;
        }
        num-=1;
        int[] ans=new int[num];
        for(int i=0;i<num;i++){
            ans[i]=i+1;
        }
        return ans;
    }
}
