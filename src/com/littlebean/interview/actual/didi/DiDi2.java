package com.littlebean.interview.actual.didi;

import java.util.Scanner;

public class DiDi2 {
    static int maxn=70000+2;
    static int[] cache=new int[maxn];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] left=new int[n];
        int[] right=new int[n];
        int[] k=new int[n];

        for(int i=0;i<n;i++){
            left[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            right[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            k[i]=scanner.nextInt();
        }

        for(int i=0;i<n;i++){
            int ans=0;
            for(int l=left[i];l<=right[i];l++){
                if(check(l,k[i])){
                    ans+=1;
                }
            }
            System.out.println(ans);
        }

    }

    public static boolean check(int num, int k){
        int temp=num;
        if(cache[num]!=0){
            return cache[num]==k;
        }
        int value=0;
        while (num>0){
            value^=(num%10);
            num=num/10;
        }
        cache[temp]=value;
        return value==k;
    }
}
