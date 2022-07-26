package com.littlebean.interview.practice.baidu20201;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baidu202019 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n ,m;
            n = sc.nextInt();
            m = sc.nextInt();
            List<Money> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                int nums = sc.nextInt();
                Money money = new Money(value,nums);
                list.add(money);
            }
            Collections.sort(list,(o1,o2) -> o2.value- o1.value);

            int ans  = 0;
            // 第一种情况把大于工资的花完
            for (int i = 0; i < list.size(); i++) {
                //先把大钱用完

                Money money  = list.get(i);
                if (money.value < m)
                    break;
                ans += money.nums;
                money.nums = 0;
            }


            while (true){
                int res = m;
                for (int i = 0; i < list.size(); i++) {
                    Money tmp = list.get(i);
                    if (tmp.nums == 0)
                        continue;

                    int need = res / tmp.value;
                    if (need > tmp.nums)
                        need = tmp.nums;

                    res = res - need * tmp.value;
                    tmp.nums -= need;
                }

                // 到这里所有可用的面额都大于 res ,从小开始补余额
                for (int i = list.size() -1; i >= 0 && res>0; i--) {
                    Money tmp = list.get(i);
                    if (tmp.nums == 0)
                        continue;

                    int need = Math.max(res / tmp.value ,1 );
                    need = Math.min(need, tmp.nums);

                    tmp.nums = tmp.nums - need;
                    res -= need * tmp.value;
                }
                if (res >0)
                    break;
                ans++;

            }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("value :"+list.get(i).value + " nums:"+list.get(i).nums);
//        }
            System.out.println(ans);
    }
}

class Money{
    int value;
    int nums;
    Money(int value, int nums){
        this.value=value;
        this.nums=nums;
    }
}