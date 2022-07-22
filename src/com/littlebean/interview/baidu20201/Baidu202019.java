package com.littlebean.interview.baidu20201;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baidu202019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        List<Money> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=scanner.nextInt();
            int num=scanner.nextInt();
            Money money=new Money(value, num);
            list.add(money);
        }
        Collections.sort(list, (o1, o2) -> o2.value-o1.value);
    }
}

class Money{
    int value;
    int num;
    Money(int value, int num){
        this.value=value;
        this.num=num;
    }
}