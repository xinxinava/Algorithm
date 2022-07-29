package com.littlebean.leetcode.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        Set<String> set=new HashSet<>();
        for(int i=0;i<wordDict.size();i++)
            set.add(wordDict.get(i));
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                String sub=s.substring(j,i);
                if(dp[j]==true&&set.contains(sub)){
                    dp[i]=true;
                }
            }
        }
        return dp[s.length()];
    }
}
