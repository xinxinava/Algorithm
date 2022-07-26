package com.littlebean.interview.practice.huawei2016;

import java.util.Scanner;

public class Huawei20162 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] res=new int[500+1];
        for(int i=0;i<n;i++){
            int temp=scanner.nextInt();
            res[temp]=temp;
        }
        for(int i=1;i<=500;i++){
            if(res[i]!=0)
                System.out.println(res[i]);
        }
    }
}
