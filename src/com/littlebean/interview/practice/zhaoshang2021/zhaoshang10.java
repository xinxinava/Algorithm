package com.littlebean.interview.practice.zhaoshang2021;

import java.util.Scanner;

public class zhaoshang10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String s=scanner.nextLine();
            if(isPalindrome(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPalindrome(String s){
        if(s.length()==0){
            return true;
        }
        //仔细审题，这和平时的回文数意思并不相同，要逆序镜像对应，中间数据和长度为1但不为“1”为false
        if((s.length()%2!=0&&s.charAt(s.length()/2)!='1')){
            return false;
        }
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)=='1'&&s.charAt(j)=='1'){
                continue;
            }
            if((s.charAt(i)=='2'&&s.charAt(j)=='5')||(s.charAt(i)=='5'&&s.charAt(j)=='2')){
                continue;
            }
            if((s.charAt(i)=='3'&&s.charAt(j)=='8')||(s.charAt(i)=='8'&&s.charAt(j)=='3')){
                continue;
            }
            if((s.charAt(i)=='4'&&s.charAt(j)=='7')||(s.charAt(i)=='7'&&s.charAt(j)=='4')){
                continue;
            }
            if((s.charAt(i)=='6'&&s.charAt(j)=='9')||(s.charAt(i)=='9'&&s.charAt(j)=='6')){
                continue;
            }
            return false;
        }
        return true;
    }
}
