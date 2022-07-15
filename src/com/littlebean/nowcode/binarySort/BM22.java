package com.littlebean.nowcode.binarySort;

public class BM22 {
    public int compare (String version1, String version2) {
        // write code here
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
        for(int i=0,j=0;i<arr1.length||j<arr2.length;i++,j++){
            int val1=(i<arr1.length?Integer.parseInt(arr1[i]):0);
            int val2=(j<arr2.length?Integer.parseInt(arr2[j]):0);
            if(val1>val2){
                return 1;
            }
            else if(val1<val2) {
                return -1;
            }
        }
        return 0;
    }
}
