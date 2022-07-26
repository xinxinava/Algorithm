package com.littlebean.interview.practice.baidu20201;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baidu202020 {
    public static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        System.out.println(dfs(n,k));
    }
    public static int dfs(int n, int k){
        if((n-k)%2!=0||(n<=k+1)){
            return 1;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        cache.put(n, dfs((n-k)>>1, k) + dfs((n+k)>>1, k));
        return cache.get(n);
    }
}
