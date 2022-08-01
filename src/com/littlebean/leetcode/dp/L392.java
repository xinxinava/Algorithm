package com.littlebean.leetcode.dp;

public class L392 {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m>n)
            return false;
        if(m==0)
            return true;
        int idx=0;
        for(int i=0;i<n;i++){
            if(s.charAt(idx)==t.charAt(i)){
                idx++;
            }
            if(idx==m)
                break;
        }
        if(idx!=m)
            return false;
        return true;
    }
}
