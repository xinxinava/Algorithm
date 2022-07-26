package com.littlebean.nowcode.dp;

public class BM63 {
    public int jumpFloor(int target) {
        if(target<=1){
            return target;
        }
        int x1=1, x2=2;
        for(int i=3;i<=target;i++){
            int temp=x1+x2;
            x1=x2;
            x2=temp;
        }
        return x2;
    }
}
