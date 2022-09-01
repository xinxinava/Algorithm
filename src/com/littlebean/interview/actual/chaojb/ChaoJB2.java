package com.littlebean.interview.actual.chaojb;

import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ChaoJB2 {
    static Map<String, Integer> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++){
            String s=scanner.nextLine();
            getResult(s, i, n);
        }
    }
    public static void getResult(String s, int idx, int n){
        String res=null;
        s.trim();
        String[] str=s.split("=");
        String left=str[0];
        String right=str[1];
        int plumNum=0;
        for(int i=0;i<right.length();i++){
            if(right.charAt(i)=='+'){
                plumNum++;
            }
        }
        boolean isNum=isNumber(right);

        if(plumNum==0){
            if(isNum==true){
                map.put(left, Integer.parseInt(right));
            }else {
                if(!map.containsValue(right)&& idx==n){
                    res="NA";
                }
                if(map.containsKey(right)){
                    map.put(left, map.get(right));
                }
            }
        }else {
            String[] ss=right.split("/+");
            int sum=0;
            for(int i=0;i<ss.length;i++){
                if(isNumber(ss[i])){
                    sum+=Integer.parseInt(ss[i]);
                }else if(map.containsValue(ss[i])){
                    sum+=map.get(ss[i]);
                }else {
                    res="NA";
                }
            }
        }

        if(idx==n){
            res=map.get(left).toString();
        }
    }

    public static boolean isNumber(String s){
        boolean isNum=true;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                isNum=false;
                break;
            }
        }
        return isNum;
    }

}
