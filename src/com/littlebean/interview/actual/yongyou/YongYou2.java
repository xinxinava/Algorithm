package com.littlebean.interview.actual.yongyou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YongYou2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<String> list=new ArrayList<>();
        int len=0;

        while (scanner.hasNextLine()){
            String s=scanner.nextLine();
            String[] temp=s.split(",");
            len=temp.length;
            list.add(s);
            System.out.println(s);
        }

        int[][] nums=new int[list.size()][len];
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            String[] temp=s.split(",");
            for(int j=0;j<temp.length;j++){
                nums[i][j]=Integer.parseInt(temp[j]);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(maxArea(nums));

    }
    public static int maxArea(int[][] nums){
        int maxn=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                maxn=Math.max(maxn, dfs(nums, i, j));
            }
        }
        return maxn;
    }

    public static int dfs(int[][] nums, int x, int y){
        if(x<=0||x==nums.length||y==0||y==nums[0].length){
            return 0;
        }
        if(nums[x][y]==1){
            nums[x][y]=0;
            return 1+dfs(nums, x+1, y) + dfs(nums, x-1, y)+dfs(nums, x, y+1)+dfs(nums,x, y-1);
        }
        return 0;
    }
}
