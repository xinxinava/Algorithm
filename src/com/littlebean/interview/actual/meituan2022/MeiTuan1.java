package com.littlebean.interview.actual.meituan2022;

import java.util.Scanner;

public class MeiTuan1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            int sum=x+y;
            int res=sum/3;

            if (res > Math.min(x, y)) {
                res = Math.min(x, y);
            }


//            if(res>=x&&res>=y){
//                res=res;
//            }else if(res>=x&&res<y){
//                res=y;
//            }else if(res<x&&res>=y){
//                res=x;
//            }
            System.out.println(res);
        }
    }
}
