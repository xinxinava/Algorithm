package com.littlebean.interview.actual.huawei2022;

import java.util.Scanner;

public class Huawei20223 {
//5 5 2
//1 2 10
//2 3 3
//3 4 50
//5 4 7
//1 5 100
//2 3
//4 5
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int t=scanner.nextInt();
        int [][]cost = new int[n][n];
        int [][]must = new int[n][n];
        int []dis = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            dis[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < m; i++){
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            cost[x][y] = cost[y][x] = scanner.nextInt();
        }

        for(int i=0;i<t;i++){
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            must[x][y] = must[y][x] = 1;
            ans += cost[x][y];
            cost[x][y] = cost[y][x] = 0;
        }

        dis[0] = 0;
        for (int i = 0; i < n; i++) {
            if (dis[i] == 0) {
                for (int j = 0; j < n; j++) {
                    if (cost[i][j] != 0) {
                        dis[j] = Math.min(dis[j], cost[i][j]);
                    }
                }
            }
        }

        for (int k = t + 1; k < n; k++) {
            for(int i = 0; i < n; i++) {
                System.out.print(dis[i] + " ");
            }
            System.out.println("k = " + k);

            int next = -1;
            for (int i = 1; i < n; i++){
                if (dis[i] != 0) {
                    if (next < 0 || dis[next] > dis[i]) {
                        next = i;
                    }
                }
            }

            if (next == -1 || dis[next] == Integer.MIN_VALUE) {
                ans = -1;
                break;
            }

            System.out.println("next = " + next);

            ans += dis[next];
            dis[next] = 0;
            for (int kk = 0; kk < n; kk++) {
                if (must[next][kk] == 1) {
                    System.out.println("must to " + kk);
                    dis[kk] = 0;

                    for (int i = 0; i < n; i++) {
                        if (dis[i] != 0) {
                            dis[i] = Math.min(dis[i], cost[kk][i]);
                        }
                    }
                }
            }

            System.out.println("after must");
            for(int i = 0; i < n; i++) {
                System.out.print(dis[i] + " ");
            }
            System.out.println("k = " + k);


            for (int i = 0; i < n; i++) {
                if (dis[i] != 0 && cost[next][i]!=0) {
                    dis[i] = Math.min(dis[i], cost[next][i]);
                }
            }
        }


        System.out.println(ans);
    }
}
