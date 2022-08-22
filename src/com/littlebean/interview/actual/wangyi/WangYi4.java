package com.littlebean.interview.actual.wangyi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WangYi4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] ans=new int[n];

        Map<Integer, Map<Integer, Integer>> cache =new HashMap<>();
        int anser = 0;

        for(int i=0;i<n;i++){
            ans[i]=scanner.nextInt();
            Map<Integer, Integer> value = cache.getOrDefault(ans[i], new HashMap<>());


            for (Map.Entry<Integer, Map<Integer, Integer>> entry : cache.entrySet()) {
                int key = entry.getKey();
                Map<Integer, Integer> mapValue = entry.getValue();

                if (key > ans[i]) {
                    for (Map.Entry<Integer, Integer> e : mapValue.entrySet()) {
                        int kk = e.getKey();
                        int vv = e.getValue();
                        mapValue.put(kk, vv + 1);
                    }
                } else if (key == ans[i]) {
                    for (Map.Entry<Integer, Integer> e : mapValue.entrySet()) {
                        anser += e.getValue();
                    }
                }
            }

            value.put(i, 0);
            cache.put(ans[i], value);
        }

        System.out.println(anser);

//        for (Map.Entry<Integer, Map<Integer, Integer>> entry : cache.entrySet()) {
//            int mapKey = entry.getKey();
//            Map<Integer, Integer> mapValue = entry.getValue();
//
//            System.out.println(mapKey);
//
//            for (Map.Entry<Integer, Integer> e : mapValue.entrySet()) {
//                int kk = e.getKey();
//                int vv = e.getValue();
//
//                System.out.println("index = " + kk + " value = " + vv);
//            }
//        }

//        System.out.println(count);
    }
}
