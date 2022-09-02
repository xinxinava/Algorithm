package com.littlebean.interview.actual.gaotu;

import java.util.Scanner;

public class GaoTu2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
