package com.littlebean.interview.actual.weizhong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WeiZhong2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int T=scanner.nextInt();
        for(int t=0;t<T;t++){
            int init=scanner.nextInt();
            int target=scanner.nextInt();

            System.out.println(compute(init, target));
        }
    }

    public static int compute(int init, int target){
        if(init==target){
            return 0;
        }

        Set<Integer> set=new HashSet<>();
        int res=0;
        set.add(init);

        while (init!=target){

            if(init<target){
                if(init*8>target){
                    if(init*4>target){
                        init=init*2;
                    }else {
                        init=init*4;
                    }
                }else {
                    init=init*8;
                }
            }else if(init>target){
                if(init%8==0){
                    if(init/8>=target){
                        init=init/8;
                    }else{
                        if(init%4==0) {
                            if (init / 4 >= target) {
                                init = init / 4;
                            } else {
                                if (init % 2 == 0) {
                                    init = init / 2;
                                } else {
                                    return -1;
                                }
                            }
                        }
                    }
                }else if(init%4==0){
                    if(init/4>=target){
                        init=init/4;
                    }else {
                        if(init%2==0){
                            init=init/2;
                        }else {
                            return -1;
                        }
                    }
                }else if(init%2==0){
                    init=init/2;
                }else {
                    return -1;
                }
            }
            res++;
          //  System.out.println(init);
            if(set.contains(init)){
                return -1;
            }
            set.add(init);
        }
        return res;

    }
}
/**
 * 4
 * 3 6   1
 * 16 2  1
 * 12 4  -1
 * 1024 1 4
 */