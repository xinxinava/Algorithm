package com.littlebean.interview.actual.klook;

import java.sql.ClientInfoStatus;
import java.util.*;

public class KLook1 {
    static int res=0;
    public static int AmountOfCombination(int[] nums, int target) {
        //请在这里实现算法并返回结果
        Arrays.sort(nums);

        boolean[] visited=new boolean[nums.length];
        bt(nums, target, 0, visited, 0);
        return  res;
    }

    public static void bt(int[] nums, int target, int idx, boolean[] visited, int sum){
        if(sum==target){
            res++;
            return;
        }
        for(int i=idx;i<nums.length&&nums[i]+sum<=target;i++){

            if(i>idx&&nums[i-1]==nums[i]&&!visited[i-1]){
                continue;
            }
            visited[i]=true;
            sum+=nums[i];
            bt(nums, target, i+1, visited, sum);
            sum-=nums[i];
            visited[i]=false;
        }
    }
}
