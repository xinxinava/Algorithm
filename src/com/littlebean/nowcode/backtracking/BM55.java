package com.littlebean.nowcode.backtracking;

import java.util.ArrayList;

public class BM55 {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> path=new ArrayList<>();
        backtracking(num, res, path);
        return res;
    }

    public void backtracking(int[] num, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> path){
        if(path.size()==num.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<num.length;i++) {
            if(path.contains(num[i])) {
                continue;
            }
            path.add(num[i]);
            backtracking(num, res, path);
            path.remove(path.size() - 1);
        }
    }

}
