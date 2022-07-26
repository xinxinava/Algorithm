package com.littlebean.interview.actual.keda2022;

import java.util.Scanner;

public class Keda20221 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        long[] x=new long[N];
        for (int i=0;i<N;i++){
            x[i]=scanner.nextInt();
        }
        long[] y=new long[N];
        double PI= 3.1415927;
        for(int i=0;i<N;i++){
            y[i]=Math.round(x[i]*0.5 *(1-Math.cos((2*PI*i)/N)));
            System.out.print(y[i]+" ");
        }

    }
}
