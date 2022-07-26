package com.littlebean.nowcode.stackandqueue;

import java.util.Stack;

public class BM44 {
    public boolean isValid (String s) {
        // write code here
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }else {
                if(!stk.isEmpty()){
                    int c=stk.pop();
                    if(s.charAt(i)==')'&&c!='('){
                        return false;
                    }
                    if(s.charAt(i)=='}'&&c!='{'){
                        return false;
                    }
                    if(s.charAt(i)==']'&&c!='['){
                        return false;
                    }
                }else {
                    return false;
                }
            }
        }
        if(!stk.isEmpty()){
            return false;
        }
        return true;
    }
}
