package com.littlebean;

import com.littlebean.util.Interval;

import java.util.*;

public class Test {
    String str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Test ex = new Test();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str +"and");
        System.out.print(ex.ch);
    }

    public void change(String str, char ch[]){
        str= "111";
        ch[0]= 'g';
    }
}