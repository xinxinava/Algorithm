package com.littlebean.interview.actual.jd;
import java.util.*;

public class JD2 {
    static Map<Integer, Integer> map;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        int maxn=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
            maxn=Math.max(maxn, nums[i]);
        }
        int[] dp=new int[maxn+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[1]=0;
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=maxn;i++){
            int[] temp=factor(i);
            if(temp[0]==1){
                dp[i]=Math.min(dp[i],1+dp[i-1]);
            }else {
                dp[i]=Math.min(dp[i],1+dp[temp[0]]+dp[temp[1]]);
            }
        }
        long res=0;
        for(int i=0;i<n;i++){
            res+=dp[nums[i]];
        }
        System.out.println(res);

    }

    public static int[] factor(int num){
        int a=1;
        int b=num-1;
        double temp=Math.sqrt(num);
        for(int i=(int)temp;i>=2;i--){
            if(num%i==0){
                a=i;
                b=num/i;
            }
        }
        return new int[]{a,b};
    }

}
