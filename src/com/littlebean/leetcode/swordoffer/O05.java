package com.littlebean.leetcode.swordoffer;

public class O05 {
    public String replaceSpace(String s) {
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ss.append("%20");
            }else {
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}
