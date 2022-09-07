package com.littlebean.interview.actual.guangfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuangFa1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(isPalindromeBit(n));
    }
    public static boolean isPalindromeBit (int n) {
        // write code here
        if(n==0){
            return true;
        }
        List<Integer> list=new ArrayList<>();
        while (n!=0){
            int temp=n%2;
            list.add(temp);
            n=n>>1;
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        for(int i=0,j=list.size()-1;i<j;i++,j--){
            if(list.get(i)!=list.get(j)){
                return false;
            }
        }
        return true;
    }
}
