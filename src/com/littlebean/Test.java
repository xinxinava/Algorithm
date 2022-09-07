package com.littlebean;



import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        String a="abc";
        String b=new String("abc");
        set.add(a);
        set.add(b);
        for(String s:set){
            System.out.println(s);
        }
    }


}

