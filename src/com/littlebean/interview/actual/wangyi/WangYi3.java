package com.littlebean.interview.actual.wangyi;

import java.util.Scanner;

public class WangYi3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int r=0, e=0, d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='r'){
                r++;
            }else if(s.charAt(i)=='e'){
                e++;
            }else if(s.charAt(i)=='d'){
                d++;
            }
        }
        System.out.println((r+e+d)/3);
    }
}
