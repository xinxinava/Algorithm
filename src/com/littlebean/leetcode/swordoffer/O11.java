package com.littlebean.leetcode.swordoffer;

public class O11 {
    public int minArray(int[] numbers) {
        int minn=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<minn){
                minn=numbers[i];
                break;
            }
        }
        return minn;
    }
}
