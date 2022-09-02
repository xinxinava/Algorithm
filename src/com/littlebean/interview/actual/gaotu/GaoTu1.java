package com.littlebean.interview.actual.gaotu;

import java.util.Scanner;

public class GaoTu1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=n+"";
        StringBuilder sb=new StringBuilder();
        int[] num=new int[10];
        for(int i=s.length()-1;i>=0;i--){
            int idx=s.charAt(i)-'0';
            if(num[idx]==0){
                sb.append(s.charAt(i));
                num[idx]=1;
            }
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
