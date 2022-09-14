package com.littlebean.interview.actual.weizhong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeiZhong3 {
    public static int mode=998244353;
    public static int res=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();

        List<Integer> path=new ArrayList<>();
        dfs(n,m,path);

        System.out.println(res);
    }

    public static void dfs(int n, int m, List<Integer> path){
        if(path.size()==n){
            if(lengthLIS(path)==3) {
                res = res + 1;
                res = res % mode;
            }
            return;
        }
        for(int i=1;i<=m;i++){
            path.add(i);
            dfs(n,m, path);
            path.remove(path.size()-1);
        }
    }

    public static int lengthLIS(List<Integer> nums){
        if(nums.size()==0){
            return 0;
        }
        int[] dp=new int[nums.size()];
        dp[0]=1;
        int maxn=1;
        for(int i=1;i<nums.size();i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums.get(i)>nums.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxn=Math.max(maxn, dp[i]);
        }
        return maxn;
    }
}
