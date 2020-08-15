package com.javaExample;

class Person {
    String Name;
    int Age;
    String Sex;

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }
}

public class classPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("zhangsan");
        p.setAge(20);
        p.setSex("男");

        System.out.print(p.getName() +","+ p.getAge()+"," + p.getSex());
    }
}

