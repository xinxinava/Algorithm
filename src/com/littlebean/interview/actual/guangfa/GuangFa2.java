package com.littlebean.interview.actual.guangfa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GuangFa2 {


    public static String printEmail (String str) {
        // write code here

        List<String> email=myEmail(str);
        if(email.size()==0){
            return "false";
        }else {
            String s="true";
            for(int i=0;i<email.size()-1;i++){
                s+=email.get(i)+" ";
            }
            s+=email.get(email.size()-1);
            System.out.println(s);
            return s;
        }

    }


    public static List<String> myEmail(String s){

        List<String> list=splitS(s);
        List<String> ans=new ArrayList<>();

        for(int i=0;i<list.size();i++){

            String str=list.get(i);
            String[] strings=str.split("@");
            if(strings.length!=2||!isStr1(strings[0])||!isStr2(strings[1])){
                continue;
            }
            ans.add(list.get(i));
        }

        return ans;
    }

    public static List<String> splitS(String s){
        Set<Character> set=new HashSet<>();
        for(char i='1';i<='9';i++){
            set.add(i);
        }
        for(char i='a';i<='z';i++){
            set.add(i);
        }
        for(char i='A';i<='Z';i++){
            set.add(i);
        }
        set.add('_');
        set.add('.');
        set.add('-');

        List<String> list=new ArrayList<>();
        String ss="";
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                if(ss.length()!=0){
                    list.add(ss);
                }
                ss="";
            }else {
                ss=ss+s.charAt(i);
            }
        }
        return list;
    }

    public static boolean isStr1(String s){

        if(s.length()<2){
            return false;
        }

        int idx=0;

        while (idx<s.length()){
            char c=s.charAt(idx);
            if(idx==0){
                if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')||c=='_'){
                    idx++;
                }else {
                    return false;
                }
            }else {
                if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')||c=='_'||c=='.'||c=='-'){
                    idx++;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isStr2(String s){
        String[] strs=s.split("/.");
        if(strs.length==1||strs[strs.length-1].length()<2){
            return false;
        }

        for(int k=0;k<strs.length;k++){
            if(k!=strs.length-1){
                if(!isAt(strs[k])){
                    return false;
                }
            }else {
                if(!isDian(strs[strs.length-1])){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isAt(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static boolean isDian(String s){
        if(s.length()<2){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }
}
