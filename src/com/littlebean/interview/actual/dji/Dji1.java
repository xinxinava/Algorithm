package com.littlebean.interview.actual.dji;

import java.util.Scanner;

public class Dji1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int timePoints_size = 0;
        timePoints_size = in.nextInt();
        if (in.hasNextLine())
            in.nextLine();
        String[] timePoints = new String[timePoints_size];
        String timePoints_item;
        for(int timePoints_i = 0; timePoints_i < timePoints_size; timePoints_i++) {
            try {
                timePoints_item = in.nextLine();
            } catch (Exception e) {
                timePoints_item = null;
            }
            timePoints[timePoints_i] = timePoints_item;
        }

        res = findMinDifference(timePoints);
        System.out.println(String.valueOf(res));

    }
    public static int findMinDifference(String[] timePoints) {
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<timePoints.length;i++){
            String[] time1=timePoints[i].split(":");
            int shi1=Integer.parseInt(time1[0]);
            int fen1=Integer.parseInt(time1[1]);
            for(int j=i+1;j<timePoints.length;j++){
                String[] time2=timePoints[j].split(":");
                int shi2=Integer.parseInt(time2[0]);
                int fen2=Integer.parseInt(time2[1]);
                int time=0;
                if(shi1>shi2){
                    time+=(shi1-shi2)*60+(fen1-fen2);
                }else if(shi1<shi2) {
                    time+=(shi2-shi1)*60+(fen2-fen1);
                }else {
                    time+=Math.abs(fen1-fen2);
                }
                minn=Math.min(minn,Math.min(time,60*24-time));
            //    System.out.println(shi1+" "+fen1+" "+shi2+" "+fen2+" "+minn);
            }
        }
        return minn;
    }

}

