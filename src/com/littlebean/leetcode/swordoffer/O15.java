package com.littlebean.leetcode.swordoffer;

public class O15 {
    public int hammingWeight(int n) {
        int res=0;
      for(int i=0;i<32;i++){
          if((n&(1<<i))!=0)
              res++;
      }
      return res;
    }
}
