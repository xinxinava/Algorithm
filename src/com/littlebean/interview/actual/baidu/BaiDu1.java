package com.littlebean.interview.actual.baidu;

import java.util.Scanner;

public class BaiDu1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int zan=0;
        int hui=0;
        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            if(num==1){
                hui++;
            }else if(num==2){
                zan++;
            }else if(num==3){
                if(hui==zan){
                    hui++;
                    zan++;
                }else if(hui>zan){
                    hui++;
                }else if(hui<zan){
                    zan++;
                }
            }
        }

        System.out.println(hui+" "+zan);
    }
}
