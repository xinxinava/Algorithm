package com.littlebean.nowcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class BM56 {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> path=new ArrayList<>();
        boolean[] visited=new boolean[num.length];
        Arrays.sort(num);
        backtracking(num, res, path, visited);
        return res;
    }

    public void backtracking(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path, boolean[] visited){
        if(path.size()==num.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<num.length;i++) {
            if(visited[i]==true){
                continue;
            }
            if(i>0&&num[i]==num[i-1]&&!visited[i-1]){
                continue;
            }
            visited[i]=true;
            path.add(num[i]);
            backtracking(num, res, path,visited);
            path.remove(path.size() - 1);
            visited[i]=false;
        }
    }
}
