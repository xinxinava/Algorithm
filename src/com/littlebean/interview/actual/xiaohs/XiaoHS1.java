package com.littlebean.interview.actual.xiaohs;

import java.lang.reflect.Array;
import java.util.*;

public class XiaoHS1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int id=scanner.nextInt();
        Map<Integer, Long> map=new TreeMap<>();
        for(int i=1;i<=n;i++){
            long sum=0;
            for(int j=0;j<m;j++){
                int temp=scanner.nextInt();
                sum+=temp;
            }
            map.put(i, sum);
        }
        Comparator<Map.Entry<Integer, Long>> valueComparator=new Comparator<Map.Entry<Integer, Long>>() {
            @Override
            public int compare(Map.Entry<Integer, Long> o1, Map.Entry<Integer, Long> o2) {
                if(o1.getValue()==o2.getValue()){
                    return o1.getKey()-o2.getKey();
                }
                return (int)(o2.getValue()-o1.getValue());
            }
        };
        List<Map.Entry<Integer, Long>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, valueComparator);
        for(int i=0;i<list.size();i++){
        //    System.out.println(list.get(i));
            if(list.get(i).getKey()==id){
                System.out.println(i+1);
            }
        }
    }
}
