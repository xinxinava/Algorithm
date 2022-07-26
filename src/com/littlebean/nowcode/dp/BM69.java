package com.littlebean.nowcode.dp;

import java.util.Arrays;

public class BM69 {
    public int solve (String nums) {
        // write code here
       if(nums.equals("0")){
           return 0;
       }
       if(nums.equals("10")||nums.equals("20")){
           return 1;
       }
        for(int i=1;i<nums.length();i++){
            if (nums.charAt(i) == '0') {
                if(nums.charAt(i-1)!='1'&&nums.charAt(i-1)!='2'){
                    return 0;
                }
            }
        }
       int[] dp=new int[nums.length()+1];
        Arrays.fill(dp, 1);
        for(int i=2;i<=nums.length();i++){
            if((nums.charAt(i-2)=='1'&&nums.charAt(i-1)!='0')||(nums.charAt(i-2)=='2'&&nums.charAt(i-1)>'0'&&nums.charAt(i-1)<'7')){
                dp[i]=dp[i-1]+dp[i-2];
            }else {
                dp[i]=dp[i-1];
            }
        }
        return dp[nums.length()];

    }
}
