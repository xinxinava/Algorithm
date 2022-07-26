package com.littlebean.nowcode.doublepointer;

public class BM87 {
    //从后往前排序，A后n个是空的，可以不用移动元素，不会出现覆盖
    public void merge(int A[], int m, int B[], int n) {
        int i=m-1, j=n-1;
        int idx=m+n-1;
        while (i>=0&&j>=0){
            if(A[i]>B[j]){
                A[idx--]=A[i--];
            }else {
                A[idx--]=B[j--];
            }
        }
        while (j>=0){
            A[idx--]=B[j--];
        }
    }
}
