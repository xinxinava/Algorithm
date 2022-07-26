package com.littlebean.nowcode.doublepointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BM92 {
    public int maxLength (int[] arr) {
        // write code here
        int maxn=0;
        Map<Integer, Integer> map=new HashMap<>();
        int left=0, right=0;
        while (right<arr.length){
            if(map.containsKey(arr[right])){
                maxn=Math.max(maxn, right-left);
                left=map.get(arr[right])+1;
                right=map.get(arr[right])+1;
                map.clear();
            }
            map.put(arr[right], right);
            right++;
        }
        maxn=Math.max(maxn, arr.length-left);

        return maxn;
    }
}
