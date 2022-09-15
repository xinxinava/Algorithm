package com.littlebean.interview.actual.duxiaoman;

import java.util.Arrays;
import java.util.Scanner;

public class DuXiaoMan1 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=Integer.parseInt(scanner.nextLine());

       int ans=0;
       for(int k=0;k<n;k++){
           String s=scanner.nextLine();
           int maxn=0;
           int minn=Integer.MAX_VALUE;
           int[] nums=new int[26];
           Arrays.fill(nums,0);
           for(int i=0;i<s.length();i++){
               int idx=s.charAt(i)-'a';
               nums[idx]++;
           }
           for(int i=0;i<26;i++){
               maxn=Math.max(maxn, nums[i]);
               if(nums[i]!=0){
                   minn=Math.min(minn, nums[i]);
               }
           }
           if(minn==Integer.MAX_VALUE){
               continue;
           }
           ans=Math.max(ans, Math.abs(maxn-minn));
       }
        System.out.println(ans);
    }
}

//4
//        aab
//        abcd
//        cccc
//        abacad