package com.littlebean.interview.actual.tianyiyun;

import java.util.*;

public class TianYiYun1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] nums = new int[n][2];

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] temp = s.split(",");
            int start = Integer.parseInt(temp[0]);
            int end = Integer.parseInt(temp[1]);

            for (int j = start+1; j <= end; j++) {
                if (map.containsKey(j)) {
                    map.put(j, map.get(j) + 1);
                } else {
                    map.put(j, 1);
                }
            }
        }

        int res=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1)
                res++;
        }
        System.out.println(res);
    }

}
