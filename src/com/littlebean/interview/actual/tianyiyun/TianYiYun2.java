package com.littlebean.interview.actual.tianyiyun;

import java.util.Scanner;

public class TianYiYun2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String s=scanner.nextLine();
        String[] temp=s.split(",");
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(temp[i]);
        }
        int[] res=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res[idx++]=nums[i];
            }
        }
        idx=n-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]%2!=0){
                res[idx--]=nums[i];
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.print(res[i]+",");
        }
        System.out.println(res[n-1]);
    }
}
