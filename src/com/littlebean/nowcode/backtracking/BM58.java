package com.littlebean.nowcode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BM58 {
    public ArrayList<String> Permutation(String str) {
        boolean[] visited=new boolean[str.length()];
        ArrayList<String> res=new ArrayList<>();
        StringBuffer path=new StringBuffer();
        backtracking(str, visited, res, path);
        return res;
    }
    public void backtracking(String str, boolean[] visited, ArrayList<String> res, StringBuffer path){
        if(path.length()==str.length()&&!res.contains(path.toString())){

            res.add(path.toString());
            return;
        }
        for(int i=0; i<str.length();i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            path.append(str.charAt(i));
            backtracking(str, visited, res, path);
            path.deleteCharAt(path.length()-1);
            visited[i]=false;
        }
    }
}
