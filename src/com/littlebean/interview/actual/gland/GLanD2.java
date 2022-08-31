package com.littlebean.interview.actual.gland;

import java.util.Scanner;

public class GLanD2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[] left=new int[m];
        int[] right=new int[m];
        int[] num=new int[m];
        for(int i=0;i<m;i++){
            left[i]=scanner.nextInt();
            right[i]=scanner.nextInt();
            num[i]=right[i]-left[i]+1- scanner.nextInt();
        }
        for(int i=0;i<m-1;i++){
            for(int r=i+1; r<m;r++){
                if(left[i]>left[r]||(left[i]==left[r]&&right[i]>right[r])){
                    int temp=0;
                    temp=left[i]; left[i]=left[r]; left[r]=temp;
                    temp=right[i]; right[i]=right[r]; right[r]=temp;
                    temp=num[i]; num[i]=num[r]; num[r]=temp;
                }
            }
        }
        int ans=n;
        for(int i=0;i<m-1;i++){
            if(right[i]<left[i+1]){
                ans-=num[i];
            }else {
                int union=right[i]-left[i+1]+1;
                if(num[i]>=union&&num[i+1]>=union){
                    ans-=num[i]+num[i+1]-union;
                }else if(num[i]>=union&&num[i+1]<union){
                    ans-=num[i];
                }else if(num[i]<union&&num[i+1]>=union){
                    ans-=num[i+1];
                }else {
                    ans-=Math.min(num[i],num[i+1]);
                }
                i++;
            }
        }
        System.out.println(ans);
    }

}
