package com.littlebean.interview.actual.dji;

import java.util.Arrays;
import java.util.Scanner;

public class Dji2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int nums_size = 0;
        nums_size = in.nextInt();
        int[] nums = new int[nums_size];
        for(int nums_i = 0; nums_i < nums_size; nums_i++) {
            nums[nums_i] = in.nextInt();
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = minimumDeviation(nums);
        System.out.println(String.valueOf(res));

    }
    public static int minimumDeviation(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int minn=nums[n-1]-nums[0];
        if(nums[n-1]%2!=0&&nums[0]%2==0){
            return minn;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            if(nums[i]%2!=0){
                minn=Math.min(minn, nums[i]*2);
            }else {
                minn=Math.min(minn,nums[i]/2);
            }
        }
        return minn;

    }
}
