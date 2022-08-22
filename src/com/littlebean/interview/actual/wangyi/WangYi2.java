package com.littlebean.interview.actual.wangyi;

import java.util.Scanner;

public class WangYi2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=scanner.nextInt();
        }
        int max1=0;//奇数位最大值
        int max2=0; //偶数位最大值
        for(int i=0;i<n;i++){
            if((i+1)%2!=0&&max1<ans[i]){
                max1=ans[i];
            }
            if((i+1)%2==0&&max2<ans[i]){
                max2=ans[i];
            }
        }
        long count=0;
        if(max1==max2){
            //奇数位加1
            long temp1=0;
            for(int i=0;i<n;i++){
                if((i+1)%2!=0){
                    temp1=temp1+(max1-ans[i])+1;
                }else {
                    temp1=temp1+(max2-ans[i]);
                }
            }

            //偶数位加1
            long temp2=0;
            for(int i=0;i<n;i++){
                if((i+1)%2!=0){
                    temp2=temp2+(max1-ans[i]);
                }else {
                    temp2=temp2+(max2-ans[i])+1;
                }
            }
            count=Math.min(temp1, temp2);
        } else {
            for(int i=0;i<n;i++){
                if((i+1)%2!=0){
                    count=count+(max1-ans[i]);
                }else {
                    count=count+(max2-ans[i]);
                }
            }
        }
        System.out.println(count);
    }
}
