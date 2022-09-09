package com.littlebean.interview.actual.yongyou;

import java.util.Scanner;

public class YongYou3 {
    public static void main(String[] args) {

        int [] heights={50, 30, 80, 30, 27, 57};
        int[] ans=findBuilding(heights);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] findBuilding (int[] heights) {
        // write code here

        int[] ans=new int[heights.length];

        for(int i=0;i<heights.length;i++){
            int count=1;

            if(i!=0) {
                count++;
                int cur = heights[i - 1];
                for (int j = i - 2; j >= 0; j--) {
                    if (heights[j] >= cur) {
                        count++;
                        cur = heights[j];
                    }
                }
            }

            if(i!=heights.length-1) {
                count++;
                int cur = heights[i + 1];
                for (int j = i + 2; j < heights.length; j++) {
                    if (heights[j] >= cur) {
                        count++;
                        cur = heights[j];
                    }
                }
            }

            ans[i]=count;
        }
        return ans;
    }
}
