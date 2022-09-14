package com.littlebean.interview.actual.weizhong;

import java.util.*;

public class WeiZhong1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            str[i]=nums[i]+"";
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o2.compareTo(o1);
                }
                return o2.length()-o1.length();
            }
        });
        String[] temp=new String[3];
        temp[0]=str[0];
        temp[1]=str[1];
        temp[2]=str[2];
        List<String> list=new ArrayList<>();
        List<String> path=new ArrayList<>();
        boolean[] visited=new boolean[n];
        dfs(temp, list, path,visited);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        System.out.println(list.get(0));

    }

    public static void dfs(String[] temp, List<String> list, List<String> path, boolean[] visited){
        if(path.size()==3){
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<path.size();i++){
                sb.append(path.get(i));
            }
            list.add(sb.toString());
            return;
        }
        for(int i=0;i<temp.length;i++){
            if(visited[i]==false){
                visited[i]=true;
                path.add(temp[i]);
                dfs(temp, list, path, visited);
                path.remove(path.size()-1);
                visited[i]=false;
            }
        }
    }
}
