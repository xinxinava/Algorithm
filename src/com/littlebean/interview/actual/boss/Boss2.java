package com.littlebean.interview.actual.boss;

import java.util.Scanner;

public class Boss2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        while (n>9){
            int mulit=1;
            while (n>0){
                mulit=mulit*(n%10);
                n=n/10;
            }
            n=mulit;
            count++;
        }
        System.out.println(count);
    }
}
