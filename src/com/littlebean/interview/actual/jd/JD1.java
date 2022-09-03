package com.littlebean.interview.actual.jd;

import java.util.Arrays;
import java.util.Scanner;

public class JD1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        Arrays.sort(nums);
        int maxVal=nums[n-1];
        int res=0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]!=maxVal){
                res=i+1;
                break;
            }
        }
        System.out.println(res);
    }
}
