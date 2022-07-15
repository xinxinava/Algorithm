package com.littlebean.nowcode.doublepointer;

public class BM88 {
    public boolean judge (String str) {
        // write code here
        for(int i=0, j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
