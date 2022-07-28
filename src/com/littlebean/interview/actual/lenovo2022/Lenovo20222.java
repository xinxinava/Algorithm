package com.littlebean.interview.actual.lenovo2022;

import java.util.Scanner;

public class Lenovo20222 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int q=scanner.nextInt();
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<q;i++){
            int t=scanner.nextInt();
            int x=scanner.nextInt();
            if(t==1){
                //第x-1行右移一位
                int temp=ans[x-1][n-1];
                for(int j=n-1;j>=1;j--)
                    ans[x-1][j]=ans[x-1][j-1];
                ans[x-1][0]=temp;
            }else if(t==2){
                //第x-1列上移一位
                int temp=ans[0][x-1];
                for(int j=1;j<n;j++)
                    ans[j-1][x-1]=ans[j][x-1];
                ans[n-1][x-1]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(ans[i][n-1]);
        }
    }
}
