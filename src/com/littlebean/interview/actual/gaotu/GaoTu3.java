package com.littlebean.interview.actual.gaotu;

import java.util.Scanner;

public class GaoTu3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String[] str=s.split(" ");
        String str1=str[0];
        String str2=str[1];
        if("0".equals(str1)||"0".equals(str2)){
            System.out.println(0);
            return;
        }
        int[] res=new int[str1.length()+str2.length()];
        for(int i=str1.length()-1;i>=0;i--){
            for(int j=str2.length()-1;j>=0;j--){
                int sum=(str1.charAt(i)-'0')*(str2.charAt(j)-'0');
                sum+=res[i+j+1];
                res[i+j+1]=sum%10;
                res[i+j]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<res.length;i++){
            if(sb.length()==0&&res[i]==0)
                continue;
            sb.append(res[i]);
        }
        String ss=sb.length()==0?"0":sb.toString();
        System.out.println(ss);
    }
}
