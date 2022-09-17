package com.littlebean.leetcode.graph;

public class L547 {
    //省份数量，判断连通图的数量
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int res=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false) {
                dfs(isConnected, visited, i);
                res++;
            }
        }
        return res;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int start){
        if(visited[start]==true){
            return;
        }
        visited[start]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[start][i]==1&&visited[i]==false){
                dfs(isConnected, visited, i);
            }
        }
    }
}
