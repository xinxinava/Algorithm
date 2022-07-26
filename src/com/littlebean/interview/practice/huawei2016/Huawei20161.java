package com.littlebean.interview.practice.huawei2016;

import java.util.Scanner;

public class Huawei20161 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if(n==0){
                break;
            }
            System.out.println(cola(n));
        }
    }
    public static int cola(int n){
        int res=0;
        while (n!=0){
            res+=n/3;
            n=n%3+n/3;
            if(n<=1)
                break;
            if(n==2) {
                res++;
                break;
            }
        }
        return res;
    }
}
