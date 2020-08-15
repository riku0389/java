package com.javaExample;

class Persons{
    String Name;
    public Persons() {
        System.out.println("我是一个无参数的构造方法");
    }

    public Persons(String name) {
        System.out.print("我的名字是："+name);
    }
}
public class contruct {
    public static void main(String[] args) {
        Persons p1=new Persons();
        Persons p2=new Persons("张三");
    }
}
