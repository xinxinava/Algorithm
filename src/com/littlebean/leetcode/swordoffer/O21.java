package com.littlebean.leetcode.swordoffer;

public class O21 {
    public int[] exchange(int[] nums) {
        int pre=0, p=0;
        while (p<nums.length){
            if(nums[p]%2!=0){
                int temp=nums[p];
                nums[p]=nums[pre];
                nums[pre]=temp;
                pre++;
            }
            p++;
        }
        return nums;
    }
}
