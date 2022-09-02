package com.littlebean.interview.actual.oppo;

import java.util.Arrays;

public class Oppo1 {
    public int maxDigit (int[] digits) {
        // write code here
        Arrays.sort(digits);
        int num=0;
        for(int i=digits.length-1;i>=0;i--){
            num=num*10+digits[i];
        }
        return num;
    }
}
