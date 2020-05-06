package com.javaExample;

class person {
    String name;
    int age;
    boolean worker;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public person() {
        System.out.print("My name is ");
    }

    void say() {
        System.out.println("Person can say!");
    }

}

class man extends person {
    String names;
    public man() {
        super();
    }

    man(man m){
        m.names = names;
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        man MyMan = new man();
        MyMan.setName("lisi");
        System.out.println(MyMan.getName());
        MyMan.say();

    }
}
