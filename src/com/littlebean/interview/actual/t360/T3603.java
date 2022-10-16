package com.littlebean.interview.actual.t360;

import java.util.Scanner;

public class T3603 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        long res=0;
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            res+=nums[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res+=(nums[i]|nums[j]);
            }
        }
        System.out.println(res);

    }
}
