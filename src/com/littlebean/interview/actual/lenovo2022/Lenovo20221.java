package com.littlebean.interview.actual.lenovo2022;

import java.util.Scanner;

public class Lenovo20221 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            long a1=scanner.nextInt();
            long b1=scanner.nextInt();
            long c1=scanner.nextInt();
            long a2=scanner.nextInt();
            long b2=scanner.nextInt();
            long c2=scanner.nextInt();
            long res1=0;
            long res2=0;
            if(c1%a1!=0){
                res1=(c1/a1)*b1;
            }else {
                res1=(c1/a1-1)*b1;
            }
            if(c2%a2!=0){
                res2=(c2/a2)*b2;
            }else {
                res2=(c2/a2-1)*b2;
            }
//            System.out.println(res1+" "+res2);
            if(res1==res2){
                System.out.println("A&B");
            }else if(res1>res2){
                System.out.println("B");
            }else {
                System.out.println("A");
            }
        }
    }
}
