package com.littlebean.nowcode.doublepointer;

public class BM93 {
    public int maxArea (int[] height) {
        // write code here
        int res=0;
        if(height.length<2){
            return 0;
        }
        int left=0, right=height.length-1;
        while (left<right){
            int area=Math.min(height[left], height[right])*(right-left);
            res=Math.max(res, area);
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return res;
    }
}

