package com.littlebean;

import com.littlebean.util.Interval;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Integer a=127;

//        Integer b=127;
//        Integer c=-127;
//        Integer d=-127;
//        Integer e=228;
//        Integer f=228;
//        Integer x=-228;
//        Integer y=-228;
//        System.out.println(a==b);
//        System.out.println(c==d);
//        System.out.println(e==f);
//        System.out.println(e +" "+f);
//        System.out.println(x==y);
//        System.out.println(1/0);
//        int a=127;
//        int b=127;
//        int c=-127;
//        int d=-127;
//        int e=128;
//        int f=128;
//        int x=-128;
//        int y=-128;
//        System.out.println(a==b);
//        System.out.println(c==d);
//        System.out.println(e==f);
//        System.out.println(e +" "+f);
//        System.out.println(x==y);
//        String a="abc";
//        String b= new String("abc");
//        System.out.println(a+"d"==b+"d");
//        Set set =new HashSet();
//        set.add(a);
//        set.add(b);
//        Iterator iterator=set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        //float f=3.4;会报错，3.4是double类型
//        float f=3.4f;
//        short s1=1;
//        //s1=s1+1不正确，int型不能赋值给short
//        s1+=1;
//        System.out.println(s1);
//
//        Sun sun = new Sun();
//
//        String s="1";
//        if(s=="a") {
//            System.out.println(true);
//        }else {
//            System.out.println(false);
//        }
//        TryTro test=new TryTro();
//        System.out.println(test.tryDemo());
  //      System.out.println(1/0);
        ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();

        Map<Integer, Integer> map=new HashMap<>();
    }
}
class TryTro{
    public int tryDemo(){
        int i=0;
        try{
            i=2;
            return i;
        }catch (Exception e){
            return 2;
        }finally {
            i=3;
        }
    }
}
  class Father{
    public final Integer age=10;
    String name;
    String hight;
    Father(){
        System.out.println("father construct");
    }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Father father = (Father) o;
          return Objects.equals(age, father.age) && Objects.equals(name, father.name) && Objects.equals(hight, father.hight);
      }

      @Override
      public int hashCode() {
          return Objects.hash(age, name, hight);
      }

      public void run(){
        System.out.println("father run");
    }
}

class Child extends Father {
    Child(){
        System.out.println("child construct");
    }
//    public void run(){
//        System.out.println("child run");
//    }
    static {
        System.out.println("child static");
    }
}
class Sun extends Child{
    Sun(){
        System.out.println("Sun Construct");
    }
    static {
        System.out.println("Sun static");
    }
}