package com.littlebean.nowcode.binarySort;

public class BM17 {
    //递归版本
    public int search (int[] nums, int target) {
        // write code here
        return binarySearch(nums, target, 0, nums.length-1);
    }
    public int binarySearch(int[] nums, int target, int left, int right){
        if(left>right){
            return -1;
        }
        int mid=(left+right)/2;
        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return binarySearch(nums, target, left, mid-1);
        }else {
            return binarySearch(nums, target, mid+1, right);
        }
    }

    //迭代版本
    public int search2 (int[] nums, int target) {
        int left=0, right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
}
