package com.littlebean.nowcode.hash;

import java.util.HashMap;
import java.util.Map;

public class BM51 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i], 1);
            }
            if(map.get(array[i])*2>array.length)
                return array[i];
        }
        return -1;
    }
}
