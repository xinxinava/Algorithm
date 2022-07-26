package com.littlebean.nowcode.dp;

import java.util.ArrayList;

public class BM74 {
    String nums;
    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        nums="";
        ArrayList<String> res=new ArrayList<>();
        dfs(s, res, 0,0);
        return res;
    }
    public void dfs(String s, ArrayList<String> res, int idx, int count){
        if(count==4){
            if(idx==s.length()){
                res.add(nums);
            }
            return;
        }
        String cur="";
        for(int i=idx;i<idx+3&&i<s.length();i++){
            cur+=s.charAt(i);
            int num=Integer.parseInt(cur);
            String temp=nums;
            if((cur.length()==1&&cur.charAt(0)=='0')||(cur.length()>=1&&cur.charAt(0)!='0'&&num<=255)){
                //    if(num<=255&&(cur.length()==1||cur.charAt(0)!='0')){
                if(count-3!=0){
                    nums+=cur+".";
                }else {
                    nums+=cur;
                }
                dfs(s,res, i+1,count+1);
                nums=temp;
            }
        }
    }
}
