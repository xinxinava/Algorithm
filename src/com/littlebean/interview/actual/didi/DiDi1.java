package com.littlebean.interview.actual.didi;

import java.util.*;

public class DiDi1 {
    static int ans=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        ans=n;
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.add(scanner.nextInt());
        }
        Collections.sort(nums);
        dfs(nums, m);
        System.out.println(ans);
    }

    public static void dfs(List<Integer> nums, int m){
        if(nums.size()==0){
            return;
        }
        if(check(nums, m)){
            ans=Math.min(ans,nums.size());
            return;
        }
        int temp=nums.get(0);
        nums.remove(0);
        dfs(nums, m);
        nums.add(0,temp);
        temp=nums.get(nums.size()-1);
        nums.remove(nums.size()-1);
        dfs(nums, m);
        nums.add(nums.size(), temp);
    }

    public static boolean check(List<Integer> nums, int m){
        int sum=0;
        int maxn=0;
        for(int num:nums){
            sum+=num;
            maxn=Math.max(maxn, num);
        }
        return 1.0*maxn/sum*nums.size()<=m;
    }
}
