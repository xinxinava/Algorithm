package com.littlebean.leetcode.dp;

public class L509 {
    public int fib(int n) {
        if(n==0)
            return 1;
        int f0=0;
        int f1=1;
        for(int i=2;i<=n;i++){
            int temp=f0+f1;
            f0=f1;
            f1=temp;
        }
        return f1;
    }
}
