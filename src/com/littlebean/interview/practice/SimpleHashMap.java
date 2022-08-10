package com.littlebean.interview.practice;

public class SimpleHashMap<K,V> {
    class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    final Integer DEFAULT_CAPACITY=16;
    final Double LOAD_FACTOR=0.75;
    private int size;
    Node<K,V>[] buckets;

    public SimpleHashMap(){
        buckets=new Node[DEFAULT_CAPACITY];
        size=0;
    }

    public SimpleHashMap(int capacity){
        buckets=new Node[capacity];
        size=0;
    }

    private int getIndex(K key, int length){
        int hashCode=key.hashCode();
        int index=hashCode%length;
        return Math.abs(index);
    }

    public void put(K key, V value){
        if(size>=buckets.length*LOAD_FACTOR){
            resize();
        }
        putVal(key, value, buckets);
    }

    private void putVal(K key, V value, Node<K, V>[] table){
        int index=getIndex(key, table.length);
        Node<K, V> node = table[index];
        if(node==null){
            table[index]=new Node<>(key, value);
            size++;
            return;
        }
        while (node!=null){
            if((node.key.hashCode()==key.hashCode())&&(node.key==key||node.key.equals(key))){
                node.value=value;
                return;
            }
            node=node.next;
        }
        Node newNode=new Node(key, value, table[index]);
        table[index]=newNode;
        size++;
    }

    private void resize(){
        Node<K,V>[] newBuckets=new Node[buckets.length*2];
        reHash(newBuckets);
        buckets=newBuckets;
    }
    private void reHash(Node<K, V>[] newBuckets){
        size=0;
        for(int i=0;i<buckets.length;i++){
            if(buckets[i]==null){
                continue;
            }
            Node<K, V> node=buckets[i];
            while (node!=null){
                putVal(node.key, node.value, newBuckets);
                node=node.next;
            }
        }
    }

    public V get(K key){
        int index=getIndex(key, buckets.length);
        if (buckets[index] == null) {
            return null;
        }
        Node<K, V> node=buckets[index];
        while (node!=null){
            if((node.key.hashCode()==key.hashCode())&&(node.key==key||node.key.equals(key))){
                return node.value;
            }
            node=node.next;
        }
        return null;
    }

    public int size(){
        return size;
    }
}

class SimpleTest{
    public static void main(String[] args) {
        SimpleHashMap map = new SimpleHashMap();
        map.put("刘华强1","哥们，你这瓜保熟吗？");
        map.put("刘华强1","你这瓜熟我肯定要啊！");
        System.out.println(map.get("刘华强1"));
    }


    void test1() {
        SimpleHashMap map = new SimpleHashMap();
        map.put("刘华强1","哥们，你这瓜保熟吗？");
        map.put("刘华强1","你这瓜熟我肯定要啊！");
        System.out.println(map.get("刘华强1"));
    }
}
