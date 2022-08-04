package com.littlebean.leetcode.swordoffer;

public class O16 {
    public double myPow(double x, int n) {
        double res=1;
        if(n>0){
            for(int i=1;i<=n;i++){
                res*=x;
            }
        }else if(n<0){
            n=-n;
            for(int i=1;i<=n;i++){
                res/=x;
            }
        }
        Math.pow(3,4);
        return res;
    }
}
