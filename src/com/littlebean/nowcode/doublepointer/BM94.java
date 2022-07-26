package com.littlebean.nowcode.doublepointer;

public class BM94 {
    public long maxWater (int[] arr) {
        // write code here
        int leftMax=0, rightMax=0;
        int left=0, right=arr.length-1;
        int res=0;
        while (left<right){
            leftMax=Math.max(leftMax, arr[left]);
            rightMax=Math.max(rightMax, arr[right]);
            if(arr[left]<arr[right]){
                res+=(leftMax-arr[left]);
                left++;
            }else {
                res+=(rightMax-arr[right]);
                right--;
            }
        }
        return res;
    }
}
