package com.littlebean.nowcode.doublepointer;

import com.littlebean.util.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BM89 {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> res=new ArrayList<>();
        if(intervals.size()==0){
            return res;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                if(o1.start<o2.start){
                    return -1;
                }else if(o1.end>o2.end){
                    return 1;
                }
                return 0;
            }
        });

        int left=intervals.get(0).start;
        int right=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            if(right>=intervals.get(i).start){
                if(right<intervals.get(i).end) {
                    right = intervals.get(i).end;
                }
            }else {
                res.add(new Interval(left, right));
                left=intervals.get(i).start;
                right=intervals.get(i).end;
            }
        }
        res.add(new Interval(left, right));
        return res;
    }
}
