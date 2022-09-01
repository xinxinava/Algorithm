package com.littlebean.interview.actual.bilibili;

import java.util.*;

public class Bilibili1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=2;i<=n;i++){
            map.put(i,new ArrayList<>());
            for(int j=2;j<i;j++){
                if(i%j==0){
                    map.get(i).add(j+map.get(i/j).get(0));
                }
            }
            if(map.get(i).size()==0){
                map.get(i).add(i);
            }
            Collections.sort(map.get(i));
        }
        System.out.println(map.get(n).get(0));
    }
}
