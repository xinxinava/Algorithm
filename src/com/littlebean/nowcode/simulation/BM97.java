package com.littlebean.nowcode.simulation;

import java.util.ArrayList;
import java.util.Arrays;

public class BM97 {
    public int[] solve (int n, int m, int[] a) {
        // write code here
        if(m==0||m%n==0){
            return a;
        }
        m=m%n;
        reverse(a,0, a.length-1);
        reverse(a, 0, m-1);
        reverse(a, m, a.length-1);
        return a;
    }
    public void reverse(int[] a, int start, int end){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=end;i>=start;i--){
            list.add(a[i]);
        }
        for(int i=start; i<=end;i++){
            a[i]=list.get(i-start);
        }
    }

}
