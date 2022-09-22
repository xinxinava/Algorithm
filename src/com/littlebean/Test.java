package com.littlebean;

import com.littlebean.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：二分查找
 * 给定一个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * 示例 1:
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 *
 * 示例 2：
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 */

public class Test {
    public ListNode reverseList (ListNode head) {
        // write code here

        ListNode hh=new ListNode(0);

        while (head!=null){
            ListNode p=head.next;
            head.next=hh.next;
            hh.next=head;
            head=p;
        }
        return hh.next;
    }

}

