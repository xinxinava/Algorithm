package com.littlebean.leetcode.swordoffer;

public class O03 {
    public int findRepeatNumber(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n+1];
        for(int i=0;i<n;i++){
            int temp=nums[i]+1;
            if(ans[temp]!=0)
                return nums[i];
            else
                ans[temp]=temp;
        }
        return 0;
    }
}
