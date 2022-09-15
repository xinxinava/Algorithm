package com.littlebean.interview.actual.mayi;

import java.util.Scanner;

public class MaYi1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();

        int len=26;
        long[] nums=new long[len];
        nums[0]=1;
        for(int i=1;i<26;i++){
            nums[i]=nums[i-1]*2;
        }
        char[] chars=new char[len];
        for(char i='a';i<='z';i++){
            chars[i-'a']=i;
        }

        StringBuilder sb=new StringBuilder();
        while (n>0){
            for(int i=len-1;i>=0;i--){
                if(n>=nums[i]){
                    sb.append(chars[i]);
                    n=n-nums[i];
                    break;
                }
            }
        }
        System.out.println(sb.toString());

    }
}
