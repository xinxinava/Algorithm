package com.littlebean.nowcode.binarySort;

public class BM18 {
    //Z字形查找，以array[x][y]为右上角，矩阵左下角为左下角
    public boolean Find(int target, int [][] array) {
        int x=0,y=array[0].length-1;
        while (x<array.length&&y>=0){
            if(target==array[x][y]){
                return true;
            }else if(target>array[x][y]){
                x++;
            }else {
                y--;
            }
        }
        return false;
    }
}
