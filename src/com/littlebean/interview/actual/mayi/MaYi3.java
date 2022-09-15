package com.littlebean.interview.actual.mayi;

import java.util.Scanner;

public class MaYi3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int len=s.length();
        long res=len;

        int[] nums=new int[26];
        int[] idx=new int[26];
        for(int i=0;i<len;i++){
            nums[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(nums[i]%2==1){
                idx[i]=1;
            }
        }

        for(int i=len-1;i>=0;i--){

        }
    }
}
