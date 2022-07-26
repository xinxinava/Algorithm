package com.littlebean.interview.practice.byte2019;

import java.util.Scanner;

public class Byte20191 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            StringBuilder ss=new StringBuilder(scanner.nextLine());
            for(int j=2;j<ss.length();j++){
                if(ss.charAt(j)==ss.charAt(j-1)&&ss.charAt(j-1)==ss.charAt(j-2)){
                    ss.deleteCharAt(j);
                    j--;
                }
                else if(isPattern(ss,j-3,j)){
                    ss.deleteCharAt(j);
                    j--;
                }
            }
            System.out.println(ss.toString());
        }
    }
    public static boolean isPattern(StringBuilder ss, int i, int j){
        if(i<0)
            return false;
        if(ss.charAt(i)==ss.charAt(i+1)&&ss.charAt(j)==ss.charAt(j-1)){
            return true;
        }
        return false;
    }
}
