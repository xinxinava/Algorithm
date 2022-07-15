package com.littlebean.nowcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BM54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                break;
            }
            if(i>0&&num[i]==num[i-1]){
                continue;
            }
            int left=i+1;
            int right=num.length-1;
            while (left<right){
                int sum=num[i]+num[left]+num[right];
                if(sum==0){
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.add(num[i]);
                    arr.add(num[left]);
                    arr.add(num[right]);
                    res.add(arr);
                    while (left<right&&num[left]==num[left+1]){
                        left++;
                    }
                    while (left<right&&num[right]==num[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;
    }
}
