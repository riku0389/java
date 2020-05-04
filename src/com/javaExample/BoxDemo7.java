package com.javaExample;

class Box7 {
    double width;
    double height;
    double depth;

    public Box7(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        //get volume of second box
        System.out.println("Volume is " + mybox2.volume());
    }
}
