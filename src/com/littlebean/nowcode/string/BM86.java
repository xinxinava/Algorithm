package com.littlebean.nowcode.string;

public class BM86 {
    public String solve (String s, String t) {
        // write code here
        int m=s.length(), n=t.length();
        if(m==0){
            return t;
        }
        if(n==0){
            return s;
        }
        StringBuffer ss=new StringBuffer();
        int sum=0, jin=0;
        while (m>0||n>0){
            int val1=(m>0?s.charAt(m-1)-'0':0);
            int val2=(n>0?t.charAt(n-1)-'0':0);
            sum+=val1+val2+jin;
            ss.append(sum%10);
            jin=sum/10;
            sum=0;
            m--;
            n--;
        }
        if(jin!=0){
            ss.append(jin);
        }
        return ss.reverse().toString();
    }
}
