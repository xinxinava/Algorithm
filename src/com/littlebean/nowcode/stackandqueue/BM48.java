package com.littlebean.nowcode.stackandqueue;

import java.util.ArrayList;
import java.util.Collections;

public class BM48 {
    ArrayList<Integer> list=new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        Collections.sort(list);
        int len=list.size();
        if(len%2!=0){
            return (double)list.get(len/2);
        }else {
            return (double)(list.get(len/2-1)+list.get(len/2))/2;
        }
    }
}
