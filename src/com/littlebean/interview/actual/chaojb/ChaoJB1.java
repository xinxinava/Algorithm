package com.littlebean.interview.actual.chaojb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChaoJB1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int k=0;k<T;k++){
            int n=scanner.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=scanner.nextInt();
                map.put(i,nums[i]);
            }
            int res=0;
            for(int i=0;i<n;i++){
                if(map.containsValue(nums[i]*2)) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}

//        2
//        6
//        1 3 5 7 9 11
//        7
//        6 2 4 3 33 10 1