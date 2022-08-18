package com.littlebean.leetcode.other;

import com.littlebean.util.Interval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GStraight {
    /**
     * 树的直径
     * @param n int整型 树的节点个数
     * @param Tree_edge Interval类一维数组 树的边
     * @param Edge_value int整型一维数组 边的权值
     * @return int整型
     */

    /**
     * 1. 首先，根据父子关系及边权重构建无向图；
     * 2. 然后，随机找一顶点，利用深度优先搜索找到距离该点最远的顶点remote。
     * 3. 最后，从remote顶点开始深度优先搜索找到最长路径，该路径即为直径。
     * @param n
     * @param Tree_edge
     * @param Edge_value
     * @return
     */
    public int solve (int n, Interval[] Tree_edge, int[] Edge_value) {
        // write code here
        if(Tree_edge == null || Edge_value == null || Tree_edge.length == 0 || Edge_value.length == 0){
            return 0;
        }

        //构造图
        Map<Integer, List<Edge>> graph = new HashMap<>();
        int len = Tree_edge.length;
        for(int i = 0; i < len; i++){
            int start = Tree_edge[i].start;
            int end = Tree_edge[i].end;
            int weight = Edge_value[i];
            Edge e1 = new Edge(end, weight);
            if(!graph.containsKey(start)){
                List<Edge> temp = new ArrayList<>();
                graph.put(start, temp);
            }
            graph.get(start).add(e1);
            Edge e2 = new Edge(start, weight);
            if(!graph.containsKey(end)){
                List<Edge> temp = new ArrayList<>();
                graph.put(end, temp);
            }
            graph.get(end).add(e2);
        }

        int[] remote={0, 0}; // remote[0] 代表以0为起点的最长路径长度， remote[1]代表最长路径的终点
        dfs(graph, 0, -1, 0, remote);
        int[] res={0, 0};  // res[0] 代表以0为起点的最长路径长度， res[1]代表最长路径的终点
        dfs(graph, remote[1], -1, 0, res);
        return res[0];
    }

    public void dfs(Map<Integer, List<Edge>> graph, int from, int prev, int path, int[] res){
        List<Edge> edges=graph.get(from);
        for(Edge edge: edges){
            if(edge.end != prev){
                path += edge.weight;
                if(path > res[0]){
                    res[0] = path;
                    res[1] = edge.end;
                }
                dfs(graph, edge.end, from, path, res);
                path -= edge.weight;
            }
        }
    }
}

class Edge{
    int end;
    int weight;
    Edge(int end, int weight){
        this.end=end;
        this.weight=weight;
    }
}
