package com.littlebean.leetcode.swordoffer;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O06 {
    public int[] reversePrint(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] ans=new int[list.size()];
        for(int i=list.size()-1;i>=0;i--){
            ans[list.size()-1-i]=list.get(i);
        }
        return ans;
    }
}
