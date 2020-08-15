package com.javaExample;

class Persons2{
    String Name;

    public Persons2(String name) {
        Name=name;
    }

    public void work(){
        System.out.print(Name+"是一个测试工程师");
    }
}

class engineer extends Persons2{

    public engineer(String name) {
        super(name);
    }
}


public class extendTest {
    public static void main(String[] args) {
        engineer en=new engineer("王五");
        en.work();
    }
}
