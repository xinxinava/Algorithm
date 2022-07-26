package com.littlebean.interview.practice.huawei2016;

import java.util.Scanner;

public class Huawei20163 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        long res=0;
        int idx=0;
        for(int i=s.length()-1;i>=2;i--){
            if(s.charAt(i)>='A'&&s.charAt(i)<='F'){
                res+=(s.charAt(i)-'A'+10)*Math.pow(16,idx);
            }else if(s.charAt(i)>='a'&&s.charAt(i)<='f'){
                res+=(s.charAt(i)-'a'+10)*Math.pow(16,idx);
            }else {
                res+=(s.charAt(i)-'0')*Math.pow(16,idx);
            }
            idx++;
        }
        System.out.println(res);
    }
}
