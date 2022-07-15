package com.littlebean.nowcode.greedy;

import java.util.Arrays;

public class BM95 {
    public int candy (int[] arr) {
        // write code here
        int[] nums=new int[arr.length];
        Arrays.fill(nums, 1);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                nums[i]=nums[i-1]+1;
            }
        }
        int res=nums[nums.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]&&nums[i]<=nums[i+1]){
                nums[i]=nums[i+1]+1;
            }
            res=res+nums[i];
        }
        return res;
    }
}
