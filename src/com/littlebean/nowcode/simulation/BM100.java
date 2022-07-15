package com.littlebean.nowcode.simulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BM100 {

    public HashMap<Integer,Node> map;
    public DoubleLinkedList doubleLinkedList;
    public int capacity;

    public BM100(int capacity) {
        map = new HashMap<>();
        doubleLinkedList = new DoubleLinkedList();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        int value = map.get(key).val;
        set(key,value);
        return value;
    }

    public void set(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(key)) doubleLinkedList.delete(map.get(key));//覆盖
        else if(map.size() == capacity) map.remove(doubleLinkedList.deleteLast());//新增
        doubleLinkedList.addFirst(node);
        map.put(key,node);
    }

}
class Node{
    public int key;
    public int val;
    public Node next;
    public Node prev;

    public Node(int key,int val){
        this.key = key;
        this.val = val;
    }
}

class DoubleLinkedList{
    public Node head;
    public Node tail;

    public DoubleLinkedList(){
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public void addFirst(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public int delete(Node node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
        return node.key;
    }

    public int deleteLast(){
        if(tail.prev == head) return -1;
        return delete(tail.prev);
    }
}
