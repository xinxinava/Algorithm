package com.littlebean.interview.actual.xiaohs2;

import java.util.Arrays;
import java.util.Scanner;

public class XiaoHS2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];

        int negative_count=0;
        int clost_idx=0;
        int small_idx=0;
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            if(nums[i]<0){
                negative_count+=1;
                nums[i]=-nums[i];
            }
            if(Math.abs(7-nums[i])<Math.abs(7-nums[clost_idx])){
                clost_idx=i;
            }
            if(nums[small_idx]>nums[i]){
                small_idx=i;
            }
        }
        if(small_idx==clost_idx&&negative_count%2==1){
            clost_idx=(clost_idx+1)%n;
            for(int i=0;i<n;i++){
                if(i!=small_idx&&Math.abs(7-nums[i])<Math.abs(7-nums[clost_idx])){
                    clost_idx=i;
                }
            }
        }

        long res=0;
        for(int i=0;i<n;i++){
            if(negative_count%2==1&&i==small_idx){
                res+=nums[i]+1;
                continue;
            }
            if(i==clost_idx){
                res+=Math.abs(nums[i]-7);
            }else {
                res+=Math.abs(nums[i]-1);
            }
        }
        System.out.println(res);

    }
}
