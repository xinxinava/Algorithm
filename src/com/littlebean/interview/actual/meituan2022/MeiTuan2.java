package com.littlebean.interview.actual.meituan2022;

import java.util.Scanner;

public class MeiTuan2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
            ans[i]=scanner.nextInt();
        int[] minn=new int[n];
        int[] maxn=new int[n];
        minn[0]=0;
        maxn[n-1]=0;
        for(int i=1;i<n;i++){
            if(ans[i - 1]>=0){
                minn[i]=minn[i-1]+1;
            }else {
                minn[i]=minn[i-1];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ans[i + 1]<=0){
                maxn[i]=maxn[i+1]+1;
            }else {
                maxn[i]=maxn[i+1];
            }
        }
        int res=Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            System.out.print(minn[i]+" ");
//        }
//        System.out.println();
//        for (int i=0;i<n;i++){
//            System.out.print(maxn[i]+" ");
//        }
//        System.out.println();
        for(int i=0;i<n;i++){
            int cur = minn[i] + maxn[i];
            if (ans[i] == 0) {
                cur += 1;
            }
            res=Math.min(res, cur);
        }
        System.out.println(res);
    }
}
