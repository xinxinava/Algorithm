package com.littlebean.other;

import java.util.Scanner;

public class Huaw {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        System.out.println(strStr(a, b));
    }

    public static int strStr(String a, String b){
        int m=a.length(), n=b.length();
        if(n==0){
            return 0;
        }
        if(m==0&&n!=0){
            return -1;
        }
        for(int i=0;i<m;i++){
            if(b.charAt(0)==a.charAt(i)){
                String temp=a.substring(i);
                if(checked(temp, b)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean checked(String a, String b){
        int m=a.length(), n=b.length();
        if(m<n){
            return false;
        }
        for(int i=0;i<n;i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
