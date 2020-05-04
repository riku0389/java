package com.javaExample;

class Box6 {
    double width;
    double height;
    double depth;

    public Box6() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();

        double vol;

        //get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        System.out.println("Volume is  " + myBox2.volume());
    }
}
