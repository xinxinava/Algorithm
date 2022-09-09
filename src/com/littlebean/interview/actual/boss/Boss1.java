package com.littlebean.interview.actual.boss;

import java.util.Scanner;

public class Boss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int gcd=0, m=a, n=b;
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a%b==0){
            gcd=b;
        }
        while (a%b!=0){
            a=a%b;
            if(a<b){
                int temp=a;
                a=b;
                b=temp;
            }
            if(a%b==0){
                gcd=b;
            }
        }
        System.out.println(m*n/gcd);
    }
}
