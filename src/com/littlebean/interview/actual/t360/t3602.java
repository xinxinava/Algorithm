package com.littlebean.interview.actual.t360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t3602 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();

        for(int t=0;t<T;t++){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int[][] nums=new int[n][m];

            int maxn=-1;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    nums[i][j]=scanner.nextInt();
                    maxn=Math.max(maxn, nums[i][j]);
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(nums[i][j]!=-1) {
                        maxn = Math.max(maxn, find(nums, i, j, n, m));
                    }
                }
            }
            System.out.println(maxn);
        }
    }

    public static int find(int[][] nums, int startx, int starty, int endx, int endy){
        int ans=nums[startx][starty];
        int len=Math.min(endx-startx, endy-starty);
    //    System.out.println("len="+len);

        for(int idx=1;idx<len;idx++){
            int sum=0;
            for(int i=starty;i<starty+idx;i++){ //行
                if(nums[startx+idx][starty+i]==-1){
                    return -1;
                }
                sum+=nums[startx+idx][starty+i];
            //    System.out.println((startx+idx)+" "+(starty+i)+ " " +nums[startx+idx][starty+i]);
            }
            for(int i=startx;i<startx+idx;i++){ //列
                if(nums[startx+i][starty+idx]==-1){
                    return -1;
                }
                sum+=nums[startx+i][starty+idx];
            //    System.out.println((startx+i)+" "+(starty+idx)+ " " +nums[startx+i][starty+idx]);
            }
            if(nums[startx+idx][starty+idx]==-1){
                return -1;
            }
            sum+=nums[startx+idx][starty+idx];
            ans+=sum;
        }
        return ans;
    }

}

/**
 * 1
 * 5 6
 * 2 4 5 -1 2 4
 * 3 2 -1 -1 -1 -1
 * -1 0 9 -1 9 9
 * 0 9 5 3 -1 9
 * 5 6 -1 0 3 4
 */