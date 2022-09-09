package com.littlebean.interview.actual.t360;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class t3601 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        Integer[] nums=new Integer[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }

        for(int i=0;i<m;i++){
            int t=scanner.nextInt();
            int x=scanner.nextInt();

            if(t==0){ //asc
                Arrays.sort(nums, 0, x);
            }else{
                Arrays.sort(nums, 0, x, Collections.reverseOrder());
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
