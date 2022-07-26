package com.littlebean.nowcode.string;

public class BM84 {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs.length==0){
            return "";
        }
        StringBuffer ss=new StringBuffer();
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()) {
                    return ss.toString();
                }
                if(strs[j].charAt(i)!=strs[0].charAt(i)){
                    return ss.toString();
                }
            }
            ss.append(strs[0].charAt(i));
        }
        return ss.toString();
    }
}
