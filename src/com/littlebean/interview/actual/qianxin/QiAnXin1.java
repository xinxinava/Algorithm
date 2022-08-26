package com.littlebean.interview.actual.qianxin;

public class QiAnXin1 {
    int res;
    public int DagPathNum (int[][] nodes) {
        // write code here
        res=0;
        int m=nodes.length;
        boolean[] visited=new boolean[m];
        dfs(nodes, visited,0, m-1);
        return res;
    }
    public void dfs(int[][] nodes,boolean[] visited, int idx, int end){
        if(idx==end){
            res=res+1;
            return;
        }
        for(int i=0;i<nodes[idx].length;i++){
            int next=nodes[idx][i];
            if(!visited[next]){
                visited[next]=true;
                dfs(nodes, visited, next, end);
                visited[next]=false;
            }
        }
    }
}
