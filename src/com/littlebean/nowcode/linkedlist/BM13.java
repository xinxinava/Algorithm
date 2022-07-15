package com.littlebean.nowcode.linkedlist;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class BM13 {
    public boolean isPail (ListNode head) {
        // write code here
        List<Integer> list=new ArrayList<>();
        ListNode p=head;
        while (p!=null){
            list.add(p.val);
            p=p.next;
        }
        for(int left=0,right=list.size()-1;left<right;left++,right--){
            //这里用.equals判断，用双等号不行，
            // “==”比较两个变量本身的值，即两个对象在内存中的首地址。
            //“equals()”比较字符串中所包含的内容是否相同。
            if(!list.get(left).equals(list.get(right)))
                return false;
        }
        return true;
    }
}
