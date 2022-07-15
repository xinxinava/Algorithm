package com.littlebean.nowcode.backtracking;

public class BM59 {
    int res;
    public int Nqueen (int n) {
        // write code here
        res=0;
        int[] pos=new int[n];
        dfs(n,0,pos);
        return res;
    }
    public void dfs(int n, int row, int[] pos){
        if(row==n){
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isValid(pos, row, i)){
                pos[row]=i;
                dfs(n,row+1, pos);
            }
        }
    }
    public boolean isValid(int[] pos, int row, int col){
        for(int i=0;i<row;i++){
            if(row==i||col==pos[i]||Math.abs(row-i)==Math.abs(col-pos[i])){
                return false;
            }
        }
        return true;
    }
}
