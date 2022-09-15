package com.littlebean.interview.actual.mayi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaYi2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        ArrayList<Integer>[] edges=new ArrayList[n+2];
        int[] value=new int[n+2];
        for(int i=0;i<=n;i++){
            edges[i]=new ArrayList<>();
            value[i]=1;
        }

        for(int i=0;i<n-1;i++){
            int start=scanner.nextInt();
            int end=scanner.nextInt();
            edges[start].add(end);
        }

        long ans=0;
        for(int i=1;i<=n;i++){
            if(i==value[i]){
                continue;
            }
            ans+=(i-value[i]);

            plusOne(edges, value, i, i-value[i]);

        }
        System.out.println(ans);
    }

    public static void plusOne(ArrayList[] edge, int[] value, int k, int plusValue){
        value[k]+=plusValue;
        for(int i=0;i< edge[k].size();i++){
            int nextK=Integer.parseInt(edge[k].get(i).toString());
            plusOne(edge, value, nextK, plusValue);
        }
    }
}


