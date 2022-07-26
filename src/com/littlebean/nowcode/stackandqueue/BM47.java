package com.littlebean.nowcode.stackandqueue;

import java.util.Random;

public class BM47 {
    //与快排不同，本题不用全排
    public int findKth(int[] a, int n, int K) {
        // 快速排序，要求时间复杂度 O(nlogn)，空间复杂度 O(1)
        // 向findKth的重载方法中传入第K大元素的索引n-K
        return findKth(a,0,n-1,n-K);
    }
    public int findKth(int[] a,int low,int high,int KIndex){

        int pivot = a[low];      //取待排部分的第一个元素为枢轴值
        int i = low;
        int j = high;
        //一趟快速排序
        while (i < j) {
            while (a[j] >= pivot && i < j) {
                j--;
            }
            while (a[i] <= pivot && i < j) {
                i++;
            }
            if (i < j) {
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        a[low] = a[j];
        a[j] = pivot;

        if (j == KIndex) {
            return a[j];
        }else if (j > KIndex){
            return findKth(a,low,j-1,KIndex);
        }else {
            return findKth(a,j+1,high,KIndex);
        }
    }
}
