package com.littlebean.interview.practice.baidu20201;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baidu202021 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] res=new int[n+1];
        Node[] nodes=new Node[n+1];
        for(int i=0;i<n+1;i++){
            Node node=new Node();
            nodes[i]=node;
        }
        for(int i=1;i<n;i++){
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            nodes[a].list.add(nodes[b]);
            nodes[b].list.add(nodes[a]);
            nodes[a].num++;
            nodes[b].num++;
        }
        int count=n;
        int time=1;
        while (count>0){
            List<Node> leaveList=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(nodes[i].num<=1&&nodes[i].isDelete==false){
                    res[i]=time;
                    nodes[i].isDelete=true;
                    leaveList.add(nodes[i]);
                    count--;
                }
            }
            for(Node node:leaveList){
                for (Node i: node.list){
                    i.num--;
                }
            }
            time++;
        }
        for(int i=1;i<n;i++){
            System.out.print(res[i]+" ");
        }
        System.out.print(res[n]);
    }
}
class Node{
    List<Node> list=new ArrayList<>();
    int num=0;
    boolean isDelete=false;
}
