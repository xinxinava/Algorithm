package com.littlebean.nowcode.binarySort;

public class BM21 {
    public int minNumberInRotateArray(int [] array) {
//        int res=array[0];
//        for(int i=1;i<array.length;i++){
//            if(array[i]<res){
//                return array[i];
//            }
//            else{
//                res=array[i];
//            }
//        }
//        return array[0];

        int left=0, right=array.length-1;
        while (left<right){
            int mid=(left+right)/2;
            if(array[mid]>array[right]){
                left=mid+1;
            }else if(array[mid]<array[right]){
                right=mid;
            }else {
                right--;
            }
        }
        return array[left];
    }
}
