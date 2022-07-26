package com.littlebean.interview.actual.nio2022;

import java.util.*;

public class Noi20221 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            Set<Integer> set=new HashSet<>();
            set.add(x);
            set.add(y);
            List<Integer> list=new ArrayList<>();
            list.add(x);
            list.add(y);
            int m=Math.abs(x-y);
            while (true){
                int j;
                boolean flag = false;
                for( j=0;j<list.size()-1;j++){
                    m=Math.abs(list.get(j)-list.get(list.size()-1));
//                    System.out.println("j = " + j + " m = " + m);
                    if(!set.contains(m)){
                        list.add(m);
                        set.add(m);
                        flag = true;
                        break;
                    }
                }
//                System.out.println(list);

                if (flag) {
                    continue;
                }

                if(j==list.size()-1&&j!=1){
                    break;
                }
            }

            if(list.size()%2==0){
                System.out.println("B");
            }else {
                System.out.println("A");
            }
        }
    }
}
