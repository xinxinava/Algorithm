package com.littlebean.nowcode.doublepointer;

public class BM91 {
    public String solve (String str) {
        // write code here
        StringBuffer ss=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            ss.append(str.charAt(i));
        }
        return ss.toString();
    }
}
