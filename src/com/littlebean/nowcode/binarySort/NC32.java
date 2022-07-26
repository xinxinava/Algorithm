package com.littlebean.nowcode.binarySort;

public class NC32 {
    //二分
    public int sqrt (int x) {
        // write code here
        if(x==1){
            return 1;
        }
        int left=1, right=x;
        while (left<=right){
            int mid=(left+right)/2;
            if(mid<=x/mid&&(mid+1)>x/(mid+1)){
                return mid;
            }
            if(mid>x/mid){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return 0;
    }
}
