package com.littlebean.nowcode.doublepointer;

import com.littlebean.util.Interval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BM90 {
    //滑动窗口，左右指针
    public String minWindow (String S, String T) {
        // write code here
        if(S==""||S==null||T==""||T==null||S.length()<T.length()){
            return "";
        }
        int[] need=new int[128];
        int[] window=new int[128];
        for(int i=0;i<T.length();i++){
            need[T.charAt(i)]++;
        }
        int left=0, right=0;
        int count=0;
        int minLen=S.length()+1;
        String res="";
        while (right<S.length()){
            char c=S.charAt(right);
            window[c]++;
            if(need[c]>0&&need[c]>=window[c]){
                count++;
            }
            while (count==T.length()){
                c=S.charAt(left);
                if(need[c]>0&&need[c]>=window[c]){
                    count--;
                }
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    res=S.substring(left, right+1);
                }
                window[c]--;
                left++;
            }
            right++;
        }
        return res;
    }
}
