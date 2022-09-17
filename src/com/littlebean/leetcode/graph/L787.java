package com.littlebean.leetcode.graph;

import java.util.*;

public class L787 {
    //最小生成树 dfs超时，使用bfs
    int minn = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<Node>[] lists = new List[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int i = 0; i < flights.length; i++) {
            lists[flights[i][0]].add(new Node(flights[i][1], flights[i][2]));
        }

        boolean[] visited = new boolean[n];
        visited[src] = true;
        dfs(lists, visited, src, dst, k, 0, -1);
        if (minn == Integer.MAX_VALUE)
            return -1;
        return minn;
    }

    public void dfs(List<Node>[] lists, boolean[] visited, int src, int dst, int k, int sum, int count) {
        if (count > k) {
            return;
        }
        if (count <= k && src == dst) {
            minn = Math.min(minn, sum);
        }

        for (int i = 0; i < lists[src].size(); i++) {
            Node next = lists[src].get(i);
            if (visited[next.end] == false) {
                visited[next.end] = true;
                sum += next.weight;
                count += 1;
                dfs(lists, visited, next.end, dst, k, sum, count);
                count -= 1;
                sum -= next.weight;
                visited[next.end] = false;
            }
        }
    }

    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int k) {
        Queue<int[]> queue = new LinkedList<>();
        List<Node>[] lists = new List[n];
        for (int i = 0; i < n; i++) {
            lists[i] = new ArrayList<>();
        }
        for (int[] flight : flights) {
            lists[flight[0]].add(new Node(flight[1], flight[2]));
        }

        int[] price = new int[n];
        Arrays.fill(price, Integer.MAX_VALUE);
        price[src] = 0;
        queue.add(new int[]{src, 0, 0}); //{当前节点， 当前数量，当前价格}
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur[1] > k) {
                break;
            }
            for (Node next : lists[cur[0]]) {
                if (price[next.end] > cur[2] + next.weight) {
                    price[next.end] = cur[2] + next.weight;
                    queue.add(new int[]{next.end, cur[1] + 1, price[next.end]});
                }
            }
        }
        if (price[dst] == Integer.MAX_VALUE)
            return -1;
        return price[dst];
    }

    public int findCheapestPrice3(int n, int[][] flights, int src, int dst, int k) {
        int[] f = new int[n];
        int inf = 10000 * 101 + 1;
        Arrays.fill(f, inf);
        f[src] = 0;
        int ans = inf;
        for (int t = 0; t <= k; t++) {
            int[] g = new int[n];
            Arrays.fill(g, inf);
            for (int[] flight : flights) {
                g[flight[1]] = Math.min(g[flight[1]], f[flight[0]] + flight[2]);
            }
            f = g;
            ans = Math.min(ans, f[dst]);
        }
        return ans == inf ? -1 : ans;
    }
}

class Node{
    int end;
    int weight;
    Node(){}
    Node(int end, int weight){
        this.end=end;
        this.weight=weight;
    }
}