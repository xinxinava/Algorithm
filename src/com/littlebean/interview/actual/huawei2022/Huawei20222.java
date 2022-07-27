package com.littlebean.interview.actual.huawei2022;

import java.util.Arrays;
import java.util.Scanner;

public class Huawei20222 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=9;
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=scanner.nextInt();

        Arrays.sort(nums);
        int[] res=new int[n];
        boolean[] visited=new boolean[n];
        dfs(nums, res, visited, 0);
    }
    public static void dfs(int[] nums, int[] res, boolean[] visited, int idx){
        if (idx >= 9) {
            //check
            if(!checked(res)){
                return;
            }

            // output
            for (int i = 0; i < 8; i++){
                System.out.print(res[i] + " ");
            }
            System.out.println(res[8]);
            return;
        }

        for(int i=0;i<9;i++){
            if(!visited[i]){
                visited[i]=true;
                res[idx]=nums[i];
                dfs(nums, res,visited,idx+1);
                visited[i]=false;
            }
        }
    }
    public static boolean checked(int[] res){
        double[] check=new double[8];

        // 0 1 2
        // 3 4 5
        // 6 7 8
        check[0] = res[0] * res[1] * res[2];
        check[1] = res[3] * res[4] * res[5];
        check[2] = res[6] * res[7] * res[8];
        check[3] = res[0] * res[3] * res[6];
        check[4] = res[1] * res[4] * res[7];
        check[5] = res[2] * res[5] * res[8];
        check[6] = res[0] * res[4] * res[8];
        check[7] = res[2] * res[4] * res[6];
        for(int i=1;i<8;i++){
            if(check[i]!=check[0])
                return false;
        }
        return true;
    }
}
