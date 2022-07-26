package com.littlebean.nowcode.string;

public class BM85 {
    public String solve(String IP) {
        if(IP.length()==0||IP.charAt(IP.length()-1)=='.'||IP.charAt(IP.length()-1)==':')
            return "Neither";
        String[] strs4=IP.split("\\.");
        String[] strs6=IP.split(":");
        if(isIPv4(strs4)||isIPv4(strs6))
            return "IPv4";
        if(isIPv6(strs4)||isIPv6(strs6))
            return "IPv6";
        return "Neither";
    }
    public boolean isIPv4(String[] strs){
        if(strs.length!=4)
            return false;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()==0||strs[i].length()>3)
                return false;
            for(int j=0;j<strs[i].length();j++) {
                char c=strs[i].charAt(j);
                if (c<'0'||c>'9')
                    return false;
            }
            int num=Integer.parseInt(strs[i]);
            if((strs[i].length()>1&&strs[i].charAt(0)=='0')||(num>255))
                return false;
        }
        return true;
    }
    public boolean isIPv6(String[] strs){
        if(strs.length!=8)
            return false;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()>4||strs[i].length()==0)
                return false;
            for(int j=0;j<strs[i].length();j++){
                char c=strs[i].charAt(j);
                if((c>='0'&&c<='9')||(c>='a'&&c<='f')||(c>='A'&&c<='F'))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
}
