package com.littlebean.nowcode.hash;

public class BM52 {
    //异或，两个相同异或为0
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
        int[] res=new int[2];
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum^array[i];
        }
        int m=1;
        while ((m&sum)==0){
            m<<=1;
        }
        int a=0, b=0;
        for(int x:array){
            if ((m&x)==0) {
                a^=x;
            }else {
                b^=x;
            }
        }
        if(a>b){
            return new int[]{b,a};
        }else {
            return new int[]{a,b};
        }

    }
}
