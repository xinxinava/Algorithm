package com.littlebean.interview.actual.tuhu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TuHu2 {
    //完全背包
    public int change (int[] oils, int box) {
        // write code here
        int maxn=Integer.MAX_VALUE;
        int[] dp=new int[box+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=maxn;
        }
        dp[0]=0;
        for(int i=0;i<oils.length;i++){
            for(int j=oils[i];j<=box;j++){
                if(dp[j-oils[i]]!=maxn){
                    dp[j]=Math.min(dp[j],dp[j-oils[i]]+1);
                }
            }
        }
        return dp[box]==maxn?-1:dp[box];


    }
//        int n=oils.length;
//        List<List<Integer>> list=new ArrayList<>();
//        List<Integer> path=new ArrayList<>();
//        dfs(oils, 0, box, list, path);
//        int minn=Integer.MAX_VALUE;
//        for(int i=0;i<list.size();i++){
//            minn=Math.min(minn,list.get(i).size());
//        }
//        if (minn==Integer.MAX_VALUE){
//            return -1;
//        }
//        return minn;
//    }
//    public void dfs(int[] oils, int start, int box, List<List<Integer>> list, List<Integer> path){
//        if(box<0){
//            return;
//        }
//        if(box==0){
//            list.add(new ArrayList<>(path));
//            return;
//        }
//        for(int i=start;i<oils.length;i++){
//            path.add(oils[i]);
//            dfs(oils, i, box-oils[i], list, path);
//            path.remove(path.size()-1);
//        }
//    }
}
