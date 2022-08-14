package com.littlebean.interview.actual.xinye;

import java.util.HashSet;
import java.util.Set;

public class Jin {

    public int lengthOfLongestSubstring (String s) {
        // write code here
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int right=-1;
        int res=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while (right+1<n&&!set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            res=Math.max(res, right-i+1);
        }
        return res;
    }
}
