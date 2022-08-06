package com.littlebean.interview.actual.meituan2022;

import java.util.Scanner;

public class MeiTuan5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextInt();
        StringBuilder s=new StringBuilder("MeiTuan");
        for(long i=0;i<n;i++){
            long x=scanner.nextInt();

            while (s.length() < x){
                s.append(s.reverse()).append("wow");
            }

            System.out.println();

            System.out.println(Integer.MAX_VALUE);
        }
    }
}
