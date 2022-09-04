package com.littlebean.interview.actual.xiaohs2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XiaoHS3 {
    static int ans=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int k=scanner.nextInt();
        int[] start=new int[m];
        int[] end=new int[m];
        int[] value=new int[m];
        for(int i=0;i<m;i++){
            start[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            end[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            value[i]=scanner.nextInt();
        }
        boolean[] visited=new boolean[n+2];
        visited[1]=true;
        dfs(visited,start, end, value, m, 1, n, n, 0, 0, k);
        System.out.println(ans);
    }

    public static void dfs(boolean[] visited, int[] start, int[] end, int[] value, int m, int current, int target, int n, int cost, int deep, int limit){
        if(deep>limit+1){
            return;
        }
        if(current==target){
            ans=Math.min(ans,cost);
            return;
        }
        for(int i=0;i<m;i++){
            if(start[i]==current){
                if(!visited[i]){
                    visited[end[i]]=true;

                    dfs(visited,start, end, value, m, end[i], n, n, cost+value[i], deep+1, limit);
                    visited[end[i]]=true;
                } else if(end[i]==current){
                    if(!visited[i]){
                        visited[start[i]]=true;

                        dfs(visited,start, end, value, m, start[i], n, n, cost+value[i], deep+1, limit);
                        visited[start[i]]=true;
                    }
                }
            }
        }
    }
}

class Edge{
    int end;
    int weight;
    Edge(){}
    Edge(int end, int weight){
        this.end=end;
        this.weight=weight;
    }
}