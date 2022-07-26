package com.littlebean.nowcode.binarySort;

public class BM20 {
    //变相二分查找，统计合并的次数
    int num;
    int base=1000000007;
    public int InversePairs(int [] array) {
        num=0;
        int[] temp=new int[array.length];
        mergeSort(array,temp, 0, array.length-1);
        return num;
    }

    public void mergeSort(int[] array, int[] temp, int left, int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(array, temp, left, mid);
        mergeSort(array, temp, mid+1, right);
        merge(array, temp, left, right, mid);
    }


    public void merge(int[] array, int[] temp, int left, int right, int mid){
        int i=left, j=mid+1, t=0;
        while (i<=mid&&j<=right){
            if(array[i]<array[j]){
                temp[t++]=array[i++];
            }else {
                temp[t++]=array[j++];
                //左边有序，右边有序，相当右边的第一个到第i个是逆序
                num=(num+mid-i+1)%base;
            }
        }
        while (i<=mid){
            temp[t++]=array[i++];
        }
        while (j<=right){
            temp[t++]=array[j++];
        }
        t=0;
        while (left<=right){
            array[left++]=temp[t++];
        }
    }
}
