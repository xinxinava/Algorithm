package com.littlebean.nowcode.backtracking;

import java.util.ArrayList;
import java.util.Stack;

public class BM60 {
    public ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> res=new ArrayList<>();
        backtracking("",0,0,n,res);
        return res;
    }
    public void backtracking(String s, int open, int close, int n, ArrayList<String > res){
        if(s.length()==n<<1){
            res.add(s);
            return;
        }
        if(open<n){
            backtracking(s+"(",open+1,close,n,res);
        }
        if(close<open){
            backtracking(s+")",open,close+1,n,res);
        }
    }
}
