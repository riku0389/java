package com.javaExample;

class BoxOverload {
    double width;
    double height;
    double depth;

    public BoxOverload(BoxOverload ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public BoxOverload(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public BoxOverload() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxOverload(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        BoxOverload myBox1=new BoxOverload(10,20,15);
        BoxOverload myBox2=new BoxOverload();
        BoxOverload myCute=new BoxOverload(7);

        BoxOverload myClone=new BoxOverload(myBox1);

        double vol;
        vol=myBox1.volume();
        System.out.println("Volume of mybox1 is "+vol);
        vol=myBox2.volume();
        System.out.println("Volume of mybox2 is "+vol);

        System.out.println("Volume of myCute is "+myCute.volume());

        System.out.println("Volume of MuClone is "+myClone.volume());

    }
}
