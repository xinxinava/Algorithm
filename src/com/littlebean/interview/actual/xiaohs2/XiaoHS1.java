package com.littlebean.interview.actual.xiaohs2;

import java.util.Scanner;

public class XiaoHS1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int k=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int time=k/n;
        int yu=k%n;

        if(time%2==0){
            if(yu==0){
                System.out.println(nums[0]);
            }else {
                System.out.println(nums[yu-1]);
            }
        }else {
            if(yu==0){
                System.out.println(nums[n-1]);
            }else {
                System.out.println(nums[n-yu]);
            }
        }
    }
}
