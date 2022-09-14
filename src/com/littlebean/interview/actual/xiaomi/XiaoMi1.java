package com.littlebean.interview.actual.xiaomi;


import java.util.Scanner;

public class XiaoMi1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode<Integer> res = null;

        int head_size = 0;
        head_size = in.nextInt();
        ListNode<Integer> head = null, head_curr = null;
        for(int head_i = 0; head_i < head_size; head_i++) {
            int head_item = in.nextInt();
            ListNode<Integer> head_temp = new ListNode<Integer>();
            head_temp.data = head_item;
            head_temp.next = null;

            if (head == null) {
                head = head_curr = head_temp;
            } else {
                head_curr.next = head_temp;
                head_curr = head_temp;
            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        int left;
        left = Integer.parseInt(in.nextLine().trim());

        int right;
        right = Integer.parseInt(in.nextLine().trim());

        res = reverseBetween(head, left, right);
        while (res != null) {
            System.out.print(String.valueOf(res.data) + " ");
            res = res.next;
        }
        System.out.println();

    }

    public static ListNode<Integer> reverseBetween(ListNode<Integer> head, int left, int right) {
        ListNode<Integer> hh=new ListNode<>();
        hh.next=head;
        ListNode<Integer> pre=hh, p=head;
        int count=1;
        while (p!=null&&count<left){
      //      System.out.println(count+" "+ p.data);
            p=p.next;
            pre=pre.next;
            count++;
        }
        pre.next=null;
        ListNode<Integer> cur=p.next;
        while (p!=null&&count<=right){
        //    System.out.println(1111);
       //     System.out.println(count+" "+ p.data);
            cur=p.next;
            p.next=pre.next;
            pre.next=p;
            p=cur;
            count++;
        }
        while (pre.next!=null){
            pre=pre.next;
        }
        pre.next=cur;
        return hh.next;
    }
}
class ListNode<T> {
    public T data;
    public ListNode next;
}
