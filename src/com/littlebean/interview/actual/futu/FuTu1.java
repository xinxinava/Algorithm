package com.littlebean.interview.actual.futu;

import java.util.*;

public class FuTu1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> map=new HashMap<>();

        for(int t=0;t<T;t++){
            int n=Integer.parseInt(scanner.nextLine());
            String s=scanner.nextLine();
            if(map.containsKey(s)){
                List<Integer> list=map.get(s);
                for(int i=0;i<list.size();i++){
                    System.out.println(list.get(i)+" ");
                }
                System.out.println();
                continue;
            }
            int zeroIdx=-2;
            int oneIdx=-2;
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    ll.add(zeroIdx+1);
                    System.out.print((zeroIdx+1)+" ");
                    oneIdx=i;
                }else{
                    ll.add(oneIdx+1);
                    System.out.print((oneIdx+1)+" ");
                    zeroIdx=i;
                }
            }
            map.put(s,ll);
            System.out.println("");
        }
    }
}
