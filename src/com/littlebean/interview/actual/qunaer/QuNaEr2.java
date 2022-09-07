package com.littlebean.interview.actual.qunaer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QuNaEr2 {
    public static void main(String[] args) {
        System.out.println(Decrypt(4296,1601,4757));
    }
    public static int Decrypt (int encryptedNumber, int decryption, int number) {
        // write code here
        List<Integer> list=new ArrayList<>();
        while (decryption>0){
            list.add(decryption%10);
            decryption=decryption/10;
        }

        int[] nums=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            nums[list.size()-i-1]=list.get(i);
        }

       return superPow(encryptedNumber, nums, number);

    }
    public static int superPow(int a, int[] b, int number){
        int ans=1;
        for(int i=b.length-1;i>=0;i--){
            ans=(int)((long)ans*pow(a,b[i],number)%number);
            a=pow(a,10,number);
        }
        return ans;
    }
    public static int pow(int x, int n, int number){
        int res=1;
        while (n!=0){
            if(n%2!=0){
                res=(int)((long)(res*x%number));
            }
            x=(int)((long)x*x%number);
            n=n/2;
        }
        return res;
    }
}
