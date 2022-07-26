package com.littlebean.interview.practice.iflytek721;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(changNum(3));
    }
    public static long changNum(long num){
        int count=0;
        long temp=num;
        int countZero=0;
        while (temp!=0){
            countZero+=(temp%2==0?1:0);
            count++;
            temp=temp/2;
            if (countZero == 2) {
                return (long)(num+Math.pow(2,count-1));
            }
        }
        if(countZero==1){
            return (long)(num+Math.pow(2,count));
        }else {
            return (long)(num+Math.pow(2,count)+Math.pow(2,count+1));
        }
    }

}
