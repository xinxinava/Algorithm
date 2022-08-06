package com.littlebean.interview.actual.meituan2022;

import java.util.Scanner;

public class MeiTuan3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums1=new int[n];
        int[] nums2=new int[n];
        int base=1000000000;
        int[] ans=new int[base+1];
        int N = 0;

        for(int i=0;i<n;i++) {
            nums1[i] = scanner.nextInt();
            ans[nums1[i]]++;
            N = Math.max(N, nums1[i]);
        }
        for(int i=0;i<n;i++){
            nums2[i]=scanner.nextInt();
            ans[nums2[i]]++;
            N = Math.max(N, nums2[i]);
        }

        System.out.println(-1);

//        int ret = Integer.MAX_VALUE;
//        for(int i=0;i<=N;i++){
//            if(ans[i]>n/2){
//                int rret = (int)Math.ceil(1.0 * n / 2);
//
//                for(int r = 0; r < n ; r++) {
//                    if(nums1[r] == i){
//                        rret -= 1;
//
//                        if (nums2[r] == i) {
//                            rret += 1;
//                        }
//                    }
//                }
//
//                int count = 0;
//                for (int r = 0; r <n; r++) {
//                    if (nums2[r] == i && nums1[r] != i) {
//                        count += 1;
//                    }
//                }
//
//                if (rret <= count) {
//                    ret = Math.min(ret, rret);
//                }
//
//            }
//        }
//        if(ret == Integer.MAX_VALUE){
////            System.out.println(-1);
//            return;
//        }
////        System.out.println(ret);
    }
}
