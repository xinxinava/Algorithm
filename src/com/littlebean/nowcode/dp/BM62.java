package com.littlebean.nowcode.dp;

public class BM62 {
    public int Fibonacci(int n) {
        int x1=1,x2=1;
        for(int i=3;i<=n;i++){
            int temp=x1+x2;
            x1=x2;
            x2=temp;
        }
        return x2;
    }
}
