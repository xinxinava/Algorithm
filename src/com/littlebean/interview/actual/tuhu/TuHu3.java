package com.littlebean.interview.actual.tuhu;

import java.util.*;

public class TuHu3 {
    public int minimumIncompatibility (int[] nums, int k) {
        // write code here

        int n=nums.length;
        if((n%k)!=0){
            return -1;
        }

        Arrays.sort(nums);

        int maxn=0;
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
            maxn=Math.max(maxn, map.get(nums[i]).size());
        }
        if(maxn>k){
            return -1;
        }

        int block=n/k;
        if(k==n){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(List<Integer> list:map.values()){
            if(list.size()>1){
                int res=0;
                for(int i:list){
                    res|=(1<<i);
                }
                set.add(res);
            }
        }
        int[] dp=new int[1<<n];
        Arrays.fill(dp, -1);
        for(int i=1;i<(1<<n);i++){
            int bit=Integer.bitCount(i);
            if(bit==block) {
                boolean f = false;
                for (int s : set) {
                    if (Integer.bitCount(i & s) > 1) {
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    int low = Integer.lowestOneBit(i);
                    int high = Integer.highestOneBit(i);
                    int li = -1;
                    int hi = -1;
                    while (low > 0) {
                        li++;
                        low >>= 1;
                    }
                    while (high > 0) {
                        hi++;
                        high >>= 1;
                    }
                    dp[i] = nums[hi] - nums[li];
                }
            }else if(bit>block&&bit%block==0){
                    dp[i]=Integer.MAX_VALUE;
                    for(int j=i;j!=0;j=(j-1)&i){
                        if(Integer.bitCount(j)%block==0&&Integer.bitCount(i^j)%block==0&& dp[j]!=-1&&dp[i^j]!=-1){
                            dp[i]=Math.min(dp[i],dp[i^j]+dp[j]);
                        }
                    }
                    if(dp[i]==Integer.MAX_VALUE){
                        dp[i]=-1;
                    }
                }
            }


        return dp[1<<n-1];
    }
}
