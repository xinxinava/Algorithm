package com.littlebean.interview.actual.mihay2022;

import java.util.Scanner;
import java.util.Stack;

public class Mihay2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Stack<String> stack=new Stack<>();
        int idx=0;
        int res=0;
        while (idx<s.length()){
            if(s.charAt(idx)=='<'){
                StringBuilder sb=new StringBuilder();
                idx++;
                while (idx<s.length()&&s.charAt(idx)!='>'){
                    sb.append(s.charAt(idx));
                    idx++;
                }
                if("/div".equals(sb.toString())&&!stack.isEmpty()){
                    stack.pop();
                    res++;
                }
                if("div".equals(sb.toString())){
                    stack.push(sb.toString());
                }
            }
            idx++;
        }
        System.out.println(res);

    }
}
