package com.littlebean.interview.actual.huawei2022;

import java.util.Scanner;

public class Huawei20221 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        long res=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+'||s.charAt(i)=='-'){
                res+=1;
                count++;
                continue;
            }
            if(s.charAt(i)=='*'){
                count++;
                res+=2;
                continue;
            }
            if(s.charAt(i)=='/'){
                count++;
                res+=4;
                continue;
            }
        }
        if(count>10){
            System.out.println(-1);
            return;
        }
        System.out.println(res);
    }
}
