package com.littlebean.leetcode.swordoffer;

public class O20 {
    public boolean isNumber(String s) {
        s=s.trim();
        if(s.length()==0)
            return false;
        int idx=0;
        boolean sign=false; //正负符号
        boolean deci=false; //小数点
        boolean sci=false; //科学计数法
        boolean inter=false;
        for(int i=0;i<s.length();i++){
            if((i==0||sci==true)&&(s.charAt(i)=='-'||s.charAt(i)=='+')&&sign==false){
                sign=true;
                continue;
            }
            if(s.charAt(i)=='.'&&deci==false){
                deci=true;
                continue;
            }
            if((s.charAt(i)=='E'||s.charAt(i)=='e')&&sci==false&&inter==true){
                sci=true;
                sign=false;
                deci=true;
                continue;
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                inter=true;
                continue;
            }
            return false;
        }
        if((inter==false)||(s.length()==1&&s.charAt(0)=='.')||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='E'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='+')
            return false;
        return true;
    }
}
