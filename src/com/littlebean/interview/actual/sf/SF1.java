package com.littlebean.interview.actual.sf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SF1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
    //    System.out.println(n+n+1);
        long res=0;
    //    System.out.println(log2(2));
        for (int i=n;i>=1;i--){
            res+=log2(i);
        //    System.out.println(i+" "+(int)log2(i));
        }
        System.out.println(res+n);
    }
    public static double log2(double N){
        return Math.log(N)/Math.log(2);
    }
}
