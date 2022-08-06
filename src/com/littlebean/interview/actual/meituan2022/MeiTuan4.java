package com.littlebean.interview.actual.meituan2022;

import java.util.Scanner;

public class MeiTuan4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] nums=new int[n];
        int[] count = new int[100 + 2];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            count[nums[i]] += 1;
        }

        for(int i = 0; i < 100 + 2; i++) {
            if (count[i] != 0)
                count[i] = (int)Math.ceil(1.0 * count[i] / 2);
        }

        int [] train = new int[n];
        int [] test = new int[n];
        int train_i = -1;
        int test_i = -1;

        for(int i = 0; i < n; i++){
            if (count[nums[i]] > 0) {
                train[++train_i] = i + 1;
                count[nums[i]] -= 1;
            } else {
                test[++test_i] = i + 1;
            }
        }

        for (int i = 0; i <= train_i - 1; i++)
            System.out.print(train[i] + " ");
        System.out.println(train[train_i]);
        for (int i = 0; i < test_i; i++)
            System.out.print(test[i] + " ");
        System.out.println(test[test_i]);
    }
}
