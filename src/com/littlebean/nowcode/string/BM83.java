package com.littlebean.nowcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;

public class BM83 {
    public String trans(String s, int n) {
        // write code here
        Stack<String> stack=new Stack<>();
        String str="";
        s=s+" ";
        for(int i=0;i<=n;i++){
            if(s.charAt(i)==' '){
                stack.push(str);
                str="";
            }else {
                if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    String temp=s.charAt(i)+"";
                    str+=temp.toUpperCase();
                }else {
                    String temp=s.charAt(i)+"";
                    str+=temp.toLowerCase();
                }
            }
        }
        StringBuffer ans=new StringBuffer();
        while (!stack.isEmpty()){
            ans.append(stack.pop()).append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}
