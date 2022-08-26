package com.littlebean.interview.actual.qianxin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QiAnXin2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while (scanner.hasNextInt()){
            int temp=scanner.nextInt();
       //     System.out.println(temp);
            list.add(temp);
        }
        int maxa=0, left=0, right=list.size()-1;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
              //  int area=Math.abs(i-j)*Math.max(list.get(i), list.get(j));
                int area=((list.get(i)+list.get(j))*Math.abs(i-j))/2;
                maxa=Math.max(maxa, area);
            }
        }
//        while (left<right){
//            int area=Math.abs(left-right)*Math.min(list.get(left),list.get(right));
//            maxa=Math.max(maxa, area);
//            if(list.get(left)<list.get(right)){
//                left++;
//            }else if(list.get(left)>list.get(right)){
//                right--;
//            }else {
//                left++;
//                right--;
//            }
//        }
        System.out.println(maxa);
    }
}
