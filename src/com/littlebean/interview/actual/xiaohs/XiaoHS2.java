package com.littlebean.interview.actual.xiaohs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XiaoHS2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        long k=scanner.nextLong();
        long[] nums=new long[(int)n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextLong();
        }
        long res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]*nums[j]>=k){
                    res++;
                }
            }
        }
        System.out.println(res*2);
   //     Arrays.sort(nums);


    }
}
