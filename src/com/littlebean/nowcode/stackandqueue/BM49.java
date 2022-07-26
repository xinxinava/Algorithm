package com.littlebean.nowcode.stackandqueue;

import java.util.ArrayList;
import java.util.Stack;

public class BM49 {
    public int solve (String s) {
        // write code here
        ArrayList<Integer> res=calc(s, 0);
        return res.get(0);
    }
    public ArrayList<Integer> calc(String s, int idx){
        Stack<Integer> stack=new Stack<>();
        int num=0;
        int op='+';
        int i=idx;
        for( i=idx; i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                num=num*10+s.charAt(i)-'0';
                if(i!=s.length()-1){
                    continue;
                }
            }
            if(s.charAt(i)=='('){
                ArrayList<Integer> res=calc(s,i+1);
                num=res.get(0);
                i=res.get(1);
                if(i!=s.length()-1){
                    continue;
                }
            }
            switch (op){
                case '+':
                    stack.push(num);
                    break;
                case '-':
                    stack.push(-num);
                    break;
                case '*':
                    int temp=stack.pop();
                    stack.push(temp*num);
                    break;
            }
            num=0;
            if(s.charAt(i)==')'){
                break;
            }else {
                op=s.charAt(i);
            }
        }
        int sum=0;
        while (!stack.isEmpty()){
            sum+=stack.pop();
        }
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(sum);
        temp.add(i);
        return temp;
    }
}
