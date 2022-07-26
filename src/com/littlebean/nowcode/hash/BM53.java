package com.littlebean.nowcode.hash;

import java.util.Arrays;

public class BM53 {
    public int minNumberDisappeared (int[] nums) {
        // write code here
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0&&nums[i]<=nums.length){
                arr[nums[i]]=nums[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return nums.length+1;
    }
}
