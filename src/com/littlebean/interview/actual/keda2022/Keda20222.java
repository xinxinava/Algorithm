package com.littlebean.interview.actual.keda2022;

import java.util.Scanner;

public class Keda20222 {
    static class Node{
        int x;
        int y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        Node[] nodes=new Node[N];
        for(int i=0;i<N;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            Node node=new Node(a, b);
            nodes[i]=node;
        }
        int res=0;
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    double a=Math.pow((double) (nodes[i].x-nodes[j].x),2)+Math.pow((double) (nodes[i].y-nodes[j].y),2);
                    double b=Math.pow((double) (nodes[i].x-nodes[k].x),2)+Math.pow((double) (nodes[i].y-nodes[k].y),2);
                    double c=Math.pow((double) (nodes[j].x-nodes[k].x),2)+Math.pow((double) (nodes[j].y-nodes[k].y),2);
                    if((a+b==c)||(a+c==b)||(b+c==a)){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
