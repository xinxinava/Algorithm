package com.littlebean.interview.practice.meituan20219;

import java.util.Arrays;
import java.util.Scanner;

public class MeiTuan202191 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        scanner.nextLine();
        int[] score=new int[n];
        for(int i=0;i<n;i++){
            score[i]=scanner.nextInt();
        }
        Arrays.sort(score);
        if(2*x>n||n>2*y){
            System.out.println(-1);
        }
        if(x+y>=n){
            System.out.println(score[x-1]);
        }else {
            System.out.println(score[n-y]);
        }
    }
}
