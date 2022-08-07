package com.littlebean.interview.actual.mihay2022;

import java.util.Scanner;

public class Mihay1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int[] vpower=new int[4];
            int[] kpower=new int[4];
            for(int j=0;j<4;j++)
                vpower[j]=scanner.nextInt();
            for(int j=0;j<4;j++)
                kpower[j]=scanner.nextInt();
            if(win(vpower, kpower)){
                System.out.println("I love V2V forever!");
            }else {
                System.out.println("Kalpas yame te!");
            }
        }
    }

    public static boolean win(int[] vpower, int[] kpower){
        int cur=-1;//cur为正数 k攻击,cur为偶数 v攻击， cur为k的攻击次数
        if(vpower[3]>kpower[3]){
            cur=1;
        }
        int vcount=0;
        int kcount=0;
        boolean huo=true;
        while (vpower[0]>0&&kpower[0]>0){
            if(vpower[0]<31&&huo==true){//大变活人
                vpower[0]+=20;
                kpower[0]+=20;
                vpower[1]+=15;
                huo=false;
            }
            int temp=kpower[0];
            if(cur>0){
                kpower[0]-=Math.max(vpower[1]-kpower[2],0);//V 普通攻击

                if((vcount+1)%3==0){
                    kpower[0]-=Math.max(kpower[1]-kpower[2],0); //V主动 创造力
                }
                vcount++;
                cur--;
            }else {
                vpower[0]-=Math.max(kpower[1]-vpower[2],0); //普通攻击
                kpower[1]+=Math.floor((temp-kpower[0])/5); //K 被动技能解除封印,自身行动时触发
                if((kcount+1)%3==0&&kpower[0]>=11){ //主动技能
                    kpower[0]-=10;
                    vpower[0]=vpower[0]-Math.max(45-vpower[2],0)-20;
                    cur++;
                }
                kcount++;
                cur++;
            }
            for(int i=0;i<4;i++){
                System.out.print(vpower[i]+" ");
            }
            System.out.println();
            for (int i=0;i<4;i++){
                System.out.print(kpower[i]+" ");
            }
            System.out.println();
        }

        if(vpower[0]>0)
            return true;
        return false;
    }
}
