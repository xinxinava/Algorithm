package com.littlebean.interview.actual.wangyi;

import java.util.Scanner;

public class WangYi1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int x= (int) (Math.random() * 6);
        System.out.println(x - 1);
    }
}
