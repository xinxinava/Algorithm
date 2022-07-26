package com.littlebean.nowcode.binarySort;

public class NC48 {
    public int search (int[] nums, int target) {
        // write code here
        int left=0, right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[left]){
                //left到mid有序
                if(target>nums[mid]||(target<nums[mid]&&target<nums[left])){
                    left=mid+1;
                }else {
                    right=mid-1;
                }
            }else if(nums[mid]<nums[right]){
                //mid到right有序
                if(target<nums[mid]||(target>nums[right]&&target>nums[mid])){
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
        }
        return -1;
    }
}
