package com.littlebean.interview.actual.zoom2022;

import java.util.Scanner;

public class zoom1 {
    private static int dfs(int n, short[][] maps, char[] points, boolean[] vis, int cur, int red, int blue) {
        if (points[cur] == 'R')
            red += 1;

        if (points[cur] == 'B')
            blue += 1;

        int ans = Math.abs(red - blue);

        for (int i = 0; i < n; i++)
            if (maps[cur][i] == 1 && !vis[i]) {
                vis[i] = true;
                ans += dfs(n, maps, points, vis, i, red, blue);
            }

        if (points[cur] == 'R')
            red -= 1;

        if (points[cur] == 'B')
            blue -= 1;

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String s=scanner.nextLine();
        char[] points=s.toCharArray();
        short[][] maps=new short[n][n];
        boolean[] visited = new boolean[n];


        for(int i=0;i<n - 1;i++){
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            maps[x][y] = 1;
            maps[y][x] = 1;
        }

        visited[0] = true;
        System.out.println(dfs(n, maps, points, visited, 0, 0, 0));
    }
}
