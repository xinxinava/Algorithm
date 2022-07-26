package com.littlebean.interview.actual.nio2022;

import java.util.Scanner;

public class Noi20222 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            c[i] = scanner.nextInt();
        }

        int[][] ans=new int[n][k + 1];

        ans[0][0] = 1500 + a[0];
        for (int i = 1; i < n; i++)
            ans[i][0] = ans[i - 1][0] + a[i];

        for (int kk = 0; kk < c[0]; kk++) {
            ans[0][kk] = a[0] + 1500;
        }
        for (int kk = c[0]; kk <= k; kk++) {
            ans[0][kk] = Math.max(a[0], b[0]) + 1500;
        }


        for (int kk = 1; kk <= k; kk++){
            for (int i = 1; i < n; i++) {
                if (kk - c[i] >= 0) {
                    ans[i][kk] = Math.max(ans[i - 1][kk] + a[i], ans[i-1][kk - c[i]] + b[i]);
                } else {
                    ans[i][kk] = ans[i - 1][kk] + a[i];
                }

            }
        }

        for (int j = 0; j <= k; j++) {
            for(int i = 0; i < n; i++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        int ANS = 0;
        for (int i = 0; i <= k; i++) {
            ANS = Math.max(ANS, ans[n - 1][i]);
        }

        System.out.println(ANS);
    }
}
