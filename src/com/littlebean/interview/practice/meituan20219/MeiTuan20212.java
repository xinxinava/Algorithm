package com.littlebean.interview.practice.meituan20219;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class MeiTuan20212 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        long res=0;
        for(int i=1;i<=n;i++){
            res+=Math.abs(nums[i-1]-i);
        }
        System.out.println(res);

    }
}
