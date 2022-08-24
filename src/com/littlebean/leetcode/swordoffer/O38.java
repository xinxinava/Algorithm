package com.littlebean.leetcode.swordoffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class O38 {
    public String[] permutation(String s) {
        List<String> ans=new ArrayList<>();
        StringBuilder path=new StringBuilder();
        boolean[] visited=new boolean[s.length()];
        Set<String> set=new HashSet<>();
        dfs(s, ans, path, visited, set, 0);
        String[] res=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }

    public void dfs(String s, List<String> ans, StringBuilder path, boolean[] visited,Set<String > set, int idx){
        if(path.length()==s.length()){
            String temp=path.toString();
            if(!set.contains(temp)) {
                set.add(temp);
                ans.add(temp);
            }
            return;
        }
        for(int i=0;i<s.length();i++){
            if(!visited[i]){
                visited[i]=true;
                path.append(s.charAt(i));
                dfs(s, ans, path, visited, set, idx+1);
                path.deleteCharAt(path.length()-1);
                visited[i]=false;
            }
        }

    }
}
