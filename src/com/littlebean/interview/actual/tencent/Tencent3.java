package com.littlebean.interview.actual.tencent;

import java.util.Scanner;

public class Tencent3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        int left=0, right=n-1;
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                //大Q
                if(nums[left]>nums[right]){
                    res[idx]=nums[left];
                    left++;
                }else {
                    res[idx]=nums[right];
                    right--;
                }
            }else {
                if(nums[left]>nums[right]){
                    res[idx]=nums[right];
                    right--;
                }else {
                    res[idx]=nums[left];
                    left++;
                }
            }
            idx++;
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}
